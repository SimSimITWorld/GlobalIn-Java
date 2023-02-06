package homework;

/*문2]
    사용자로 부터 임의의 년도를 입력받아 윤년인지 평년인지를 판별하는 
    프로그램을 삼항 연산자를 이용하여 작성하시오.
     
     윤년 >>> 년을 4로 나누어서 떨어진다. 
                   년 400으로 나누어 떨어진다.
                  년을 100으로 나누어 떨어지지 않으면됨 
 * 
 */

import java.io.*;

public class HomeWork_3 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.print("윤년/평년 판독기 : ");
		int year = Integer.parseInt(br.readLine());
		
		
		String value = ((year%4==0) && (year%400==0) || (year%100!=0)) ? "윤년" : "평년";
		
		System.out.println(value);

	}

}
