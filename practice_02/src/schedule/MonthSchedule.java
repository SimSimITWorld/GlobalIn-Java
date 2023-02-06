package schedule;

import java.util.*;

public class MonthSchedule {
	
	private Scanner sc = new Scanner(System.in);
	private int nDay;
	private Day[] days;
	
	public MonthSchedule(int nDay) {
		this.nDay = nDay;
		this.days = new Day[nDay];
		for(int i = 0;i<days.length;i++) {
			days[i] = new Day();
		}
	}
	
	public void input() {
		
			System.out.print("날짜(1 ~ 30) : ");
			int day = sc.nextInt();
			System.out.print("할 일(빈칸없이 입력) : ");
			String work = sc.next();
			
			day--;
			
			if(day<0 || day>29) {
				System.out.println("날짜범위를 벗어났습니다.");
				return;
			}
			
			days[day].setWork(work);
			System.out.println("할 일이 업로드 되었습니다.");
		
	}
	
	public void view() {
		
		System.out.print("날짜(1 ~ 30) : ");
		int day = sc.nextInt();
		
		day--;
		
		if(day<0 || day>29) {
			System.out.println("범위를 벗어났습니다.");
			return;
		}
		
		System.out.print((day+1)+"일의 할 일은 ");
		days[day].show();
		
	}
	
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		System.out.print("글로벌인 IT 4기 스케줄 관리");
		
		while(true) {
			System.out.print("할 일(1.입력, 2.보기, 3.종료) : ");
			int n = sc.nextInt();
			
			switch(n) {
			case 1: input();break;
			case 2: view(); break;
			case 3: finish(); return;
			default:
				System.out.println("범위를 벗어났습니다.");
			}
		}
		
	}
	
	public static void main(String[] args) {
	
		MonthSchedule schedule = new MonthSchedule(30);
		
		schedule.run();
		
		

	}

}
