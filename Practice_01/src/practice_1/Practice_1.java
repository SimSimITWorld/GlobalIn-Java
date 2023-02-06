package practice_1;

import java.util.*;

public class Practice_1 {

	public static void main(String[] args)  {
		
		
		
		// 입력받은 값이 98점 이상 A+, 90점 이상 ~ 94점 미만이면 A-, 90점 이상이면 A
		// 88점이상이면 +, 84점 미만 -, 80점 이상이면 B
		// 나머지 c
		
		
		// System.out.printf("당신의 학점은 %c%c입니다.%n", grade , opt);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		char grade = ' ', opt = '0';
		
		if (score>=90 && score <=100) {
			grade = 'A';
			if (score>=98) {
				opt = '+';
			} else if (score<94) {
				opt = '-';
			}
		} else if (score>=80 && score<=89) {
			grade = 'B';
			if (score>=88) {
				opt = '+';
			} else if (score < 84) {
				opt = '-';
			} 
		} else if (score>100 || score < 0) {
			System.out.println("점수를 확인하시고 다시 입력해주세요.");
		} else {
			grade = 'C';
		}
		
		System.out.printf("학생의 점수는 %d점 입니다.\n",score);
		System.out.printf("학점은 %c%c 등급 입니다.", grade, opt);
		
	}

}
