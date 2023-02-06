package study;

import java.io.*;

public class InputEx04 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		int kor, eng, mat, sum;
		
		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 : ");
		mat = Integer.parseInt(br.readLine());
		
		sum = kor + eng + mat;
		
		System.out.printf("국어 점수 >> %d\n영어 점수 >> %d\n수학 점수 >> %d\n합계 >> %d",kor,eng,mat,sum);
		

	}

}
