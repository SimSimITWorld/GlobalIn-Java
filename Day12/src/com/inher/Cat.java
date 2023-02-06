package com.inher;

public class Cat extends Animal {

	public String getName() {
		return name;
	}

	private String name;
	
	public Cat() {
		name = getClass().getSimpleName();
	}
	
	@Override
	public String scream() {
		
		return "야옹 야옹 ~~~~~";
	}
	
}
