package practice_1;

import java.util.*;

public class Practice_3 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		System.out.print("학년 입력 : ");
		int grade = sc.nextInt();
		
		if(score>=70) {
			System.out.println("합격");
		}else {
			if(grade!=4 && score>=60) {
				System.out.println("합격");
				return;
			}
			System.out.println("불합격");
		}
	}

}
