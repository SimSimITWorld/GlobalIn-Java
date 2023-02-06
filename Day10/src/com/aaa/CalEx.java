package com.aaa;
import java.util.*;
public class CalEx {

	public static void main(String[] args) {
		Add add = new Add();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 : " );
		int a = sc.nextInt();
		System.out.print("두번째 수 : " );
		int b = sc.nextInt();
		System.out.println(add.result);
		System.out.println(add.add(a, b));

	}

}
