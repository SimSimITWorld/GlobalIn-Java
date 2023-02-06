package com.ioex;

import java.io.*;

public class FileWriterEx {

	public static void main(String[] args) {

		FileWriter writer = null;

		try {

			writer = new FileWriter("c:\\aa\\fw.txt");

			String str = "학교 종이 깨졌다 엿을 사먹자 !!!!!";

			writer.write(str);
			
			/* 한글자 단위로 읽고 쓸 수 있는 Reader, Writer 계열의 스트림은
			 * 내부적으로 버퍼를 내장하고 있다.
			 * 내장된 버퍼는 가득 채워질때만 스트림을 통해서 내보낸다.
			 * 그런데, 버퍼가 채워지지 않았을 경우 flush()메소드를 이용해서
			 * 버퍼를 비울 수 있다.
			 */

			writer.flush();

		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException ie) {
			ie.printStackTrace();
		} finally {
			try {
				if(writer != null) {
					writer.close();
				}
			}catch(IOException ie) {
				
			}
			
		}

	}

}
