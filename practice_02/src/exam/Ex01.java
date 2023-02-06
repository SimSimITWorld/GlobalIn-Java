package exam;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 : ");
		int n = sc.nextInt();
		String[] name = new String[n];
		String[] sub = { "국어", "영어", "수학" };
		int[][] subname = new int[n][sub.length + 1];
		double[] avg = new double[n];
		char[] ch = new char[n];
		for (int i = 0; i < subname.length; i++) {
			System.out.print("이름 입력 : ");
			name[i] = sc.next();
			for (int j = 0; j < subname[i].length - 1; j++) {
				System.out.print(sub[j] + "점수 입력 : ");
				subname[i][j] = sc.nextInt();
				subname[i][subname[i].length - 1] += subname[i][j];
			}
			avg[i] = (double) subname[i][subname[i].length - 1] / sub.length;
			switch ((int) avg[i] / 10) {
			case 10:
			case 9:
				ch[i] = 'A';
				break;
			case 8:
				ch[i] = 'B';
				break;
			case 7:
				ch[i] = 'C';
				break;
			case 6:
				ch[i] = 'D';
				break;
			default:
				ch[i] = 'F';
			}
		}

		System.out.println("***************성적표***************");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
		for (int i = 0; i < subname.length; i++) {
			System.out.print(name[i]+"\t");
			for (int j = 0; j < subname[i].length; j++) {
				if(j<subname[i].length-1)
				System.out.print(subname[i][j]+"\t");
				else
					System.out.print(subname[i][j]+"\t");
			}
			System.out.print(avg[i]+"\t"+ch[i]);
			System.out.println();
		}
		System.out.println("***********************************");

	}

}
