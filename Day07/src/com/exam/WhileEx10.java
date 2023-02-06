package com.exam;

/* 문]
 *      1.콜라, 2.사이다, 3.마운틴, 4.초코송이, 5.에이스, 6.웨하스가 나오는 자판기 프로그램을 작성하시오.
 *      종료는 0번으로 해서 프로그램 완성. 위의 메뉴 외의 메뉴는 선택하신 상품이 없습니다. 
 *      메뉴 입력 : Scanner
 *      while, switch ~ case
 */

import java.util.*;


public class WhileEx10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("메뉴 입력 : ");
			int menu = sc.nextInt();
			if(menu>=0 && menu<=6) {
			switch(menu) {
			    case 1:
				    System.out.println("콜라를 선택하셨습니다.");
				    break;
			    case 2:
			    	System.out.println("사이다를 선택하셨습니다.");
			    	break;
			    case 3:
			    	System.out.println("마운틴을 선택하셨습니다.");
			    	break;
			    case 4:
			    	System.out.println("초코송이를 선택하셨습니다.");
			    	break;
			    case 5:
			    	System.out.println("에이스를 선택하셨습니다.");
			    	break;
			    case 6:
			    	System.out.println("웨하스를 선택하셨습니다.");
			    	break;
			    default:
			    	System.out.println("종료");	
			    }
			} else {
				System.out.println("선택하신 상품이 없습니다.");
			}
			break;
		}
		
		int n = 0;
		while(n>=0 && n<=6) {
			System.out.print("메뉴 입력 : ");
			n = sc.nextInt();
			switch(n) {
			    case 1:
			    	System.out.println("콜라를 선택하셨습니다.");
			    	continue;
			    case 2:
			    	System.out.println("사이다를 선택하셨습니다.");
			    	continue;
			    case 3:
			    	System.out.println("마운틴을 선택하셨습니다.");
			    	continue;
			    case 4:
			    	System.out.println("초코송이를 선택하셨습니다.");
			    	continue;
			    case 5:
			    	System.out.println("에이스를 선택하셨습니다.");
			    	continue;
			    case 6:
			    	System.out.println("웨하스를 선택하셨습니다.");
			    	continue;
			    case 0:
			    	System.out.println("종료");		
			    	break;
			    default:
			    	System.out.println("선택하신 상품이 없습니다.");
			}
		} 
		
		
		int n1 = 1; // 메뉴
		String str = "";
		
		while(n1 != 0) {
			System.out.print("1.콜라, 2.사이다, 3.마운틴, 4.초코송이, 5.에이스, 6.웨하스, 0.종료 : ");
			n1 = sc.nextInt();
			switch(n1) {
			    case 0:
			    	System.exit(0);
			    	break;
			    case 1:
				    str = "콜라";
				    break;
			    case 2:
			    	str = "사이다";
			    	break;
			    case 3:
			    	str = "마운틴";
			    	break;
			    case 4:
			    	str = "초코송이";
			    	break;
			    case 5:
			    	str = "에이스";
			    	break;
			    case 6:
			    	str = "웨하스";
			    	break;
			    	default:
			    		str = "선택하신 상품이 없습니다.";
			}
		}
		System.out.println("당신이 선택한 상품은 " + str + "입니다.");
		

	}

}
