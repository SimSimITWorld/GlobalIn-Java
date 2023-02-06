package practice_1;

/* 문]
 *     Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 오천원, 천원권,
 *     오백원짜리, 백원짜리, 오십원짜리, 십원짜리, 1원짜리 동전이 각각  몇개인지 변환하는
 *     프로그램을 작성하시오.
 *     
 *     출력형식
 *     
 *     금액을 입력하시오. >> 65376
 *     오만원권 1매
 *     만원권 1매
 *     천원권 3매     
 *     백원 3개
 *     오십원 1개
 *     십원 2개
 *     일원 6개
 */

import java.util.*;

public class Practice_4 {

	public static void main(String[] args) {
		
		final int omanwon = 50000;
		final int manwon = 10000;
		final int ochonwon = 5000;
		final int chonwon = 1000;
		final int obakwon = 500;
		final int bakwon = 100;
		final int oshibwon = 50;
		final int shibwon = 10;
		final int owon = 5;
		final int won  = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오. >> ");
		int money = sc.nextInt();
		int change;
		
		change = money/omanwon;
		money = money%omanwon;
		if (change >=0) {
			System.out.println("오만원권 " + change + "매");
		}
		
		change = money/manwon;
		money = money%manwon;
		if (change >= 0) {
			System.out.println("만원권 " + change + "매");
		}
		
		change = money/ochonwon;
		money = money%ochonwon;
		if (change >= 0) {
			System.out.println("오천원권 " + change + "매");
		}
		

	}

}
