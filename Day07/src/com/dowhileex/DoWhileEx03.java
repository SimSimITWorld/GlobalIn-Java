package com.dowhileex;

import java.util.*;

public class DoWhileEx03 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int sum = 0;
				
		do {
			sum += i;
			if(i<10) {
			System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
				System.out.print(sum);
			}
			i++;
		} while (i <= 10);
				

		

	}

}
