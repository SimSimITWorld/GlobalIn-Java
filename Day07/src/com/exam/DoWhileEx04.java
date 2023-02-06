package com.exam;

import java.util.*;

public class DoWhileEx04 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("n 값 입력 : ");
		int n = sc.nextInt();
		int value = 1;
		int i = 1;
		do {
			if(i != n) {
				System.out.print(i + " * ");
			}else {
				System.out.print(i + " = ");
			}
			value *= i;
			i++;
		} while( i <= n);
		System.out.println(value);
	}

}
