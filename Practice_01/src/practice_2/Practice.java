package practice_2;

public class Practice {

	public static void main(String[] args) {
		//10, 19
		for(int i = 0;i<19;i++)
			System.out.print("#");
		for(int i = 0;i<10;i++) {
			System.out.println();
			for(int k = 0;k<41;k++) {
				if(k==0 || k==40) 
					System.out.print("#");
				else
					System.out.print(" ");
			}
		}
		System.out.println();
		for(int i = 0;i<19;i++)
			System.out.print("#");

	}

}
