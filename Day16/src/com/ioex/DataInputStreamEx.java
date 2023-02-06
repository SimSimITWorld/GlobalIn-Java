package com.ioex;

import java.io.*;

public class DataInputStreamEx {

	public static void main(String[] args) {
		
		DataInputStream dis = null; // 1차원 스트림
		//	DataInputStream : 기본 자료형 타입 그대로 스트림을 통해서 저장할 수 있다.
			
			
			// 2차원 스트림
			FileInputStream fis = null; // 객체 선언    
			
			try {
				
				// 객체 생성
				fis = new FileInputStream("c:\\aa\\data.sav");
				dis = new DataInputStream(fis);
				
				// 기본 자료형
				// 읽어 들일때는 반드시 저장한 순서대로 읽어야함
				int i = dis.readInt();
				double d = dis.readDouble();
				String s = dis.readUTF();
				
				// 특정 데이터 타입으로 저장
				System.out.println("i의 값 : " + i);
				System.out.println("d의 값 : " + d);
				System.out.println("s의 값 : " + s);
				
			}catch(FileNotFoundException fe) {
				fe.printStackTrace();
			}catch(IOException ie) {
				ie.printStackTrace();
			}finally {
				try {
					if(fis != null) fis.close();
				}catch(IOException ie){}
				
				try {
					if(dis != null) dis.close();
				}catch(IOException ie) {}
			}

	}

}
