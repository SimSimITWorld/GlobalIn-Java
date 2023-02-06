package com.gene;

import java.util.ArrayList;

class Box<T> {
	
	ArrayList<T> list = new ArrayList<T>();
	
	public void add(T item) {
		list.add(item);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
	
}


public class FruitBoxEx01 {

	public static void main(String[] args) {
		
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
		Box<Grape> grapeBox = new Box<Grape>();
		
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Apple());
		fruitBox.add(new Apple());
		fruitBox.add(new Apple());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		toyBox.add(new Toy());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println();
		
		for(int i = 0;i<fruitBox.size();i++) {
			System.out.print(fruitBox.get(i) + " ");
		}
		
		System.out.println();
		
		for(int i = 0;i<appleBox.size();i++) {
			System.out.print(appleBox.get(i) + " ");
		}
		
	}

}
