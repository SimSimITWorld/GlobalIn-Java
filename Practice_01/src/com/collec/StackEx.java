package com.collec;

import java.util.Stack;

public class StackEx {
	
	private static final String colors[] =
		{"검정", "노랑", "녹색", "청색", "빨강", "연두색"};
	
	public StackEx() {
		Stack<String> st = new Stack<String>();
		
		for(String color : colors) {
			st.push(color);
		}
		popStack(st);
	}
	
	
	private void popStack(Stack<String> st) {
		
		System.out.println("pop");
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
	}


	public static void main(String[] args) {
		
		new StackEx();

	}

}
