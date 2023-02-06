package practice_2;

import java.util.*;

public class Concert {

	static Scanner sc = new Scanner(System.in);
	private int select;
	private int menu;
	private String[] S = new String[10];
	private String[] A = new String[10];
	private String[] B = new String[10];
	
	void input() {
		System.out.println("- 글로벌인 콘서트 예약프로그램");
		System.out.println("1: 예약, 2: 조회, 3: 취소, 4: 종료  ==> ");
		this.select = sc.nextInt();
		
		if(select==1) {
			System.out.print("좌석구분 : S(1), A(2), B(3)  ==> ");
			this.menu = sc.nextInt();
			if(menu==1) {
				
			}
		}
		
		
	}
	
}
