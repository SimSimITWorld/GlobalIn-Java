package com.gameex;

public class StringStack implements Stack {

	// 스택에 저장할 공간 확보
	private String[] element;
	private int tos; // index : top of stack
	
	public StringStack(int capacity) {
		element = new String[capacity];
		tos = -1;
	}
	
	@Override
	public int length() {
		// 현재 스택에 저장된 개수 리턴
		return tos+1;
	}

	@Override
	public int capacity() {
		return element.length;
	}

	@Override
	public String pop() {
		// 스택이 비었음
		if(tos==-1)
		    return null;
		String s = element[tos]; // 톱에 있는 값을 의미함
		tos--; // 스택 포인터 감소
		return s;
	}

	@Override
	public boolean push(String val) {
		if(tos == element.length-1)
		    return false; // 스택이 다 찼을 경우
		else {
			tos++;
		    element[tos] = val; // 값을 스택에 저장 후 스택 포인터 증가
		    return true;
		}
	}

}
