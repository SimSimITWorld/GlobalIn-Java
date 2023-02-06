package com.ex;

/* 문]
 *     배열과 반복문을 이용하여 다음을 프로그램 하시오.
 *     키보드로 정수 입력
 *     돈의 액수를 입력받아 오만원권, 만원권, 천원권, 오백원짜리 동원, 100원짜리 동전, 50원짜리 동전,
 *     10원짜리 동전, 1원짜리 동전이 각각 몇개인지를 변환하는 프로그램을 작성하시오.
 *     단, 반드시 배열을 이용하시오.
 *     
 *     65123
 */

import java.util.*;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("돈의 액수 입력 : ");
		int n = sc.nextInt();
		
		int[] value = {50000,10000,1000,500,100,50,10,1};
		int[] money = new int[8];
		String[] words = {"오만원권","만원권","천원권","오백원짜리","백원짜리","오십원짜리","십원짜리","일원짜리"};
		
		for(int i = 0;i<money.length;i++) {
			money[i] = n/value[i];
			n = n % value[i];
		}
		for(int i = 0;i<money.length;i++) {
			if(i<3) 
				System.out.println(words[i]+" : " + money[i] + "장");
			else 
				System.out.println(words[i]+" : " + money[i] + "개");
			
		}
		System.out.println("금액 입력 : ");
		int money_1  = sc.nextInt();
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for(int i = 0;i<unit.length;i++) {
			// 돈의 개수 계산
			int res = money_1/unit[i]; // 오만원권 개수
			// System.out.println(res);
			
			// 몫 계산
			if(res>0) {
				System.out.println(unit[i] + "원 짜리 : " + res + "개");
				money_1 = money_1%unit[i]; // money 갱신
			}
		}

	}

}
