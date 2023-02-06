package com.arrayex;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		int[][][] aa = new int[2][3][4];
	//	int[][][] aa = new int[면][행][열]; 배열의 크기 :  면 * 행 * 열
    
		int i,j,k, val=1;
		for(k = 0;k<2;k++) { // 면
			for(i = 0;i<3;i++) { // 행
				for(j = 0;j<4;j++) { // 열
					aa[k][i][j] = val;
					val++;
				}
			}
		}
		
		/*
		 * int[][][] aa = { // 면
				//배열의 선언과 동시에 초기화
				{ // 첫번째 면
					{1,2,3,4},    // 행
					{5,6,7,8},    // 행
					{9,10,11,12}// 행
				},
				{ // 두번째 면
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12}
				}
				
		};
		*/
		
		// int i,j,k, val=1;
		for(k = 0;k<2;k++) { // 면
			for(i = 0;i<3;i++) { // 행
				for(j = 0;j<4;j++) { // 열
					
					// System.out.printf("aa[%d][%d][%d]\t",k,i,j);
					System.out.printf("%d\t",aa[k][i][j]);
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
