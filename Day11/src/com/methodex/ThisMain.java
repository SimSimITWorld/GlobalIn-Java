package com.methodex;

public class ThisMain {

	public static void main(String[] args) {
		
		ThisEx te = new ThisEx();
		
		System.out.println("이     름 : " + te.getName());
		System.out.println("주민번호 : " + te.getJumin());
		System.out.println("전화번호 : " + te.getTel());
		
		System.out.println(te);

	}

}
