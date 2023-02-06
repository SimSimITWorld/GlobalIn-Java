package study;

import java.io.*;

public class Practice_03 {

	public static void main(String[] args)  throws IOException {
		
		// 한자리수 숫자 2개를 입력 받아 합을 구하시오.
		
		int num1, num2;
		System.out.print("num1 입력 : ");
		num1 = System.in.read() -'0';
		System.in.skip(2);
		System.out.print("num2 입력 : ");
		num2 = System.in.read() -'0';
		
		int sum = num1 + num2 ;
		
		System.out.println("출력 : " + sum);

		
	}

}
