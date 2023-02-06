package com.echoserver;

import java.net.*;

public class SocketEx {

	public static void main(String[] args) {
		
		try {
			
		//	Socket s = new Socket("localhost", 3000);
			Socket ss = new Socket("192.168.0.113", 3000);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
