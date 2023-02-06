package study;

/* 삼항 연산자
 * 
 *  조건항 ?(if) 참일때(true) :(else) 거짓일때(false)
 */ 



public class OperExam03 {

	public static void main(String[] args) {
		
		int a = 20, b = 30, max;
		

		max = a > b ? ++a : ++b;
		
		
		
		System.out.println("max: " + max);
		System.out.println("a : " + a);
		System.out.println("b : " + b);

		
	}

}
