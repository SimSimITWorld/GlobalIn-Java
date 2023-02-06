package com.ifex;

/* 문]
 *      임의의 정수를 입력받아 입력받은 정수가 양수인지, 음수인지, 0인지를 판정하는 프로그램을 작성
 *      단, BufferedReader 와 조건삼항 연산자를 이용하여 출력하시오.
 *      
 *      정수입력 : 12
 *      12 ==> 양수
 *      정수입력 : 0
 *      0 ==> 영
 *      정수입력 : -12
 *      -12 ==> 음수
 *      
 */

import java.io.*;

public class IfEx01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수입력 : ");
		int num1 = Integer.parseInt(br.readLine());
		
		String value = (num1>0) ? "양수" : (num1==0) ? "영" : "음수";
		
		System.out.println(num1 + " ==> " + value);

	}

}
