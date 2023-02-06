package com.uniex;

import java.io.*;
import java.net.*;

// 클라이언트의 연결 요청을 받아서 소켓을 생성하고 유지하는 서버

public class UnicastServer {

	public UnicastServer() {
		
		ServerSocket server = null;
		try {
			
			server = new ServerSocket(5000);
			
		}catch(IOException e) {
			System.out.println("해당 포트가 사용 중에 있습니다.");
			System.exit(0);
		}
		
		try {
			while(true) {
				System.out.println("서버가 시작되었음......");
				Socket socket = server.accept();
				
			//	사용자와 메시지를 송수신할 스레드를 생성해서 스레드 소켓을 전달함
				UnicastServerThread thread = new UnicastServerThread(socket);
				thread.start();
				
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		new UnicastServer();

	}

}
