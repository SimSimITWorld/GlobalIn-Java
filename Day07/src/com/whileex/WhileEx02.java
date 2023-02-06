package com.whileex;

public class WhileEx02 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while (i <= 10) {
				sum += i;
				if(i<10) {
				System.out.print(i + " + ");
				} else {
					System.out.print(i + " = ");
					System.out.print(sum);
				}
				i++;
				
			
		}

	}

}
