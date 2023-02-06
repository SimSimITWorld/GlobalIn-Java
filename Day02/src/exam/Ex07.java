package exam;

/* 문7]
 *       이름과 주소와 전화번호를 입력받아 출력하는 프로그램을 작성하시오.
 */

import java.util.*;

public class Ex07 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		// 변수 선언
		
		String name, address, phone;
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("주소 입력 : ");
		address = sc.next();
		System.out.print("번호 입력 : ");
		phone = sc.next();
		
		System.out.printf("이름\t: %s\n주소\t: %s\n번호\t: %s", name, address, phone);
		
		

	}

}
