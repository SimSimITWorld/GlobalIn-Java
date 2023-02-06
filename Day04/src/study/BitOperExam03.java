package study;

/* 
 *  swap(교환 : 자리 바꿈) 
 *  
 *  int a, b, temp;
 *  
 *  temp = a;  <---- a 값을 temp로 넘겨줌. a = 빈 값
 *  a = b;       <---- a 에 b 값을 넘겨줌. b = 빈 값
 *  b = temp;  <---- b 에 temp 값을 넘겨줌. temp = 빈 값
 *  
 */

public class BitOperExam03 {

	public static void main(String[] args) {
		
		int a, b; // 개발자는 이렇게 계산 (temp는 C언어)
		a = 5;
		b = 3;
		
		  a = a^b; 
		  b = b^a; 
		  a = a^b; 
		  
		  System.out.println("a, b : " + a + b);
		 
		/*
		 * int temp;
		 * 
		 * temp = a; a = b; b = temp;
		 */
		
		System.out.println("a : " + a + ", b : " + b);
		
	}

}
