package study;

/* Wrapper : 기본 데이터형(자료형)의 class화 시킴
 * 
 *  byte --> Byte, short --> Short, int --> Integer
 *  long --> Long
 *  
 *   float --> Float, double --> Double
 *   
 *   boolean --> Boolean, char --> Character
 *   
 *   변수의 값을 알아볼 수 있음 (변하지 않는 값) -> 상수
 */

public class WrapperEx {

	public static void main(String[] args) {
		
		byte a_min = Byte.MIN_VALUE;
		byte a_max = Byte.MAX_VALUE;
		
		// 변수를 상수화 시킴 (변수 final 사용 시 값을 고정시킴)
		int a = 7;
		a = 10;
		
		float f_min = Float.MIN_VALUE;
		
		int aa;
		

		// 문자열을 숫자열로 바꿀 때 변환기
		Integer.parseInt(null);
		Float.parseFloat(null);
		Double.parseDouble(null);
		
		System.out.println(a_min);
		System.out.println(a_max);
		
		System.out.println(f_min);
		
		char c_min = Character.MIN_VALUE;
		char c_max = Character.MAX_VALUE;
		System.out.println(c_min);
		System.out.println(c_max);
	}

}
