package com.gene;

import java.util.*;

class Box<T>{
	
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

public class FruitBox {

	public static void main(String[] args) {
		
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Grape> grapeBox = new Box<Grape>();
		
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		for(int i = 0;i<fruitBox.size();i++) {
			System.out.print(fruitBox.get(i)+" ");
		}
		

	}

}
