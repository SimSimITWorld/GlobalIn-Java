package homework;

/* 문]
 *     컴퓨터와 사용자 사이의 가위 바위 보 게임을 만듦
 *     
 *     사용자가 먼저 시작한다. 사용자가 가위 바위 보 중 하나를 입력하고 Enter 키를 치면
 *     프로그램은 가위 바위 보 중에서 랜덤하게 하나를 선택하고 컴퓨터가 낸 것으로 함
 *     사용자가 입력한 값과 컴퓨터가 랜덤으로 선택한 값을 비교하여 누가 이겼는지를 판단함
 *     사용자가 가위바위보 대신 그만을 입력하면 프로그램을 종료함
 *     
 *     컴퓨터와 가위 바위 보 게임을 시작합니다.
 *     가위바위보 => 바위
 *     사용자 :  바위, 컴퓨터 : 가위, 사용자가 이겼습니다.
 *     
 *     가위바위보 => 가위
 *     사용자 : 가위, 컴퓨터 :  가위, 비겼습니다.
 *     가위바위보  => 그만
 *     게임을 종료 합니다.
 *     
 *     가위바위보가 아닌 경우
 *     다시 하세요.
 */

import java.util.*;

public class HomeWork_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] computer = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위 바위 보 게임을 시작합니다.");
		while(true) {
			System.out.print("가위바위보 => ");
			String n = sc.next();
			int r = (int)(Math.random()*3);
			String user = computer[r];
			if(n.equals("그만")){
				System.out.println("게임을 종료합니다.");
				break;
			}
			int i;
			for(i =0;i<computer.length;) {
			    if(n.equals("가위")&&user.equals("보") || n.equals("보")&&user.equals("바위") || n.equals("바위")&&user.equals("가위")){
			    	System.out.printf("사용자 : %s, 컴퓨터 : %s, 사용자가 이겼습니다.\n",n,user);
			    	break;
			    }else if(n.equals("가위")&&user.equals("가위") || n.equals("바위")&&user.equals("바위") || n.equals("보")&&user.equals("보")){
			    	System.out.printf("사용자 : %s, 컴퓨터 : %s, 비겼습니다.\n",n,user);
			    	break;
			    }else if(n.equals("가위")&&user.equals("바위") || n.equals("바위")&&user.equals("보") || n.equals("보")&&user.equals("가위")){
			    	System.out.printf("사용자 : %s, 컴퓨터 : %s, 사용자가 졌습니다.\n",n,user);
			    	break;
			    }else {
			    	System.out.println("다시하세요.");
			    	break;
			    }
			}
		}
		

	}

}
