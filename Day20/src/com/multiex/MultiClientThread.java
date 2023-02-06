package com.multiex;

import java.io.*;
import java.net.*;

public class MultiClientThread extends Thread {
	
	private BufferedReader in;
	
	public MultiClientThread(BufferedReader in) {
		this.in = in;
	}
	
	@Override
	public void run() {
		
		try {
			
			while(true) {
				String text = in.readLine();
				System.out.println("수신 메시지 : " + text);
			}
			
		}catch(IOException io) {
			io.printStackTrace();
		}
		
	}
	
}
