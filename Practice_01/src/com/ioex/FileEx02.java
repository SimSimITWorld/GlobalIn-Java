package com.ioex;

import java.io.*;

public class FileEx02 {

	public static void main(String[] args) {
		
		File dir = new File("c:\\");
		
		if(dir.exists()) {
			
			if(dir.isDirectory()) {
				
				String[] list = dir.list();
				
				for(String x : list) {
					System.out.println(x);
				}
				
			}
			
			
		}
		
	}

}
