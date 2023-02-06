package study;

public class Test_4 {

	public static void main(String[] args) {
		//------------------------------입력------------------------------------//
		
		int[][] p4 = new int[4][5];
		int a;
		int b = 1;
		for(int i = 0;i<p4.length;i++) {
			    a =0;
			for(int j = 0;j<p4[i].length;j++) {
				p4[i][j] = a+b;
				a+=4;
			}
			b++;
		}
		
		//------------------------------출력------------------------------------//
		
		System.out.println("[문제 4번]");
		for(int i = 0;i<p4.length;i++) {
			for(int j = 0;j<p4[i].length;j++) 
				System.out.print(p4[i][j]+"\t");
			
			System.out.println();
		}

	}

}
