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

public class Song {

	public String title;
	public String artist;
	public int year;
	public String country;
	
	public Song() {}
	
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.print(year+"년 " + country +"국적의 " + artist + "가 부른 " + title);
	}
	
	public static void main(String[] args) {
		
		Song song = new Song();
		Song song_infor = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		song_infor.show();

	}

}
