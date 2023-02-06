package com.exam.inher;

import java.util.*;

public class CalcMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char ch = sc.next().charAt(0);
		
		Calc ca = null;
		
		switch(ch) {
			case '+'	: ca = new Add(); break;
			case '-'	: ca = new Sub(); break;
			case '*'	: ca = new Mul(); break;
			case '/'	: ca = new Div(); break;
			default: System.out.println("잘못된 값입니다.");
		}
		ca.setValue(a, b);
		System.out.println("결과 : " + ca.Calculator());

	}

	

}
