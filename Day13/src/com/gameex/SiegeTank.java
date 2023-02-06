package com.gameex;

public class SiegeTank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Move it! Move it! SiegeTank ==> x : " + x + ", y : " + y);
	}

	@Override
	void stop() {
		System.out.println("Destination?");
	}

	@Override
	void message() {
		System.out.print("Message :: Go, Siege !!!");
	}

	void changeMod() {
		System.out.println("Yes. Sir!!!");
	}
}
