package com.circleex;

import java.util.*;

public class MonthSchedule {
	
	private Scanner sc = new Scanner(System.in);
	private int nDays;
	private Day[] days; // Day 객체 배열
	
	
	public MonthSchedule(int nDays) {
		this.nDays = nDays;
		this.days = new Day[nDays];
		for(int i = 0;i<days.length;i++) {
			days[i] = new Day();
		}
	}
	
	private void input() {
		System.out.print("날짜(1 ~ 30) : ");
		int day = sc.nextInt();
		
		System.out.print("할 일(빈칸없이 입력) : ");
		String work = sc.next();
		
		day--;
		
		if(day<0 || day>29) { // 0 ~ 29
			System.out.println("날짜를 잘못 입력하셨습니다.");
			return;
		}
		
		days[day].set(work);
		
	}
	
	private void view() {
		System.out.print("날짜(1 ~ 30) : ");
		int day = sc.nextInt();
		
		day--;
		
		if(day<0 || day>29) { // 0 ~ 29
			System.out.println("날짜를 잘못 입력하셨습니다.");
			return;
		}
		
		System.out.print((day+1)+ "일의 할 일은 ");
		days[day].show();
	}
	
	private void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {


		System.out.print("글로벌인 IT 4기 스케줄 관리 프로그램");
		while(true) {
			System.out.print("할 일(1.입력, 2.보기, 3.종료) : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1: input(); break;
			case 2: view(); break;
			case 3: finish(); return;
			default:
				System.out.println("잘못 입력 하셨습니다.");
			}
			System.out.println();
			
		}
	}
	

	public static void main(String[] args) {

		MonthSchedule m = new MonthSchedule(30);
		m.run();

	}

}
