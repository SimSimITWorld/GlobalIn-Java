package exam;

/* 문3]
 *       임의의 정수를 입력받아 입력받은 정수가 
 *       짝수인지 홀수인지를 판정하는 프로그램을 작성하시오.
 *       ex) 삼항 연산자를 활용하시오.
 */

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num;
		String result;
		
		System.out.print("정수를 입력하세요 : ");
		
		num = sc.nextInt();
		
		result = num%2==0 ?  "짝수" : "홀수";
	
		System.out.println(num + "은 " + result + "입니다.");
	}

}
