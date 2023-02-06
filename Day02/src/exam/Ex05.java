package exam;

/* 문5]
 *       국어, 영어, 수학 점수를 입력받아 합계를 구하는 프로그램 작성
 */

import java.util.*;

public class Ex05 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sum = 0;
		
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt(); 
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();
		
		sum = kor + eng + mat;
		
		System.out.println("세 과목의 총점은 : " + sum + "입니다.");
		
		/* 문6]
		 *       위 5번 문제를 이용하여 평균을 구하는 프로그램을 작성하시오.
		 * 단 소수점 이하 2자리 까지 출력하는 프로그램을 작성하시오.
		 */
		float avg = (float)(sum / 3.0);
		
		System.out.printf("평균은 %.2f", avg);
		

	}

}
