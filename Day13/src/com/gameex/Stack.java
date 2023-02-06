package com.gameex;

public interface Stack {

	int length(); // 현재 스택에 저장된 개수를 리턴
	int capacity(); // 스택 전체 저장 가능한 개수를 리턴
	String pop(); // 스택의 톱(TOP)에 실제수 저장
	boolean push(String val); // 스택의 톱에 저장된 실제 수 리턴
}
