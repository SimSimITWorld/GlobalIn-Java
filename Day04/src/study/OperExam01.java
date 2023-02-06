package study;

/* 대입 연산자 : = 
 * 산술 연산자 : +, -, *, /, %
 * 관계 연산자, 논리 연산자
 */

import java.util.*;

public class OperExam01 {

	public static void main(String[] args) {
		
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);

		
		System.out.print("첫번째 정수 입력 : ");
		int n1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int n2 = sc.nextInt();
		
		int c = n1 + n2; // 합
		System.out.printf("%d + %d = %d\n", n1, n2, c);
		System.out.printf("%d + %d = %d%n", n1, n2, c);
		int d = n1 - n2; // 차
		System.out.printf("%d - %d = %d\n", n1, n2, d);
		int e = n1 * n2; // 곱
		System.out.printf("%d * %d = %d\n", n1, n2, e);
		int f = n1 / n2; // 몫
		System.out.printf("%d / %d = %d\n", n1, n2, f);
		int g = n1 % n2; // 나머지
		System.out.printf("%d %% %d = %d\n",n1 ,n2, g);
		
		System.out.println("두 정수의 합\t: " + c + "\n두 정수의 차\t: " + d + "\n두 정수의 곱\t: " + e + "\n두 정수의 몫\t: " + f + "\n두 정수의 나머지\t: " + g + "\n");
		System.out.printf("두 정수의 합\t: %d\n두 정수의 차\t: %d\n두 정수의 곱 : %d\n두 정수의 몫 : %d\n두 정수의 나머지 : %d\n", c, d, e, f, g, e);
	}

}
