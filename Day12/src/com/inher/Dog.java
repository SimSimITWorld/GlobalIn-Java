package com.inher;

public class Dog extends Animal {

	private String name;
	
	public Dog() {
		name = getClass().getSimpleName();
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String scream() {
		
		return "멍멍 멍~~~~~~~~~";
	}
}
