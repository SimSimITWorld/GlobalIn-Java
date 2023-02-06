package com.echoserver;

import java.net.*;

public class ServerSocketEx {

	public static void main(String[] args) {
		
		try {
		// 접속자를 받아 들이기 위해 serversocket이 필요하기 때문에 serversocket을 생성함
		ServerSocket ss = new ServerSocket(3000);
		
		while(true) {
			// 접속자가 접속할 때까지 무한정 기다림(무한대기)
			Socket s = ss.accept();
			
			// 접속자의 IP를 알아내기 위해서 객체를 얻어옴
			InetAddress iaddr = s.getInetAddress();
			String u_ip = iaddr.getHostAddress();
			System.out.println(u_ip+"님이 접속하셨습니다.");
			
			
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
