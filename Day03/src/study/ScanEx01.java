package study;

import java.util.*;

public class ScanEx01 {

	public static void main(String[] args) {
		
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);

		
		String name;
		int age;
		char gender;
		double height;
		
		System.out.print("이름 입력 : ");
		name = sc.next(); // 문자열 입력
		System.out.print("나이 입력 : ");
		age = sc.nextInt(); // 정수 입력
		System.out.print("성별 입력 : ");
		gender = sc.next().charAt(0); // 문자 입력
		System.out.print("키 입력 : ");
		height =  sc.nextDouble();
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("키 : "+ height);
	}

}
