package com.exam;

import java.io.*;

public class Exam02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// System.out.print("응시 학생 수 : ");
		int human = Integer.parseInt(args[0]); // 사람수 구하기
		String[] name = new String[human]; // 사람수 만큼 이름배열을 생성
		// System.out.println(name.length);
		String[] subject = new String[args.length-1]; // 과목명 초기화
		
		// 점수와 총점처리할 배열을 선언
		int[][] jumsu = new int[human][args.length];
		// 평균
		float[] avg = new float[human];
		// 학점
		char[] grade = new char[human];
		// 석차
		int[] rank = new int[human];
		
		
		for(int i = 0;i<args.length-1;i++) {
			subject[i] = args[i+1]; // 과목명을 옮겨옴
			// System.out.print(subject[i]);
			// subject = args,  subject.length => 과목 수
		}
		
		for(int i = 0;i < human;i++) {
		    System.out.print((i+1)+" 번째 학생 이름 : ");
		    name[i] = br.readLine();
		    System.out.println(name[i] + " 학생 점수 입력 ");
		  for(int j = 0;j<subject.length;j++) {
			  System.out.print(subject[j] + "점수 : ");
			  jumsu[i][j] = Integer.parseInt(br.readLine()); // 과목별 점수
			  jumsu[i][subject.length] += jumsu[i][j]; // 누적의 합
		  }
		}
		
		// 평균
		for(int i = 0;i<human;i++) {
			avg[i] = jumsu[i][subject.length]/(float)subject.length; // 평균 구함
			avg[i] = (int)((avg[i]+0.005)*100)/100.f; // 평균 소수점 2자리까지
		}
		// 학점
		for(int i =0;i<human;i++) {
			switch((int)(avg[i]/10)) {
			case 10: case 9:
				grade[i] = 'A'; break;
			case 8:
				grade[i] = 'B'; break;
			case 7:
				grade[i] = 'C'; break;
			case 6:
				grade[i] = 'D'; break;
			default:
				grade[i] = 'F';
			} // 학점 평가 끝
		}
		
		// 석차 계산
		for(int i = 0;i<human;i++) {
			rank[i]++; //1
			for(int j = 0;j<human;j++) {
				if(avg[i]<avg[j]){
					rank[i]++;
				}
			}
		}
		System.out.println();
		 //성적 출력
		    System.out.println("*******************성적표******************");
		    System.out.print("이름 \t");
		    for(int i = 0;i<subject.length;i++) {
			    System.out.print(subject[i]+"\t");
		    }
		
		    System.out.println("총점\t 평균\t\t학점\t등수");
		    
		    for(int i = 0;i<human;i++) {
			   System.out.print(name[i]+"\t");
			    for(int j = 0;j<subject.length+1;j++) {
				    // System.out.print(" " + jumsu[i][j] + "\t");
			    	System.out.printf("%3d\t",jumsu[i][j]);
			    }
			    // System.out.println(avg[i]+"\t"+grade[i]+"\t"+rank[i]);
			    System.out.printf("%.2f\t%c\t%d\n",avg[i],grade[i],rank[i]);
		    }
			System.out.println("*****************************************");
		
		
		
		
		
		
		/*
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
		*/

		
	}

}
