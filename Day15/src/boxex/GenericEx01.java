package boxex;

public class GenericEx01 {

	public static void main(String[] args) {
		
		Box<Integer> bi = new Box<Integer>();
		bi.set(new Integer(10));
		Integer i = bi.get();
		System.out.println(i);
		System.out.println(i instanceof Integer);

	}

}
