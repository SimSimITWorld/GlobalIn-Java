package card;

import java.util.ArrayList;

class cardGame<T>{
	
	ArrayList<T> list = new ArrayList<T>();
	
	public void add(T card) {
		list.add(card);
	}
	
	T get(int i) {
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}
	
	public String toString() {
		return list.toString();
	}
}

public class Card {

	public static void main(String[] args) {
		
		cardGame<Clover> clover = new cardGame<Clover>();
		cardGame<Diamond> diamond = new cardGame<Diamond>();
		cardGame<Heart> heart = new cardGame<Heart>();
		cardGame<Spaid> spaid = new cardGame<Spaid>();
	
		clover.add(new Clover());
		clover.add(new Diamond());
		clover.add(new Heart());
		clover.add(new Spaid());
		
		for(int i = 0;i<clover.size();i++) {
			System.out.print(clover);
		}
	}

}
