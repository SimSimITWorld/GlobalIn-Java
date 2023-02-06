package study;

/* 문자열 입력받기
 *  InputStreamReader is = new InputStreamReader(System.in);
 *  BufferedReader br = new BufferedReader(is);
 *  
 *  or
 *  
 *  BufferedReader br = new BufferedReader(new InputStreamReader(System.in);
 *  
 */

import java.io.*;

public class InputEx03 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		/*
		 BufferedReader brs =
		       new BufferedReader(new InputStreamReader(System.in));
		 */
		
		System.out.print("이름 입력 : ");
		String name = br.readLine();
		
		System.out.print("나이 입력 : ");
	    String age = br.readLine();
	    
	    System.out.print("주소 입력 : ");
	    String addr = br.readLine();
	    
	    System.out.print("번호 입력 : ");
	    String tel = br.readLine();
		
		System.out.printf("이름 : %s\n나이 : %s\n주소 : %s\n번호 : %s",name,age,addr,tel);
		
	}

}
