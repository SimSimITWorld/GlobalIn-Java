package com.objectex;

/* 문]
 *     필드 구성
 *        제목 : title, 가수 : artist, 노래발표년도 : year, 국적 : country
 *        
 *     생성자 2개로 구성 : 기본생성자, 모든 필드를 초기화하는 생성자
 *     노래의 정보를 출력하는 메소드 : show()
 *     
 *     객체를 생성하여 노래 정보를 출력하는 프로그램을 작성하시오.
 *     
 *     출력형식
 *     1978년 스웨덴국적의 ABBA가 부른 Dancing Queen
 */
import java.util.*;

public class Song {
	
	private String title;
	private String artist;
	private int year;
	private String country;
	
	// 생성자 오버로딩구현
	public Song() {}
	
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.print(year+"년 " + country + "국적의 " + artist +"가 부른 " + title);
	}

	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("노래 발표 연도 입력 : ");
		int year = sc.nextInt();
		System.out.print("국적 입력 : ");
		String country = sc.next();
		System.out.print("가수 입력 : ");
		String artist = sc.next();
		sc.nextLine();
		System.out.print("제목 입력 : ");
		String title = sc.nextLine();
		
		Song s = new Song(title,artist,year,country);
		s.show();

	}

}
