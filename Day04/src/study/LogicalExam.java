package study;

/*  && = * (논리곱)  캐리 발생 X
 *   ||  = +(논리합)  캐리 발생 O
 *   !    =  논리부정   
 *   8진수, 10진수, 16진수 시험에 나옴
 */

import java.util.*;

public class LogicalExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean a = true, b = false;
		
		System.out.printf("a && b : %b\n", a&&b);
		
		System.out.printf("a || b : %b\n", a||b);
		
		System.out.printf("!a : %b\n", !a);
		

	}

}
