package practice_1;

import java.util.*;

public class Practice_2 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 ");
		String person = sc.nextLine();
		char num = person.charAt(7);
		
		switch (num) {
		    case '1': case '3':
		    	switch (num) {
		    	    case '1':
		    	    	System.out.println("남자, 2000년 이전 출생");
		    	    	break;
		    	    case '3':
		    	    	System.out.println("남자, 2000년 이후 출생");
		    	    	
		    	}
		    	break;
		    case '2': case '4':
		    	switch(num) {
		    	    case '2':
		    	    	System.out.println("여자, 2000년 이전 출생");
		    	    	break;
		    	    case '4':
		    	    	System.out.println("여자, 2000년 이후 출생");
		    	    	break;
		    	    
		    	}break;
		    	default :
		    	System.out.println("유효하지 않은 주민등록번호입니다.");
		}
				
	}

}
