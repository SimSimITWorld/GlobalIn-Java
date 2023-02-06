package study;

/* char : C언어에서는 char 은 1byte 지만 java는 2byte로 처리됨
 * 
 */

public class CharEx {

	public static void main(String[] args) {
		
		char ch1 = 'A';
		char ch2 = '\u0041';
		
		System.out.println("ch1 + ch2 = " + ch1 + ch2 ); // AA
		System.out.println("ch1 + ch2 = " + (ch1 + ch2)); // 130
		
		System.out.println("ch1 + ch2 = " + (char)(ch1 + ch2));
		

	}

}
