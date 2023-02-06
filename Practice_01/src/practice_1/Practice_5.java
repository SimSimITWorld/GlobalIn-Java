package practice_1;

/* 3, 6, 9 게임
 *  1 ~ 99 까지
 */

import java.util.*;

public class Practice_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num1 = sc.nextInt();
		
		if(num1>=1 && num1 <=99) {
			int a = num1 / 10;
			int b = num1 % 10;
			int count = 0;
			
			if(a!=0 && a%3==0) {count ++;}
			if(b!=0 && b%3==0) {count ++;}
			
			if(count == 2) {
				System.out.println("박수짝짝");
			} else if (count ==1) {
				System.out.println("박수짝");
			}
		}else {
			System.out.println("범위를 벗어났습니다.");
		}

	}

}
