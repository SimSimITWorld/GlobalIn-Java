package practice_3;

public class Practice {

	public static void main(String[] args)  {
		
		//------------------------------입력------------------------------------//
		
		
		// 문1] 2차원 배열을 이용하여 다음과 같이 결과를 출력하시오.
		//       단, 가변배열을 활용
		
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
		
		
		// 문2
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
					if(p2[i][0]<p2[i][4]) {
						p2[i][0]=p2[i][0]^p2[i][4];
						p2[i][4]=p2[i][4]^p2[i][0];
						p2[i][0]=p2[i][0]^p2[i][4];
					}
				}
			}
		}
		
		
		// 문3
		int[][] p3 = new int[4][5];
		int c =20;
		for(int i = 0;i<p3.length;i++) {
			c= 20-i;
			for(int j = 0;j<p3[i].length;j++) {
				p3[i][j] = c;
				c-=4;
			}
		}
		
		// 문4
		int[][] p4 = new int[4][5];
		int d;
		int e = 1;
		for(int i = 0;i<p4.length;i++) {
			    d =0;
			for(int j = 0;j<p4[i].length;j++) {
				p4[i][j] = d+e;
				d+=4;
			}
			e++;
		}
		
		// 문5
		int[][] p5 = new int[4][];
		int f = 4;
		int g = 1;
		for(int i = 0;i<p5.length;i++) {
			p5[i] = new int[f];
			f--;
		}
		
		for(int i = 0;i<p5.length;i++) {
			for(int j = 0;j<p5[i].length;j++) {
				p5[i][j] = g;
				g++;
			}
		}
		
		//------------------------------출력------------------------------------//
		
		// 문1
		System.out.println("[문제 1번]");
		for(int i = 0;i<p1.length;i++) {
			for(int j = 0;j<p1[i].length;j++)
				System.out.print(p1[i][j]+"\t");
			
			System.out.println();
		}
			
		// 문2
		System.out.println("[문제 2번]");
	    for(int i = 0;i<p2.length;i++) {
	    	for(int j = 0;j<p2[i].length;j++) 
	    		System.out.print(p2[i][j]+"\t");
	    	
	    	System.out.println();
	    }
		// 문3
	    System.out.println("[문제 3번]");
		for(int i = 0;i<p3.length;i++) {
			for(int j = 0;j<p3[i].length;j++) 
				System.out.print(p3[i][j]+"\t");
			
			System.out.println();
		}
				
		// 문4
		System.out.println("[문제 4번]");
		for(int i = 0;i<p4.length;i++) {
			for(int j = 0;j<p4[i].length;j++) 
				System.out.print(p4[i][j]+"\t");
			
			System.out.println();
		}
				
	    // 문5
		System.out.println("[문제 5번]");
		for(int i = 0;i<p5.length;i++) {
			for(int j = 0;j<p5[i].length;j++) 
				System.out.print(p5[i][j] + "\t");
			
			System.out.println();
		}
	}

}
