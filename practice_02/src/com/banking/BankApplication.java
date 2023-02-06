package com.banking;

import java.util.*;

public class BankApplication {

	private static Scanner sc = new Scanner(System.in);
	private static Account[] ac = new Account[100];
	
	public static void main(String[] args) {
		
		int n = 0;
		boolean r = true;
		do {
			System.out.println("------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.print("은행 업무선택 : ");
			n = sc.nextInt();
			
			switch(n) {
			case 1: accountcreate(); break;
			case 2: accountlist(); break;
			case 3: deposit(); break;
			case 4: withdraw(); break;
			case 5: System.out.println("프로그램을 종료합니다."); r = false; break;
			default:
				System.out.println("값을 다시 확인해주세요.");
			}
		}while(r);
		

	}
	
	public static void accountcreate() {
		System.out.println("-----------");
		System.out.println("| 계좌 생성 |");
		System.out.println("-----------");
		System.out.print("계좌 번호 입력 : ");
		String account = sc.next();
		System.out.print("계좌 예금주 입력 : ");
		String name = sc.next();
		System.out.print("계좌 초기 금액 입력 : ");
		int balance = sc.nextInt();
		Account bank = new Account(account, name, balance);
		
		for(int i = 0;i<ac.length;i++) {
			System.out.print("결과 : ");
			if(ac[i]==null) {
				System.out.println("계좌가 생성되었습니다.");
				ac[i] = bank;
			}else 
				System.out.println("이미 계좌가 있습니다.");
			break;
		}
	}
	
	public static void accountlist() {
		System.out.println("-------------------------------");
		System.out.println("   계좌 목록                          ");
		System.out.println("   계좌 번호         소유주   잔고");
		System.out.println("-------------------------------");
		
		for(int i = 0;i<ac.length;i++) { 
			Account account = ac[i];
			
			if(ac[i]!=null) {
				System.out.print(account.getAccount());
				System.out.print(" ");
				System.out.print(account.getName());
				System.out.print(" ");
				System.out.print(account.getMoney());
				System.out.print(" \n");
			}
			
		}
	}
	
	public static void deposit() {
		System.out.println("------------------");
		System.out.println("예금");
		System.out.println("------------------");
		System.out.print("계좌 번호 입력 : ");
		String account = sc.next();
		System.out.print("입금 예금액 입력 : ");
		int balance = sc.nextInt();
		
		Account act = findaccount(account);
		if(act==null) {
			System.out.println("계좌가 없습니다.");
			return;
		}
		act.setMoney(act.getMoney()+balance);
		System.out.println("결과 : 예금이 완료(성공)되었습니다.");
	}
	
	public static void withdraw() {
		System.out.println("------------------");
		System.out.println("출금");
		System.out.println("------------------");
		System.out.print("계좌 번호 입력 : ");
		String account = sc.next();
		System.out.print("출금 금액 입력 : ");
		int balance = sc.nextInt();
		
		Account adb = findaccount(account);
		if(adb == null) {
			System.out.println("계좌가 없습니다.");
			return;
		}else {
			if(adb.getMoney()-balance<0) {
				System.out.println("잔액이 부족합니다.");
				return;
			}else {
				adb.setMoney(adb.getMoney()-balance);
				System.out.println("결과 : 출금이 완료(성공)되었습니다.");
			}
		}
		
	}
	

	public static Account findaccount(String account) {
		
		Account account1 = null;
		
		for(int i = 0;i<ac.length;i++) {
			if(ac[i]!=null) {
				String db = ac[i].getAccount();
				if(db.equals(account)) {
					account1 = ac[i];
					return account1;
				}
			}
		}
		return account1;
		
	}
}
