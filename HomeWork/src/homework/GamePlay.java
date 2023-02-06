package homework;

import java.io.IOException;
import java.util.*;

public class GamePlay extends GameSetting {
	
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
	
	@Override
	void monster() {
		super.monster();
	}

	public static void main(String[] args) throws IOException {
		
		GameSetting game = new GameSetting();
		game.input();
		
		while(r) {
			game.field();
			game.move();
			game.treasure();
			game.monster();
		}
		
		
		
	}


}
