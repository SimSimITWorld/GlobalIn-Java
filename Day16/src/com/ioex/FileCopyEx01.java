package com.ioex;

import java.io.*;

public class FileCopyEx01 {

	public static void main(String[] args) {
		
		System.out.println("파일 복사 시작 .....");
		
		long start = System.currentTimeMillis();
	//	System.out.println((start/1000)/60/60/60/60/60);
		
		FileInputStream src = null;
		FileOutputStream dest = null;
		
		try {
			
			// 원본
			src = new FileInputStream(new File("c:\\aa\\newDirectory\\dest2.txt"));
			// 복사본
			dest = new FileOutputStream(new File("c:\\aa\\newDirectory\\de.txt"));
			
			
			// FileInputStream을 통해서 읽어들인 값을 저장할 변수
			int readValue = 0;
			// FileInputStream의 read()메소드를 통해서 읽어들인 값을 readValue에 저장함
			while((readValue = src.read()) != -1) {
				// readValue에 저장된 값을 FileOutputStream의 write() 메소드를 통해서 파일에 기록한다.
				dest.write(readValue);
			}
			
		}catch(FileNotFoundException fn) {
			fn.printStackTrace();
		}catch(IOException ii){
			ii.printStackTrace();
		}finally {
			
			try {
				if(dest != null) {
					dest.close();
				}
			}catch(IOException ie){}
			
			try {
				if(src != null) src.close();
			}catch(IOException ie) {}
			
			long end = System.currentTimeMillis();
			
			long copyTime = (end - start)/1000;
			System.out.println("걸린시간 : " + copyTime + "초");
			
			
		}
		

	}

}
