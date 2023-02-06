package com.multiex;

/*
 *  MultiServer =>	모든 클라이언트의 연결 요청을 받아서 Socket을 생성하고, 
 *  						Socket을 유지하기 위해 Thread 객체를 생성
 *  						생성된 Thread 객체를 컬렉션(ArrayList) 내에 저장
 * 
 */

import java.io.*;
import java.net.*;
import java.util.*;

public class MultiServer {
	
	/* 
	 * 특정 사용자가 보낸 메시지를 모든 클라이언트에게 전달하기 위해 클라이언트와
	 * 메시지를 송수신 할 수 있는 기능을 가진 MultiServerThread 객체를 저장할 컬렉션
	 */
	
	private ArrayList<MultiServerThread> clientList = new ArrayList<>();
	
	private ServerSocket server = null;
	
	public MultiServer() {
		
		try {
			
			server = new ServerSocket(5000);
			System.out.println("서버가 시작되었습니다......");
			
			while(true) {
				
				Socket socket = server.accept();
				
				InetAddress ip = socket.getInetAddress();
				
				String ipAddress = ip.getHostAddress();
				
				System.out.println(ipAddress + "님이 입장 하셨습니다.");
				
				MultiServerThread t = new MultiServerThread(clientList, socket);
				
				t.start();
				
				clientList.add(t);
			}
			
		}catch(IOException io) {
			System.out.println(io.getMessage());
		}
	}
	
	public static void main(String[] args) {
		
		new MultiServer();

	}

}
