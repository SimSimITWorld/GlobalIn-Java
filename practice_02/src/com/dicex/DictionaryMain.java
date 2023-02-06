package com.dicex;

import java.util.*;

public class DictionaryMain {

	public static void main(String[] args) {
		
		System.out.println("한영 단어 검색 프로그램");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("한글단어 입력 : ");
			String word = sc.next();
			if(word.equals("그만")) {
				System.out.println("사전 프로그램을 종료합니다.");
				break;
			}
			String eng = Dictionary.kor2eng(word);
			if(eng==null)
				System.out.println("'"+word+"' 은/는 사전에 없습니다.");
			else
				System.out.println(word + " = '"+eng+"' 입니다.");
		}
	}

}
