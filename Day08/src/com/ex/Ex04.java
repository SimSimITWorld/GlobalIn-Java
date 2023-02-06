package com.ex;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("exit를 입력하면 종료합니다.");
		
		while(true) {
			
			System.out.print(">> ");
			String text = sc.nextLine(); // 한 라인 읽기
			// String text1 = sc.next();
			if(text.equals("exit")){        // exit 가 입력되면 반복을 종료
				break;
			}
			
		}
	}

}
