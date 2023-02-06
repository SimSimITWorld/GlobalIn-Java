package com.collec;

import java.util.*;

public class VectorEx {

	private static final String colors[] = 
		{"검정", "노랑", "녹색", "청색", "빨강", "연두색"};
	
	public static void main(String[] args) {
		
		int i;
		String str;
		
		Vector<String> v = new Vector<String>();
		for(i = 0;i<colors.length;i++) {
			v.add(colors[i]);
		}

		// 전체 출력
		/*
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s+" ");
		}
		*/
		
		for(Object o : v) {
			String s = (String)o;
			System.out.print(s + " ");
		}
	}

}
