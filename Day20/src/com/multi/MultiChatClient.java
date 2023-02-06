package com.multi;

import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultiChatClient implements ActionListener, Runnable {
		
	private String ip; 		// 서버 IP
	private String id;  		// 로그인/로그아웃
	private Socket socket;	
	
	// 입출력 스트림
	private BufferedReader inMsg = null;
	private PrintWriter outMsg = null;
	
	// 로그인 패널
	private JPanel loginPanel;
	private JButton loginButton;
	private JLabel label1;
	private JTextField idInput;
	
	// 로그아웃 패널
	private JPanel logoutPanel;
	private JButton logoutButton;
	private JLabel label2;
	
	// 메시지 입력 패널
	private JPanel msgPanel;
	private JTextField msgInput;
	
	// 종료버튼
	private JButton exitButton;
	
	// 메인 프레임 
	private JFrame jframe;
	
	// 채팅 내용출력창
	private JTextArea msgOut;
	
	// 카드 레이아웃
	private Container tab;
	private CardLayout clayout;
	private Thread thread;
	
	// while문 돌릴 boolean 변수
	boolean status;
	
	
	public MultiChatClient(String ip) {
		
		this.ip = ip;
		
		loginPanel = new JPanel();
		
		loginPanel.setLayout(new BorderLayout());
		idInput = new JTextField(15);
		loginButton = new JButton("로그인");
		
		label1 = new JLabel("대화명");
		
		loginPanel.add(label1, BorderLayout.WEST);
		loginPanel.add(idInput, BorderLayout.CENTER);
		loginPanel.add(loginButton, BorderLayout.EAST);
		
		logoutPanel = new JPanel();
		
		logoutPanel.setLayout(new BorderLayout());
		logoutButton = new JButton("로그아웃");
		
		label2 = new JLabel();
		
		logoutPanel.add(label2, BorderLayout.CENTER);
		logoutPanel.add(logoutButton, BorderLayout.EAST);
		
		msgPanel = new JPanel();
		msgPanel.setLayout(new BorderLayout());
		msgInput = new JTextField(30);
		
		exitButton = new JButton("종료");
		
		msgPanel.add(msgInput, BorderLayout.CENTER);
		msgPanel.add(exitButton, BorderLayout.EAST);
		
		// 로그인/로그아웃 패널을 선택하기 위한 카드레이아웃 패널 구성
		tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
		tab.add(loginPanel, "login");
		tab.add(logoutPanel, "logout");
		
		// 메인 프레임 구성
		jframe = new JFrame("::멀티챗::");
		msgOut = new JTextArea("", 10, 30);
		msgOut.setEditable(false);
		
		JScrollPane jsp = new JScrollPane(msgOut, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, // 수직 스크롤바 값(always 항상 보이기)
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // 가로 스크롤바 값(never 값 늘어날 때만 보이기)
		
		
		jframe.add(tab, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		jframe.add(msgPanel, BorderLayout.SOUTH);
		
		// 로그인 패널을 먼저 표시
		clayout.show(tab, "login");
		jframe.pack();
		// 프레임 크기 조정 불가
		jframe.setResizable(false);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		exitButton.addActionListener(this);
		loginButton.addActionListener(this);
		logoutButton.addActionListener(this);
		msgInput.addActionListener(this);
	}
	
	public void connectServer() {
		
		try {
			// 소켓 생성
			socket = new Socket(ip, 6000);
			System.out.println("[Client]Server 연결 성공이닷 !!!!!");
			
			inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outMsg = new PrintWriter(socket.getOutputStream(), true);
			
			// 서버에 메시지 전달
			outMsg.println(id+"/"+"login");
			thread = new Thread(this);
			thread.start();
			
		}catch(Exception e) {
			System.out.println("[MultiChatClient]connectServer() Exception 발생");
		}
		
		
	}
	
	@Override
	public void run() {

		// 수신된 메시지를 처리하는 변수
		String msg;
		String[] rmsg;
		
		status = true;
		while(status) {
			
			try {
				
				// 메시지 수신과 파싱
				msg = inMsg.readLine();
				rmsg = msg.split("/");
				
				// JTextArea 에 수신된 메시지를 추가함
				msgOut.append(rmsg[0]+">"+rmsg[1]+"\n");
				
				// 커서를 현재 대화 메시지에 표시함
				msgOut.setCaretPosition(msgOut.getDocument().getLength()); 
				
			}catch(IOException e) {
				status = false;
			}
		}
		
		System.out.println("[MultiChatClient]" + thread.getName()+"종료되었습니다.");
		
	}

	// 이벤트 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object obj = e.getSource();
		
		
		
		
		if(obj == exitButton) {
			System.exit(0);
		}else if(obj == loginButton) {
			id = idInput.getText();
			label2.setText("대화명: "+id);
			clayout.show(tab, "logout");
			connectServer();
		}else if(obj == logoutButton) {
			outMsg.println(id+"/"+"logout");
			msgOut.setText("");
			clayout.show(tab, "login");
			outMsg.close();
			try {
				inMsg.close();
				socket.close();
			}catch(IOException io) {
				io.printStackTrace();
			}
			
			status = false;
			
		}else if(obj == msgInput) {
			// 메시지를 전송하고
			outMsg.println(id+"/"+msgInput.getText());
			// 메시지 입력창을 초기화(클리어시킴)
			msgInput.setText("");
		}
		
	}

	public static void main(String[] args) {

		new MultiChatClient("192.168.0.113");
		
	}

}
