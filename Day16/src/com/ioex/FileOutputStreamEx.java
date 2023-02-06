package com.ioex;

import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {

		FileOutputStream fos = null;

		try {

			fos = new FileOutputStream("c:\\aa\\newDirectory\\dest2.txt");
			
			String message = "자바야 놀자 !!!";
			fos.write(message.getBytes());
			fos.close();

		} catch (FileNotFoundException fn) {
			fn.printStackTrace();
		} catch (IOException ii) {
			ii.printStackTrace();

		} finally {

			try {
				if (fos != null)
					fos.close();
			} catch (IOException eee) {

			}
		}

	}

}
