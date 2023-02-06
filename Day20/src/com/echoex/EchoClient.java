package com.echoex;

import java.io.*;
import java.net.*;

public class EchoClient {

	public EchoClient() {
		try {

			// 1. 서버 소켓 생성

			Socket s = new Socket("localhost", 3000);

			// 소켓으로부터 스트림을 얻어옴(입력, 출력)

			OutputStream os = s.getOutputStream();
			InputStream is = s.getInputStream();

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			BufferedReader br = new BufferedReader(new InputStreamReader(is));

			// 사용자에게 메시지를 전송함
			bw.write("반갑습니다. 아무개 입니다... \n");
			bw.flush();
			
			// 사용자가 전송한 메시지 읽기
			String message = br.readLine();
			System.out.println("서버가 보낸 메시지 : " + message);

		} catch (UnknownHostException uie) {
			// ie.printStackTrace();
			System.out.println("서버를 아무리 헤매도 찾을 수 없습니다..");
		} catch (IOException ie) {
			// ie.printStackTrace();
			System.out.println("해당 port는 누군가에게 사용 중입니다.");
		}
		
	}

	public static void main(String[] args) {

		new EchoClient();
	}

}
