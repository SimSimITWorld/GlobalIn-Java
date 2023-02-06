package practice_1;

import java.io.*;

public class Practice_7 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		int game;
		System.out.print("숫자 입력 : ");
		game = Integer.parseInt(br.readLine());
		
		if(game>=1 && game <=99) {
			int a = game / 10;
			int b = game % 10;
			int score = 0;
			
			if(a!=0 && a%3 == 0) {score ++;}
			if(b!=0 && b%3 == 0) {score ++;}
			
			if(score == 2) {
				System.out.println("박수짝짝");
			}else if (score == 1) {
				System.out.println("박수짝");
			}else {
				System.out.println("박수 없음");
			}
		}
	}

}
