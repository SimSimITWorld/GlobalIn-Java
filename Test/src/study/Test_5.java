package study;

public class Test_5 {

	public static void main(String[] args) {
		//------------------------------입력------------------------------------//
		
		int[][] p5 = new int[4][];
		int a = 4;
		int b = 1;
		for(int i = 0;i<p5.length;i++) {
			p5[i] = new int[a];
			a--;
		}
		
		for(int i = 0;i<p5.length;i++) {
			for(int j = 0;j<p5[i].length;j++) {
				p5[i][j] = b;
				b++;
			}
		}
		
		//------------------------------출력------------------------------------//
		
		System.out.println("[문제 5번]");
		for(int i = 0;i<p5.length;i++) {
			for(int j = 0;j<p5[i].length;j++) 
				System.out.print(p5[i][j] + "\t");
			
			System.out.println();
		}

	}

}
