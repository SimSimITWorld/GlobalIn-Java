package practice_3;

import java.io.IOException;
import java.util.*;

public class GamePlay extends Gamefield {
	
	static Scanner sc = new Scanner(System.in);
	char ch = ' ';
	
	@Override
	void move() throws IOException {
		super.move();
	}
	
	@Override
	void field() {
		super.field();
	}
	
	@Override
	void treasure() {
		super.treasure();
	}

	public static void main(String[] args) throws IOException {
		
		boolean r = true;
		GamePlay gp = new GamePlay();
		gp.input();
		while(r) {
		    if(gp.a==gp.random1 && gp.b==gp.random2) {
		        gp.field();
		        System.out.print("보물을 획득했습니다.");
		        r = false;
		    }else if(gp.a==gp.mon_random1 && gp.b==gp.mon_random2) {
		    	gp.field();
		    	System.out.print("몬스터에게 사살당했습니다.");
		    	r = false;
		    }else {
		        gp.field();
		        gp.move();
		    }
		}
	}


}
