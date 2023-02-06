package exam;

/* 문2]
 *       문자열을 이용하여 이름을 출력하는 프로그램을 작성하시오.
 */

import java.util.*;

public class Ex02 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		System.out.println("입력 받은 이름 : " + name);
	}

}
