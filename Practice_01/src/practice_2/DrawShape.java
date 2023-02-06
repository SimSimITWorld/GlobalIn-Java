package practice_2;

import java.util.*;

class Std{
	Scanner sc = new Scanner(System.in);
	int score;
	int Class;
}

class Std_1 extends Std{
	Scanner sc = new Scanner(System.in);
	int value;
	void input() {
		do {
		System.out.print("반 입력 : ");
		super.Class = sc.nextInt();
		System.out.print("점수 입력 : ");
		super.score = sc.nextInt();
		}while(Class<1 || Class>4 || score < 0 || score>100);
	}
	
	public String toString() {
		this.value = score/10;
		switch(value) {
		case 10: case 9: case 8: case 7:
			return "합격을 축하드립니다.";
		case 6:
			if(Class!=4)
				return "합격을 축하드립니다.";
			else
				return "불합격입니다.";
		default:
			return "불합격입니다.";
		}
	}
	
}

public class DrawShape {

	public static void main(String[] args) {
		
		Std_1 st = new Std_1();
		
		st.input();
		System.out.println(st.toString());

	}

}
