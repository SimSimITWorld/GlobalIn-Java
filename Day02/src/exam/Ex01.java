package exam;

/*  문1] 
 *        문자 하나를 입력받아 출력하는 프로그램 작성
 */
import java.util.*;

public class Ex01 {

	public static void main(String[] args)  { // 예외전가
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("하나의 문자 입력 : ");
		char a = sc.next().charAt(0);
		
		System.out.println("입력 받은 문자 : " + (int)a);
		
		
	}

}
