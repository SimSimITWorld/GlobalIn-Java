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

	private static String title = "Dancing Queen";
	private static String artist = "ABBA";
	private static int year = 1978;
	private static String country = "스웨덴";
	
	public static void show() {
		System.out.println(year+"년 "+country+"국적의 "+artist + "가 부른" + title);
	}
	
	public static void main(String[] args) {
		
		show();
		

	}

}
