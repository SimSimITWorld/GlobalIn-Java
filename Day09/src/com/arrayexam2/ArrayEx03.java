package com.arrayexam2;

/* 레기드 배열, 가변 배열, 비정형 배열
 *  - 가변 배열은 행마다 열의 개수가 서로 다른 배열을 의미한다.
 *  
 *  int arr[][];
 *   arr = new int[4][];
 *   arr[0] = new int[1];
 *    행               열 : 첫번째 행에는 열이 하나
 *   arr[1] = new int[2];
 *   두번째 행        열이 두개
 *   arr[2] = new int[3];
 *   arr[3] = new int[4];
 *  
 */

public class ArrayEx03 {

	public static void main(String[] args) {
		
		int arr[][] = new int [4][];
		
		// 첫번째 행의 열이 3개
		arr[0] = new int[3]; // 10, 11, 12
		// 두번째 행의 열이 2개
		arr[1] = new int[2]; // 20, 21
		// 세번째 행의 열이 3개
		arr[2] = new int[3]; // 30, 31, 32
		// 네번째 행의 열이 2개
		arr[3] = new int[2]; // 40, 41
		
		// 배열에 값을 저장
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				arr[i][j] = (i+1)*10+j;
			}
		}
		
		// 배열에 저장된 값을 출력
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		

	}

}
