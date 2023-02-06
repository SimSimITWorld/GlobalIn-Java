package study;

public class Test_3 {

	public static void main(String[] args) {
		//------------------------------입력------------------------------------//
		
		int[][] p3 = new int[4][5];
		int a;
		for(int i = 0;i<p3.length;i++) {
			a= 20-i;
			for(int j = 0;j<p3[i].length;j++) {
				p3[i][j] = a;
				a-=4;
			}
		}

		//------------------------------출력------------------------------------//
		
		 System.out.println("[문제 3번]");
			for(int i = 0;i<p3.length;i++) {
				for(int j = 0;j<p3[i].length;j++) 
					System.out.print(p3[i][j]+"\t");
				
				System.out.println();
			}
	}

}
