package genericex;

public class Gene<T> {

	T[] s;
	
	public void set(T[] n) {
		s = n;
	}
	
	public void print() {
		for(T g : s) {
			System.out.print(g + " ");
		}
	}
}
