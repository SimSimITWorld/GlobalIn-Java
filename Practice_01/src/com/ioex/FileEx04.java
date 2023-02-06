package com.ioex;

import java.io.*;

public class FileEx04 {

	public static void main(String[] args) {
		
		File file = new File("c:\\aaa\\aa.txt");
		if(file.exists()) {
			file.delete();
		}
		
		File dir = new File("c:\\aaa\\newFolder");
		if(dir.exists()) {
			dir.delete();
		}

	}

}
