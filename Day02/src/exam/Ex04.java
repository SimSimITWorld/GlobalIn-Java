package exam;

/* 문4]
 *       임의의 두 정수를 입력받아 합을 구하는 프로그램을 작성하시오.
 */

import java.util.*;

public class Ex04 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		System.out.print("첫번째 정수 입력 : ");
		a = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		b = sc.nextInt();
		// Double.parseDouble(null);
		// 두 수의 합
		c = a + b ;
		
		System.out.println("두 정수의 합 : " + c);

	}

}
