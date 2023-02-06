package exam;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int year, score;
		System.out.print("학년 입력 : ");
		year = sc.nextInt();
		System.out.print("점수 입력 : ");
		score = sc.nextInt();
		
		if(year >= 1 && year <= 4 && score>=0 && score<=100) {
			if (score>=60) {
				if(year>=1 && year < 3) {
					System.out.println("합격");
				}else if (year ==4 && score >=70) {
					System.out.println("합격");
				}else {
					System.out.println("불합격");
				}
			}else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("학년 혹은 점수를 다시 확인 후 입력해주세요.");
			return;
		}
		
		
		if (score >=60) {
			if(year!=4 || score>=70) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}
		else {
			System.out.println("불합격");
		}
		
		
		if(score>=60) { // 60점 이상
			if(year !=4 ) {
				System.out.println("합격");
			}else if (score>=70) {
				System.out.println("합격"); // 4학년이 70점 이상이면 합격
			} else {
				System.out.println("불합격"); // 4학년 70점 미만이면 불합격
			}
			
		}else {
			System.out.println("불합격"); 
		}
	}

}
