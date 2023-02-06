package com.chat;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import javax.swing.event.*;

import com.multi.MultiClient;

public class Chat extends JFrame implements ActionListener{

	// 채팅 전체 프레임
	private JFrame allwindow = new JFrame("::멀티채팅::");
	
	
	// 대화명 / 로그인 창
	private JPanel log = new JPanel();
	private JTextField logtext = new JTextField(20);
	private JButton login = new JButton("로그인");
	private JLabel loginlabel = new JLabel("대화명");
	private JPanel log2 = new JPanel();
	private JLabel logoutlabel = new JLabel("대화명:");
	private JButton logout = new JButton("로그아웃");
	private JPanel logwindow = new JPanel();
	private CardLayout cd = new CardLayout();
	private JPanel logwin;
	
	// 대화 창 패널
	private JPanel dialog = new JPanel();
	private JTextArea dia = new JTextArea(10,30);
	private JScrollPane diascroll = new JScrollPane(dia);
	
	
	
	
	// 입력 패널
	private JPanel lastpan = new JPanel();
	private JTextField lasttext = new JTextField(25);
	private JButton lastexit = new JButton("종료");
	
	
	public Chat() {
		
		allwindow.setLayout(new BorderLayout());
		
		
		
		
		// 대화명 쪽 패널
		// 로그인
		log.setLayout(new BorderLayout());
		log.add(loginlabel,BorderLayout.WEST);
		log.add(logtext, BorderLayout.CENTER);
		log.add(login,BorderLayout.EAST);
		allwindow.add("North",log);
		
		
		// 로그아웃
		log2.setLayout(new BorderLayout());
		log2.add(logoutlabel,BorderLayout.WEST);
		log2.add(logout, BorderLayout.EAST);
	//	allwindow.add("North", log2);
		
		logwin = new JPanel(cd);
		logwin.add(log, "로그인");
		logwin.add(log2, "로그아웃");
		allwindow.add("North", logwin);
		
		
		// 대화창 패널
		dialog.add(diascroll);
		allwindow.add("Center",dialog);
		dia.setEnabled(false);
		
		
		// 마지막 패널
		lastpan.setLayout(new FlowLayout());
		lastpan.add(lasttext);
		lastpan.add(lastexit);
		allwindow.add("South", lastpan);
		
		
		allwindow.setFont(new Font("궁서체", Font.BOLD, 20));
		allwindow.setVisible(true);
		allwindow.setResizable(false);
		allwindow.pack();
		allwindow.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		login.addActionListener(this);
		logout.addActionListener(this);
		
		
		
	}
	
	public static void main(String[] args) {
		
		new Chat();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==login) {
			String dd = logtext.getText();
			logoutlabel.setText("대화명: " + dd);
			cd.show(logwin, "로그아웃");
		}
		else if(e.getSource()==logout) {
			cd.show(logwin, "로그인");
			logtext.setText("");
		}
		
	}

}
