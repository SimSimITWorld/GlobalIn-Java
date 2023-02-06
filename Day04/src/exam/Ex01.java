package exam;

/* 문1]
 *       Scanner 클래스를 이용하여 원화를 입력받아 달러로 교환하는 프로그램을 작성하시오.
 *       1$ = 1100 원으로 함
 *       
 *       출력형식
 *       원화를 입력하세요(단위 원) >>> 3300
 *       3300원은 $3.0 입니다.
 */

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int money;
		final float exchange;
		
		System.out.print("원화를 입력하세요(단위 원) >>> ");
		money = sc.nextInt();
		
		exchange = money/1100;
		
		System.out.printf("%d원은 $%.1f 입니다.",money, exchange);
	}

}
