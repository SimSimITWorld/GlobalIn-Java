package com.inher;

public class Tiger extends Animal {

	private String name;
	
	public Tiger() {
		name = getClass().getSimpleName();
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String scream() {
		
		return "그르르 어흥 어흥 ~~~~~";
	}
	
}
