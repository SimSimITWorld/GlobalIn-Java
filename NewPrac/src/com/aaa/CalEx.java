package com.aaa;

import java.util.*;

public class CalEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		System.out.print("첫번째 값 입력 : ");
		int a = sc.nextInt();
		System.out.print("두번째 값 입력 : ");
		int b = sc.nextInt();
		
		System.out.print("처리할 값 입력 : ");
		int c = sc.nextInt();
		
		int result = 0;
		
		switch(c) {
		    case 1: result = add.result(a, b); break;
		    case 2: result = sub.result(a, b); break;
		    case 3: result = mul.result(a, b); break;
		    case 4: result = div.result(a, b); break;
		    default: System.out.println("잘못된 값을 입력하셨습니다."); return;
		}
		
		System.out.println("계산된 값 : " + result);

	}

}
