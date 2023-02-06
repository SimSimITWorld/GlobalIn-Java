package com.ioex;

import java.io.*;

public class FileEx03 {

	public static void main(String[] args) {

		File file = new File("c:\\aaa\\aa.txt");
		if(file.exists()) 
			System.out.println("파일이름 : " + file.getName());
		else {
			try {
				if(file.createNewFile()) {
					System.out.println("파일을 생성했습니다.");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		File dir = new File("c:\\aaa\\newFolder");
		if(!dir.exists())
			dir.mkdir();
		else {
			System.out.println("디렉토리 이름 : " + dir.getPath());
		}
		
		
	}

}
