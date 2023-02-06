package homework;

import java.util.*;

public class HomeWork_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값 입력 : ");
		int n = sc.nextInt();
		
			for(int a = 2;a<10;a+=n) {
				for(int j =1;j<10;j++) {
					for(int i = a; i<a+n&&i<10;i++) {
						System.out.printf("%d * %d = %d\t\t", i,j,i*j);
					}
					System.out.println();
				}
				System.out.println();
			}
	}

}
