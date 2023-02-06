package com.ex;

/* 문]
 *     컴퓨터와 사용자 사이의 가위 바위 보 게임을 만듦
 *     
 *     사용자가 먼저 시작한다. 사용자가 가위 바위 보 중 하나를 입력하고 Enter 키를 치면
 *     프로그램은 가위 바위 보 중에서 랜덤하게 하나를 선택하고 컴퓨터가 낸 것으로 함
 *     사용자가 입력한 값과 컴퓨터가 랜덤으로 선택한 값을 비교하여 누가 이겼는지를 판단함
 *     사용자가 가위바위보 대신 그만을 입력하면 프로그램을 종료함
 *     
 *     컴퓨터와 가위 바위 보 게임을 시작합니다.
 *     가위바위보 => 바위
 *     사용자 :  바위, 컴퓨터 : 가위, 사용자가 이겼습니다.
 *     
 *     가위바위보 => 가위
 *     사용자 : 가위, 컴퓨터 :  가위, 비겼습니다.
 *     가위바위보  => 그만
 *     게임을 종료 합니다.
 *     
 *     가위바위보가 아닌 경우
 *     다시 하세요.
 */

import java.util.*;

public class ArrayEx07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 배열선언 (가위, 바위, 보)
		String[] com = {"가위","바위","보"};
		
		// 안내메시지
		System.out.println("컴퓨터와 사용자간의 가위바위보 게임을 시작합니다.");
		
		// 무한루프
		while(true) {
			
			System.out.print("가위 바위 보 : ");
			// 문자열 입력받음
			String a =sc.nextLine();
			if(a.equals("그만")) {
				System.out.print("게임을 종료합니다.");
				break; // while 문을 벗어남(종료)
			}
			
			int n = (int)(Math.random()*3); // 0 1 2 중에서 랜덤으로 정수값을 받음
			String b = com[n];
			
			System.out.print("사용자 : " + a + ", 컴퓨터 : " + b + ", ");
			// System.out.println();
			
			if(a.equals("가위")) { // 사용자가 가위인 경우
				if(b.equals("가위")) 
					System.out.println("비겼습니다.");
				else if(b.equals("바위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else
					System.out.println("사용자가 이겼습니다.");
			}else if(a.equals("바위")) { // 사용자가 바위인 경우
				if(b.equals("가위")) 
					System.out.println("사용자가 이겼습니다.");
				else if(b.equals("바위"))
					System.out.println("비겼습니다.");
				else
					System.out.println("컴퓨터가 이겼습니다.");
			}else if(a.equals("보")) { // 사용자가 보인 경우
				if(b.equals("가위")) 
					System.out.println("컴퓨터가 이겼습니다.");
				else if(b.equals("바위"))
					System.out.println("사용자가 이겼습니다.");
				else
					System.out.println("비겼습니다.");
			}else {
				System.out.println("다시 하세요.");
			}
			
		}
		
		

	}

}
