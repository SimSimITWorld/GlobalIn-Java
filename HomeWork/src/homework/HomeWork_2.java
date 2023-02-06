package homework;
/*
 * 문1]
   임의의  알파벳 한 문자를 입력받아 모음인지
   자음인지를 판정하는 프로그램을 삼항 연산자를 이용하여 작성하시오.
   단, 대소문자 모두 적용하고, 문자외의 문자 입력 되면 
   입력오류를 출력하시오.
 */
import java.io.*;

public class HomeWork_2 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.print("알파벳 하나 입력 : ");
		char ch = (char)System.in.read();
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
		String value = (ch=='a' || ch =='e' || ch == 'o' || ch == 'i' || ch =='u' || ch=='A' || ch =='E' || ch == 'O' || ch == 'I' || ch =='U') ? "모음 입니다." : "자음 입니다.";
		System.out.println(value);
		}else {
			System.out.println("입력오류");
		}
	}

}
