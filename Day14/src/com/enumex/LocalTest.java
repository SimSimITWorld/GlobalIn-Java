package com.enumex;

public class LocalTest {
	
	static int a = 10; // 클래스변수
	int b = 20; // 인스턴스변수
	
	public void write() {
		
		final int c = 30;
		final int d = 40;
		
		class LocalNested {
			
			// static int e = 100;
			
			public void prt() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c); // 로컬 변수에는 접근이 불가하다
				System.out.println(d);
			}
		}
		
		LocalNested ln = new LocalNested();
		ln.prt();
		
		
	}
	
	
	
	
	
	

	public static void main(String[] args) {
		
		LocalTest lt = new LocalTest();
		lt.write();
		

	}

}
