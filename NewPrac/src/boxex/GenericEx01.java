package boxex;

public class GenericEx01 {

	public static void main(String[] args) {
		
		Box<Integer>bb = new Box<Integer>();
		bb.setT(new Integer(10));
		Integer i = bb.getT();
		System.out.println(i);
		System.out.println(i instanceof Integer);

	}

}
