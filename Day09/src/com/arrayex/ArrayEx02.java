package com.arrayex;

public class ArrayEx02 {

	public static void main(String[] args) {
		
	  //int[][] aa = new int[3][4];
	  //int[][] aa = new int[행][열]; 배열의 크기 : 행 * 열 : 12
		
		// int i, k;
		// int val = 1;
		// 배열에 데이터 저장
		/*
		for(i=0;i<3;i++) {
			for(k=0;k<4;k++) {
				aa[i][k] = val; //1
				val++; //2
			}
		}
        */
		
		int[][] aa = {
				{1, 2, 3, 4},      // 행
				{5, 6, 7, 8},      // 행
				{9, 10, 11, 12}  // 행
			//  열, 열, 열, 열
		                 };
		
		
		// 배열에 저장된 데이터를 출력
		/*
		for(i=0;i<3;i++) {
			for(k=0;k<4;k++) {
				System.out.printf("%5d",aa[i][k]);
			}
			System.out.println();
		}
	    */
		
		int bb[][]  = {{2,3}, {3,6,9}, {4,5,7,8}};
		
		for(int i = 0; i <= bb.length;i++) {
			for(int j = 0;j<bb[i].length;j++) {
				System.out.print(bb[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
