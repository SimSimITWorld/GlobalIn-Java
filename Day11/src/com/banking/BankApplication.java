package com.banking;
import java.util.*;
public class BankApplication {
	
	private static Scanner sc = new Scanner(System.in);
	private static Account[] accountArray = new Account[100];
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
		
			System.out.println("------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------------");
			
			System.out.print("은행 업무선택 : ");
			int selectNo = sc.nextInt();
			/*
			switch(selectNo) {
			case 1:
			    createAccount();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				run = false;
			}
			*/
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				System.out.print("은행 업무를 종료 합니다.");
				run = false;
			}
		}
		

	} // end main

	// 계좌생성
	private static void createAccount() {
		
		System.out.println("-------------");
		System.out.println(": 계좌   생성 : ");
		System.out.println("-------------");
		
		System.out.print("계좌 번호 입력 : ");
		String ano = sc.next();
		System.out.print("계좌 예금주 입력 : ");
		String owner = sc.next();
		System.out.print("계좌 초기 금액 입력 : ");
		int balance = sc.nextInt();
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i = 0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	// 계좌 목록 보기
	private static void accountList() {
		System.out.println("------------------------------");
		System.out.println("     계좌  목록               ");
		System.out.println("     계좌  번호      소유주   잔고");
		System.out.println("------------------------------");
		
		for(int i = 0;i<accountArray.length;i++) {
			Account account = accountArray[i];
			
			if(account!=null) {
				System.out.print(account.getAno());
				System.out.print(" ");
				System.out.print(account.getOwner());
				System.out.print(" ");
				System.out.print(account.getBalance());
				System.out.println();
			}
		}
	}
	// 예금
	private static void deposit() {
		System.out.println("----------------------");
		System.out.println("예금");
		System.out.println("----------------------");
		System.out.print("계좌 번호 입력 : ");
		String ano = sc.next();
		System.out.print("입금 예금액 입력 : ");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) { // 계좌가 없을 경우
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		
		account.setBalance(account.getBalance()+money);
		System.out.println("결과 : 예금이 완료(성공)되었습니다.");
	}
	
	// 출금
	private static void withdraw() {
		System.out.println("----------------------");
		System.out.println("출금");
		System.out.println("----------------------");
		System.out.print("계좌 번호 입력 : ");
		String ano = sc.next();
		System.out.print("출금 금액 입력 : ");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) { // 계좌가 없을 경우
			System.out.println("결과 : 계좌가 없습니다.");
			return;
		}
		
		account.setBalance(account.getBalance()-money);
		System.out.println("결과 : 출금이 완료(성공)되었습니다.");
	}
	
	// Account 배열 ano와 동일한 Account 객체 찾기
	
	private static Account findAccount(String ano) {
		
		Account account = null;
		
		for(int i = 0;i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	} // end findAccount
	
	
}
