package com.collec;

import java.util.*;

public class QueueEx {
	
	private static final String[] colors =
		{"검정", "노랑", "녹색", "청색", "빨강", "연두색"};
	

	public static void main(String[] args) {
		
		Queue<String> qu = new LinkedList<String>();
		
		for(String str : colors) {
			qu.offer(str);
		}
		
		while(qu.peek() != null) {
			System.out.print(qu.poll()+" ");
		}

	}

}
