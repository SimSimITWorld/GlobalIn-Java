package com.collec;

import java.util.*;

public class VectorEx {
	
	private static final String colors[] = 
		{"검정", "노랑", "녹색", "청색", "빨강", "연두색"};

	public static void main(String[] args) {
		
		Vector<String> st = new Vector<String>();
		
		for(int i = 0;i<colors.length;i++) 
			st.add(colors[i]);
		
		Iterator<String> it = st.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s+" ");
		}

	}

}
