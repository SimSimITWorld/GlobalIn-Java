package exam;

/* 문2]
 *       Scanner 클래스를 이용하여 2자리의 정수(10 ~ 99)를 입력받고 
 *       십의 자리와 1의 자리가 같은 지를 판별하여 출력하는 프로그램을 작성하시오.
 *       
 *       출력형식
 *       2자리의 정수 입력(10~99) >> 77
 *       Yes! 10의 자리와 1의 자리가 같습니다. 
 *       NO! 10의 자리와 1의 자리가 다릅니다.
 */

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, result1, result2;
		System.out.print("2자리의 정수 입력(10~99) >> ");
		num1 = sc.nextInt();
		
		num2 = num1/10;
		
		result1 = num1-num2;
		
		result2 = num2*10;
		if(num1>=10 && num1<=99) {
		  if (result1 == result2) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		}else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		} 
		}else {
			System.out.println("범위를 벗어나셨습니다.");
			return;
		}
		
		/* if(n < 10 || n > 99) {
		 *   System.out.println("10과 99사이의 정수만 입력하세요.");
		 *   return;
		 *   }
		 *   
		 *   int ten = n / 10;
		 *   int one = n % 10;
		 *   
		 *   if(ten == one) 
		 *     System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		 *   else
		 *     System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		 */
	}

}
