package study;

import java.io.*;

public class Practice_04 {

	public static void main(String[] args) throws IOException {
		
		// 이름, 나이, 번호, 주소를 입력 받으시오.
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		String name, tel, addr;
		int age;
		
		System.out.print("이름 : ");
		name = br.readLine();
		System.out.print("나이 : ");
		age = Integer.parseInt(br.readLine());
		System.out.print("번호 : ");
		tel = br.readLine();
		System.out.print("주소 : ");
		addr = br.readLine();
		
		System.out.printf("이름 : %s\n나이 : %d\n번호 : %s\n주소 : %s", name, age, tel, addr);
	}

}
