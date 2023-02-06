package genericex;

public class GenericMain {

	public static void main(String[] args) {
		
		Gene<String> is = new Gene<String>();
		String[] ran = {"심","규","호"};
		
		is.set(ran);
		is.print();
		

	}

}
