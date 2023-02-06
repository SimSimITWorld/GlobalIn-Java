package com.ioex;

import java.io.*;

public class FileEx05 {

	public static void main(String[] args) {
		
		File file = new File("c:\\aaa\\aa.txt");
		
		File dir = new File("c:\\aaa\\newFolder");
		
		File dest = new File("c:\\aaa\\newFolder\\change.txt");
		
		File dest2 = new File("c:\\aaa\\newFolder\\change2.txt");
		
		if(!file.exists()) {
			if(!dir.exists())
				dir.mkdir();
			try {
				if(file.createNewFile())
					System.out.println("새로운 파일과 디렉토리를 생성했습니다.");
			}catch(IOException ie) {
				ie.printStackTrace();
			}
		}
		
		if(file.exists()) {
			file.renameTo(dest);
		}
		
	}

}
