package exam;

/* 문3]
 *       숫자 하나씩을 입력받는 프로그램을 작성하되,
 *       두 개의 변수를 이용하여 합을 구하는 프로그램 작성
 */

import java.util.*;

public class Ex03 {

	public static void main(String[] args)  {
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		a = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		b = sc.nextInt();
		
		System.out.println("입력 받은 두 정수의 합 : " + (a + b));

	}

}
