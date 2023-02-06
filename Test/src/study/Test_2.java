package study;

public class Test_2 {

	public static void main(String[] args) {
		//------------------------------입력------------------------------------//
		
		int[][] p2 = new int[4][5];
		int b = 1;
		for(int i = 0;i<p2.length;i++) {
			if(i%2==0) {
			    for(int j = 0;j<p2[i].length;j++) {
				    p2[i][j] = b;
				    b++;
			    }
			}
			if(i%2!=0) {
				for(int k = 0;k<p2[i].length;k++) {
					p2[i][k] = b;
					b++;
				}
				if(p2[i][4]>p2[i][0]) {
					p2[i][4]=p2[i][4]^p2[i][0];
					p2[i][0]=p2[i][0]^p2[i][4];
					p2[i][4]=p2[i][4]^p2[i][0];
				}
				if(p2[i][3]>p2[i][1]) {
					p2[i][3]=p2[i][3]^p2[i][1];
					p2[i][1]=p2[i][1]^p2[i][3];
					p2[i][3]=p2[i][3]^p2[i][1];
				}
			}
		}
		
		//------------------------------출력------------------------------------//

		System.out.println("[문제 2번]");
	    for(int i = 0;i<p2.length;i++) {
	    	for(int j = 0;j<p2[i].length;j++) 
	    		System.out.print(p2[i][j]+"\t");
	    	
	    	System.out.println();
	    }
	}

}
