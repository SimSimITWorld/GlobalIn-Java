package com.arrayexam;

import java.io.*;

public class ArrayEx03_1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] sub = new int[4];
		// 0:국어점수, 1:영어점수, 2:수학점수, 3:총합
		float avg = 0.0f;
		
		do {
			System.out.print("국어점수 : ");
			sub[0] = Integer.parseInt(br.readLine());
		}while(sub[0]<0 || sub[0]>100);

		do {
			System.out.print("영어점수 : ");
			sub[1] = Integer.parseInt(br.readLine());
		}while(sub[1]<0 || sub[1]>100);
		
		do {
			System.out.print("국어점수 : ");
			sub[2] = Integer.parseInt(br.readLine());
		}while(sub[2]<0 || sub[2]>100);
		
		sub[3] = sub[0] + sub[1] + sub[2];
		
		avg = sub[3]/3.0f;
		
		System.out.printf("국어점수 : %d, 영어점수 : %d, 수학점수 : %d\n총점 : %d\n평균 : %.2f",sub[0],sub[1],sub[2],sub[3],avg);
		
	}

}
