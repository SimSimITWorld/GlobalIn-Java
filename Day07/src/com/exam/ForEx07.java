package com.exam;

/* 문]
 *      이중 중첩 반복문을 사용하여 다음과 같이 출력하시오.
 * 
 *      *****
 *      ****
 *      ***
 *      **
 *      *
 */

import java.util.*;

public class ForEx07 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 번 찍으실건가요? >> ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			for(int j = n; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
