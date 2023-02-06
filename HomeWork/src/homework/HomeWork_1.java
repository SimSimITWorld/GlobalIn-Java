package homework;

/* 문1]
  두사람이 하는 가위바위보 게임을 만듬
  두사람의 이름은 준과 미 라고 가정하자 먼저 "준>>"를 출력하고 
 "가위","바위", "보" 중 하나의  문자열을 받는다.
  그리고 "미>>"를 출력하고  "가위","바위", "보" 중 하나의 문자열을 받는다.
   입력받은 문자열을 비교하여 누가 이겼는지를 판별하여 
   승자를 출력하는 프로그램을 작성하시오.(if문활용)
 
   출력형식
   가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.
   준 >> 가위
   미 >> 보
   준이 이겼습니다.
   힌트) 문자열을 비교하기 위해서는 변수.equals("가위")로 비교해야함
 * 
 */

import java.util.*;

public class HomeWork_1 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		String jun, mi;
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		System.out.print("준>> ");
		jun = sc.next();
		System.out.print("미>> ");
		mi = sc.next();
		
		if(jun.equals("가위")) {
			if(mi.equals("보")) {
				System.out.println("준이 이겼습니다.");
			}else if(mi.equals("가위")) {
				System.out.println("비겼습니다.");
			}else if(mi.equals("바위")) {
				System.out.println("준이 졌습니다.");
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
		if(jun.equals("바위")) {
			if(mi.equals("가위")) {
				System.out.println("준이 이겼습니다.");
			}else if(mi.equals("바위")) {
				System.out.println("비겼습니다.");
			}else if(mi.equals("보")) {
				System.out.println("준이 졌습니다.");
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
		if(jun.equals("보")) {
			if(mi.equals("바위")) {
				System.out.println("준이 이겼습니다.");
			}else if(mi.equals("보")) {
				System.out.println("비겼습니다.");
			}else if(mi.equals("가위")) {
				System.out.println("준이 졌습니다.");
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
	}

}
