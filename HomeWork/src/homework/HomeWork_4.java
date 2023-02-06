package homework;

import java.io.*;

public class HomeWork_4 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("알파벳 한문자 입력 : ");
		int n = System.in.read();
		char ch;
		
	    if(n>=65 && n<=90 || n>=97 && n<=122) {
	    	ch = n>=65 && n<=90 ? (char)(n+=32) : (char)(n-=32);
	    	System.out.println(ch);
	    }else {
	    	System.out.println("입력 오류");
	    }
		
	}
}
