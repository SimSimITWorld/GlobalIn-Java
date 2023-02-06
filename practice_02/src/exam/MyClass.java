package exam;

public class MyClass {

	public String name;
	public int age;
	
	public MyClass() {}
	
	public void MyClass(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name+", " +age);
	}
}
