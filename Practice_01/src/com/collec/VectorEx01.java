package com.collec;

import java.util.*;

class MyVector extends Vector{
	
	public MyVector() {
		super(1, 1);
	}
	
	public void addInt(int i) {
		addElement(new Integer(i));
	}
	
	public void addFloat(float i) {
		addElement(new Float(i));
	}
	
	public void addString(String s) {
		addElement(s);
	}
	
	public void addCharArray(char[] ch) {
		addElement(ch);
	}
	
	public void write() {
		Object o;
		int length = size();
		
		for(int i = 0;i<length;i++) {
			o = elementAt(i);
			if(o instanceof char[]) {
				System.out.println(String.copyValueOf((char[])o));
			}else {
				System.out.println(o.toString());
			}
		}
	}
	
}

public class VectorEx01 {
	
	public static void main(String[] args) {
		
		MyVector mv = new MyVector();
		
		int d = 5;
		float a = 3.14f;
		String st = new String("Hello Java");
		char[] ch = {'J','A','V','A'};
		
		mv.addInt(d);
		mv.addFloat(a);
		mv.addString(st);
		mv.addCharArray(ch);
		
		mv.write();

	}

}
