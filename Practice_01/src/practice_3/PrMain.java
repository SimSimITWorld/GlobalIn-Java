package practice_3;

/* 문]
 *     1부터 100까지의 수중 3의 배수의 합계를 구하는 프로그램을 작성하시오.
 */

import java.util.*;

public class PrMain{

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<100;i++) {
			if(i%3==0)
				sum+=i;
		}
		
		System.out.println(sum);
		
		
	}

}
