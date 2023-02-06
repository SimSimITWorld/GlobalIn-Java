package com.setex;

import java.util.*;

class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
	
}


public class HashSetEx02 {

	public static void main(String[] args) {
		
		HashSet<Object> set = new HashSet<Object>();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		System.out.println(set);

		
	}

}
