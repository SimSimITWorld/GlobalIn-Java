package com.inher;
import java.io.*;
public class BClass extends AClass  {
	
	// 데이터 입력기능(메소드)
	boolean input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 정수 입력 : ");
		super.x = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력 : ");
		super.ch = (char)System.in.read();
		System.in.skip(2);
		System.out.print("두번째 정수 입력 : ");
		super.y = Integer.parseInt(br.readLine());
		if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
			return true;
		return false;	
	}
	
	// 연산 및 처리기능(메소드)
	double calc() {
		double result = 0;
		switch(ch) {
		case '+':
			result = x + y;break;
		case '-':
			result = x - y;break; 
		case '*':
			result = x * y;break;
		case '/':
			result = x / y;break;
		}
		return result;
	}
	

}
