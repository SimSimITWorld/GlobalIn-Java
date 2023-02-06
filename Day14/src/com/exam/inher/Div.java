package com.exam.inher;

public class Div extends Calc {
	
	@Override
	public int calculate() {
		
		if(a>0)
			return a/b;
		else
			System.out.println("0보다 작습니다.");
		    return -1;
		
	}

}
