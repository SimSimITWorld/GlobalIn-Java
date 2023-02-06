package banking;

import java.util.*;

public class BankApplication {

	static Scanner sc = new Scanner(System.in);
	Account[] account;
	int select;
	int cnt = 1;
	
	void select() {
		do {
			System.out.println("------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------------");
			if(select>=1 || select<=5) {
		        System.out.print("은행 업무선택 : ");
		        select = sc.nextInt();
			}else
				System.out.println("재선택해주세요.");
		}while(select<1 || select>5);
	}
	
	void create() {
		cnt++;
		account = new Account[cnt];
		for(int i = 0;i<cnt;i++) 
			account[i]=new Account();
		
		System.out.println("------------");
		System.out.println(": 계좌 생성 :");
		System.out.println("------------");
		for(int i = 0; i < account.length;i++) {
			    System.out.print("계좌 번호 입력 : ");
			    account[i].account = sc.next();
			    System.out.print("계좌 예금주 입력 : ");
				account[i].name = sc.next();
				System.out.print("계좌 초기 금액 입력 : ");
				account[i].balance = sc.nextInt();
				System.out.print("결과 : ");
				System.out.println("계좌가 생성되었습니다.");
		}
	}
	
	public static void main(String[] args) {
		
		boolean turn = true;
		while(turn) {
		    BankApplication bank = new BankApplication();
		    while(turn) {
		    	bank.select();
		        switch(bank.select) {
		            case 1:
		    	        bank.create(); break;
		            case 2:
		            case 3:
		            case 4:
		            case 5:
		            	System.out.println("은행 업무 프로그램을 종료합니다.");
		            	turn = false;
		        }
		    }
		}

	}

}
