package practice_2;

import java.util.*;

public class Practice0 {
	private static Scanner sc = new Scanner(System.in);
	private static Account[] accountArray = new Account[100];
	public static void main(String[] args) {
		
		boolean action = true;
		int n;
		
		while(action) {
		    System.out.println("------------------------------------------------");
		    System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		    System.out.println("------------------------------------------------");
		    System.out.print("어떤 업무를 실행시키겠습니까? ");
		    n = sc.nextInt();
		    switch(n) {
		        case 1:
		        	input();
		        	break;
		        case 2:
		        	accountList();
		        	break;
		        case 3:
		        	break;
		        case 4:
		        	break;
		        case 5:
		 	        action = false;
		    }
		}
	
		
	}
	
	static void input() {
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("계좌번호 입력 : ");
		String account = sc.next();
		System.out.print("처음 입금할 금액 : ");
		int balance = sc.nextInt();
		Account ac = new Account(name, account, balance);
		
		for(int i = 0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i] = ac;
				System.out.println("계좌 개설 완료");
				break;
			}
		}
	}
	
	static void accountList() {
		for(int i =0;i<accountArray.length;i++) {
			Account account = accountArray[i];
			if(accountArray[i]!=null) {
				System.out.print(account.getName()+" "+account.getAccount()+" "+account.getBalance()+"\n");
			}
		}
	}
}	
class Account{
	
	private String name;
	private String account;
	private int balance;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public Account(String name, String account, int balance) {
		this.name = name;
		this.account = account;
		this.balance = balance;
	}
	
}
		