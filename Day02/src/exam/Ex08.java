package exam;

/* 문8]
 *       문자 하나를 입력받아 아스키 코드로 출력하는 프로그램 작성
 */

import java.util.*;

public class Ex08 {

	public static void main(String[] args)  {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나 입력 : ");
		char num = sc.next().charAt(0);

		System.out.println("아스키 코드 값은 : " + (int)num);
	}

}
