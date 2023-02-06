package com.arraylistex;

import java.util.*;

public class LinkedListEx {

	private static String[] color1 = {"검정", "노랑", "녹색", "파랑", "주황색", "연두색"};
	private static String[] color2 = {"초록", "빨강", "흰색", "남색", "보라"};
	
	public LinkedListEx() {
		LinkedList<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();
		
		for(String li1 : color1) 
			list1.add(li1);
		
			
		for(String li2 : color2) 
			list2.add(li2);
		
		list1.addAll(list2);
		printList(list1);
		
	}
	
	public void printList(List<String> list) {
		System.out.println("\n list....");
		
		for(String color : list) {
			System.out.print(color + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		new LinkedListEx();
		

	}

}
