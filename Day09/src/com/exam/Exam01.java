package com.exam;

import java.io.*;

public class Exam01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		if(args.length == 0) {
			System.out.println("Usage : java Exam01 subject1 subject2 ....");
			System.exit(0);
		} // args.length == 과목수(과목명)
		
		// 이름 입력 안내 메시지
		System.out.print("당신의 이름 입력 : ");
		String name = br.readLine();
		
		String[] subject = new String[args.length];
		// args.length = 과목명을 subject 배열에 옮긴다.
		for(int i = 0;i<args.length;i++) {
			subject[i] = args[i];
			// subject = args,  subject.length => 과목 수
		}
		int[] jumsu = new int[subject.length+1]; 
		// 과목 다음 마지막에 점수의 공간을 할당
		
		for(int i = 0;i<jumsu.length-1;i++) {
			System.out.print(subject[i] + "점수 : ");
			jumsu[i] = Integer.parseInt(br.readLine()); // 과목별 점수
			jumsu[jumsu.length-1] += jumsu[i]; // 누적의 합
		}
		
		// System.out.println(jumsu[jumsu.length-1]);
		float avg = jumsu[jumsu.length-1]/(float)subject.length;// 평균 구함
		// System.out.println(jumsu[jumsu.length-1]);
		avg = (int)((avg+0.005)*100)/100.0f; // 평균 소수점 2자리
		// System.out.printf("%.2f",avg);
		
		// 학점 구함
		char grade = ' ';
		
		switch((int)(avg/10)) {
		case 10: case 9:
			grade = 'A'; break;
		case 8:
			grade = 'B'; break;
		case 7:
			grade = 'C'; break;
		case 6:
			grade = 'D'; break;
		default:
			grade = 'F';
		} // 학점 평가 끝
		
		System.out.println();
		// 성적 출력
		
		System.out.println("**************성적표**************");
		System.out.print("이름 \t");
		for(int i = 0;i<subject.length;i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println("총점\t 평균\t 학점");
		System.out.print(name+"\t");
		
		for(int i = 0;i<subject.length+1;i++) {
			System.out.print(" " + jumsu[i] + "\t");
		}
		System.out.println(" "+avg+"\t "+grade);
		System.out.println("********************************");
		

		
	}

}
