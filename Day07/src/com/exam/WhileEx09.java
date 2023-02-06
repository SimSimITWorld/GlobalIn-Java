package com.exam;

/* 문]
 *     -50에서 1까지의 수를 출력하는 프로그램을 작성하시오.
 *     단, 한줄에 5개의 수만 출력, 수들 사이를 탭 간격으로 출력
 */

import java.util.*;

public class WhileEx09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int j = -50;
		
		while(j<=1) {
			System.out.print(j+"\t");
			j++;
			if(j%5==0) {
				System.out.println();
			}
		}
		System.out.println();
		
		int i = -50;
		
		while(i<=1) {
			System.out.printf("%d\t",i);
			i++;
			if(-i%5==0) {
				System.out.println();
			}
		}
		
		System.out.println();
		
		do {
			System.out.printf("%d\t",i);
			i++;
			if(i%5==0) {
				System.out.println();
			}
			
		}while(i<=1);
		
		

	}

}
