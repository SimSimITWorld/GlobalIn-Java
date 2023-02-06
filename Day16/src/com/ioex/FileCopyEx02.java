package com.ioex;

import java.io.*;

public class FileCopyEx02 {

	public static void main(String[] args) {

		System.out.println("파일 복사 시작 .....");

		long start = System.currentTimeMillis();
		// System.out.println((start/1000)/60/60/60/60/60);

		FileInputStream src = null;
		FileOutputStream dest = null;

		try {

			// 원본
			src = new FileInputStream("c:\\aa\\newDirectory\\aa.log");
			// 복사본
			dest = new FileOutputStream("c:\\aa\\newDirectory\\bb.txt");

			// 임시 저장소에 저장된 데이터의 전체 개수를 저장할 변수를 선언
			int length = 0;
			// 임시 저장소로 사용될 byte배열 선언
			byte[] buffer = new byte[1024 * 8]; // 8192

			/*
			 * inputstream 을 통해서 읽어들인 데이터를 임시저장소에 저장하고 저장된 데이터의 개수를 length에 저장함
			 */

			// FileInputStream의 read()메소드를 통해서 읽어들인 값을 length에 저장함
			while ((length = src.read(buffer)) != -1) {
				// outputstream을 통해서 임시저장소에 저장되어 있는 데이터를 length만큼 파일에 기록한다.
				dest.write(buffer, 0, length);
			}

		} catch (FileNotFoundException fn) {
			fn.printStackTrace();
		} catch (IOException ii) {
			ii.printStackTrace();
		} finally {

			try {
				if (dest != null) {
					dest.close();
				}
			} catch (IOException ie) {
			}

			try {
				if (src != null)
					src.close();
			} catch (IOException ie) {
			}

			long end = System.currentTimeMillis();

			long copyTime = (end - start) / 1000;
			System.out.println("걸린시간 : " + copyTime + "초");

		}

	}

}
