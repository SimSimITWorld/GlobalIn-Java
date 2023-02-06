package com.chat;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class MultiChatServer {

	Chat ch = new Chat();
	
	private ArrayList<MultiChatServer> clientList = new ArrayList<>();
	
	private ServerSocket ss = null;
	
	public MultiChatServer() {
		
		try {
			
			ss = new ServerSocket(5000);
			System.out.println("서버가 시작되었습니다.");
			
			while(true) {
				
				Socket s = ss.accept();
				
				InetAddress ip = ss.getInetAddress();
				
				String ipAddress = ip.getHostAddress();
				
			
				
			}
			
			
		}catch(IOException ie) {
			System.out.println(ie.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		

	}

	class ChatThread {
		
	}
}
