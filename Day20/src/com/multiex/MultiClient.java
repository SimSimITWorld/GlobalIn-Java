package com.multiex;

import java.io.*;
import java.net.*;

public class MultiClient {
	
	private Socket socket = null;
	private BufferedReader in = null;
	private PrintWriter out = null;
	private BufferedReader keyboard = null;
	
	public MultiClient() {
		
		try {
			// (실험) 선생님 컴퓨터 번호 : 192.168.0.113
			socket = new Socket("192.168.0.22", 5000);
			System.out.println("서버와 연결이 성공적으로 되었습니다. 즐거운 시간 되십시요 !!!");
			
			// 스트림 연결
			keyboard = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(socket.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			/*
			 * 서버가 전송한 메시지를 읽어들일 읽기전용 스레드를 생성함
			 * 
			 * MultiClientThread 생성시에
			 * 서버가 전송한 메시지를 읽어들일 수 있는 스트림을 전달함
			 */
			MultiClientThread t = new MultiClientThread(in);
			t.start();
			
			while(true) {
				String text = keyboard.readLine();
				out.println(text);
			}
			
		}catch(UnknownHostException ue) {
			ue.printStackTrace();
		}catch(IOException io) {
			io.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		new MultiClient();
		
	}
}
