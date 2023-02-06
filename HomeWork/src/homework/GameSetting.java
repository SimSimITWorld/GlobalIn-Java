package homework;

import java.io.IOException;
import java.util.*;

public class GameSetting extends GameCommand {
	
	String gold = "G";
	String boss = "M";
	int a = 1;
	int b = 1;
	static Scanner sc = new Scanner(System.in);
	static int wide;
	static int height;
	static String[][] field;
	static String[][] me;
	static boolean r = true;
	char ch = ' ';
	int random1;
	int random2;
	int mon_random1;
	int mon_random2;
	
	
	void input() {
		System.out.print("필드 가로 사이즈 입력 : ");
	    this.wide = sc.nextInt();
	    System.out.print("필드 세로 사이즈 입력 : ");
	    this.height = sc.nextInt();
	    field = new String[height][wide];
	    me = new String[a][b];
	    do {
	    random1 = (int)((Math.random())*height);
	    random2 = (int)((Math.random())*wide);
	    }while(random1 == a && random2 ==b || random1 < 1 || random2 < 1 || random1 > field.length-2 || random2 > field[0].length-2);
	}
	
	
	@Override
	void field() {
		do {
		mon_random1 = (int)(Math.random()*height);
		mon_random2 = (int)(Math.random()*wide);
		}while(mon_random1==random1 && mon_random2==random2 || mon_random1 < 1 || mon_random2 < 1 || mon_random1 > field.length-2 || mon_random2 > field[0].length-2);
		for(int i = 0;i<field.length;i++) {
			for(int j = 0;j<field[i].length;j++) {
				if(i==0 || j==0 || i==field.length-1)
					System.out.print("#");
				else if(j>0 && j<field[i].length-1)
					if(a==i && b==j) {
						for(int k = 0;k<1;k++)
							if(mon_random1 == a && mon_random2 == b) {
								System.out.print("M");
							}
							System.out.print("@");
					}else if(random1==i && random2==j){
						System.out.print("G");
					}else if(mon_random1==i && mon_random2==j) {
						System.out.print("M");
					}else
					    System.out.print("ㅤ");
				if(j==field[i].length-1)
					System.out.print("#");
				
			}
			System.out.println();
		}
	}

	@Override
	void move() throws IOException {
	
		System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l) : ");
		ch = sc.next().charAt(0);
		switch(ch) {
		case 'h':
			if(b>1) this.b--;
			else System.out.println("범위를 벗어났습니다.");
			break;
		case 'j':
			if(a>1) this.a--;
			else System.out.println("범위를 벗어났습니다."); 
			break;
		case 'k':
			if(a<field.length-2) this.a++;
			else System.out.println("범위를 벗어났습니다.");
			break;
		case 'l':
			if(b<field[0].length-2) this.b++; 
			else System.out.println("범위를 벗어났습니다.");
			break;
		default:
			System.out.println("없는 Key 입니다.");
		}
	}
	
	@Override
	void treasure() {
		    if(a==random1 && b==random2) {
		        field();
		        System.out.println("보물을 획득했습니다.");
		        r = false;
		    }
	}
	
	@Override
	void monster() {
		if(a==mon_random1 && b==mon_random2) {
	    	field();
	    	System.out.println("몬스터에게 사살당했습니다.");
	    	r = false;
	    }
	}

}

