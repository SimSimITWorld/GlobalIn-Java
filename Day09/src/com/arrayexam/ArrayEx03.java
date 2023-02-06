package com.arrayexam;

import java.io.*;

public class ArrayEx03 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] subname = {"국어", "영어", "수학"}; // 과목명
		// 0, 1, 2
		int[] sub = new int[subname.length+1]; // 총합계 , 3
	//	int[] sub = new int[4];
		float avg = 0.0f;
		
		for(int i = 0;i<sub.length-1;i++) { 
			// 과목 점수
			do {
				System.out.print(subname[i]+" 점수 : ");
				sub[i] = Integer.parseInt(br.readLine());
			} while(sub[i]<0 || sub[i]>100);
			sub[sub.length-1] += sub[i]; // 누적 합계
			// 총합계
			
		}

		avg = sub[sub.length-1]/(float)(sub.length-1);
		System.out.printf("%s점수 : %d, %s점수 : %d, %s점수 : %d\n총점 : %d\n평균 : %.2f",subname[0],sub[0],subname[1],sub[1],subname[2],sub[2],sub[3],avg);

	}

}
