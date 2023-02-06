package com.ioex;

import java.io.*;

public class FileEx01 {

	public static void main(String[] args) {
		
		File file = new File("c:\\aaa\\aa.txt");

		if(file.exists()) 
			System.out.println("파일이 존재합니다.");
		else
			System.out.println("파일이 존재하지 않습니다.");
		
		if(file.isFile())
			System.out.println("파일 형식입니다.");
		if(file.isDirectory())
			System.out.println("디렉토리 형식입니다.");
		System.out.println("경로 : " + file.getPath());
		System.out.println("파일 이름 : " + file.getName());
		System.out.println("파일 길이 : " + file.length());
		System.out.println("파일 수정날짜 : " + file.lastModified());
		
		
	}

}
