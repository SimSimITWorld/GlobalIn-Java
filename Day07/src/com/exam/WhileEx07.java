package com.exam;

/* 문]
 *     2의 승수를 입력받아 값을 구하는 프로그램을 작성하시오.
 */

import java.util.*;

public class WhileEx07 {

	public static void main(String[] args) {
		
		int n = 1,i =1, multi = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("2의 승수 입력 : ");
		n = sc.nextInt();
		
		while(i<=n) {
			multi *=2 ;
			i++;
		}
		System.out.println("2의 " + n +"승은 " + multi + "입니다.");
		

	}

}
