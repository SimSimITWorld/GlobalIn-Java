package practice_3;

import java.io.IOException;
import java.util.*;

public class C extends B {
	
	static Scanner sc = new Scanner(System.in);
	char ch = ' ';
	
	@Override
	void move1() throws IOException {
		super.move1();
	}
	
	@Override
	void field1() {
		super.field1();
	}
	
	@Override
	void treasure1() {
		super.treasure1();
	}
	
	@Override
	void monster1() {
		super.monster1();
	}

	public static void main(String[] args) throws IOException {
		
		B game = new B();
		game.input();
		
		while(r) {
			game.field1();
			game.move1();
			game.treasure1();
			game.monster1();
		}
		
		
		
	}


}
