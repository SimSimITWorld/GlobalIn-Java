package sungjuck;

import java.util.*;

public class Sungjuk {

	static Scanner sc = new Scanner(System.in);
	public static int n;
	public String[] name;
	public String[] sub = {"국어","영어","수학"};
	public int[][] subname;
	public double[] avg;
	
	void input() {
		do {
			System.out.print("인원수 입력 : ");
			n = sc.nextInt();
		}while(n<1 || n>100);
		name = new String[n];
		avg = new double[n];
		subname = new int[n][sub.length+2];
		
		for(int i = 0;i<subname.length;i++) {
			System.out.print((i+1)+"번째 이름 입력 : ");
			name[i] = sc.next();
			for(int j = 0;j<subname[i].length-2;j++) {
				System.out.print(sub[j] + "점수 : " );
				subname[i][j] = sc.nextInt();
				subname[i][subname[i].length-2] += subname[i][j];
			}
			avg[i] = (double)subname[i][subname[i].length-2]/sub.length;
			subname[i][subname[i].length-1] = 1;
		}
	}
	
	void oper() {
		for(int i = 0;i<subname.length;i++) {
			for(int j = 0;j<subname.length;j++) {
				if(subname[i][subname[i].length-2]<subname[j][subname[j].length-2])
					subname[i][subname[i].length-1]++;
			}
		}
	}
	
	void show() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");
		for(int i =0;i<subname.length;i++) {
			System.out.print(name[i] + "\t");
			for(int j = 0;j<subname[i].length-1;j++) {
				System.out.printf("%3d\t",subname[i][j]);
			}
			System.out.printf("%2.2f\t%2d\n",avg[i],subname[i][subname[i].length-1]);
		}
	}
	
}
