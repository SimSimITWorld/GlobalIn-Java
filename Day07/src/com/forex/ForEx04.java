package com.forex;

public class ForEx04 {

	public static void main(String[] args) {
		
		int i, j, k, a= 1;
		
		
		for(i =2;i <=9; i++) {
			for(j = 1;j <=9; j++) {
				System.out.printf("%3d x %3d = %3d\n", i , j ,i*j);
			}
			System.out.println();
		}
		
		
		
		for(k=1; k <=3; k++) { // 면
			for(i = 1; i<= 5; i++) { // 행
				for(j = 1;j <=5;j++) { // 열
					System.out.printf("%d\t",a++);
				}
				System.out.println();
			}
			System.out.println();
		}
		
		i = 2;
		a = 1;
		while (i <= 9) {
			System.out.printf("%3d x %3d = %3d\n",i,a,i*a);
			a++;
			if(a > 9) {
				i++;
				a=1;
				System.out.println();
			}
		}
		
		i = 2;
		a = 1;
		do {
			System.out.printf("%3d x %3d = %3d\n",i,a,i*a);
			a++;
			if(a > 9) {
				i++;
				a=1;
				System.out.println();
			}
		}while(i<=9);
		
}
}
