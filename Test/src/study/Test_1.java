package study;

public class Test_1 {

	public static void main(String[] args) {
		
	    //------------------------------입력------------------------------------//
		
		int[][] p1 = new int[4][];
		int a = 1;
		for(int i = 0;i<p1.length;i++) 
			p1[i] = new int[i+1];
		
		for(int i = 0;i<p1.length;i++) {
			for(int j = 0;j<p1[i].length;j++) {
				p1[i][j] = a;
				a++;
			}
		}
		
	    //------------------------------출력------------------------------------//
		
		System.out.println("[문제 1번]");
		for(int i = 0;i<p1.length;i++) {
			for(int j = 0;j<p1[i].length;j++)
				System.out.print(p1[i][j]+"\t");
			
			System.out.println();
		}
	  
    }

}
