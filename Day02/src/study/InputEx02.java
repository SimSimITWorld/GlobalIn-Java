package study;

import java.io.*;

public class InputEx02 {

	public static void main(String[] args) throws IOException {
		
		// 숫자 하나 입력 받기 : 
		int num1; // 첫번째 숫자
		int num2; // 두번째 숫자
		
		
		System.out.print("첫번째 정수 입력 : ");
		num1 = System.in.read() -'0'; // 5 => 53 - 48
		// System.in.read();
		// System.in.read();
		 System.in.skip(2);
		System.out.print("두번째 정수 입력 : ");
		num2 = System.in.read() -'0';
		
		System.out.println("num1 + num2 : " + (num1 + num2));

	}

}
