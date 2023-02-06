package practice_1;

public class Tvtest {

	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
		if(power=true) 
			System.out.println("TV ON");
		else
			System.out.println("TV OFF");
	}
	
	public void channelUp() {++channel;}
	public void channelDown() {--channel;}
	
}
