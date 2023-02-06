package com.collec;

import java.util.*;

public class VectorEx03 {

	public static void main(String[] args) {
		
		Vector<MyData> list = new Vector<MyData>();
		
		list.add(new MyData("가길동", 50));
		list.add(new MyData("나길동", 60));
		list.add(new MyData("다길동", 70));
		
		for(MyData v : list) {
			System.out.printf("이름 : %s, 나이 : %d\n",v.name,v.age);
		}
		
		
	}

}
