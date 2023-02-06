package com.arrayexam2;

import java.io.*;

public class ArrayEx06 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] subname = {"국어", "영어", "수학"};
		int[][] sub = new int[3][subname.length+2];
		// 0: 첫번째 사람, 1: 두번째 사람, 2: 세번째 사람, 3: 총점, 4: 석차
		// subname.length+1 : 국어, 영어, 수학, 총점
		float[] avg = new float[3];
		
		for(int k=0;k<sub.length;k++) { // 사람 : 3
			System.out.println((k+1)+"번째 사람의 ");
			for(int i=0;i<sub[k].length-2;i++) {
				do {
					System.out.print(subname[i]+"점수 : ");
					sub[k][i] = Integer.parseInt(br.readLine());
				} while(sub[k][i]<0 || sub[k][i]>100); // 점수 입력 끝
				// 총점 구함
				sub[k][sub[k].length-2] += sub[k][i];
			}
			// 평균 구함
			avg[k] = sub[k][sub[k].length-2]/(float)(sub[k].length-2);
			sub[k][sub[k].length-1] = 1;
			
		}
		
			
		// 석차 계산
		for(int k = 0;k<sub.length;k++) {
			for(int i = 0;i<sub.length;i++) {
				if(sub[k][sub[k].length-2] < sub[i][sub[i].length-2]) {
					sub[k][sub[k].length-1]++;
					
				}
			}
		}

		
		
		// 출력
		for(int k=0;k<sub.length;k++) {
			System.out.println();
			System.out.println("석차 : " +sub[k][sub[k].length-1] +"등");
			System.out.println("총점 : " + sub[k][sub[k].length-2]);
			System.out.println("평균 : " + avg[k]);
		}
		

	}

}
