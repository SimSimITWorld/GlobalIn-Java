package com.gameex;

/*
 * 문4]

    Point클래스를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하시오.

    main()
      
      public static void main(String[] args) {
      
      ColorPoint cp = new ColorPoint(5, 5, "YELLO"); // 1 마일은 1.6Km임.
      
      cp.sexXY(10, 20);
      cp.setColor("RED");

      String str = cp.toString();
      System.out.println(str+"입니다.");
}

  출력결과
  
  RED색의 (10, 20)의 점입니다.
 */

public class Point {

	private int x, y;
	
	public Point() {};
	public Point(int x, int y) {this.x = x;this.y = y;}
	protected int getX() {return x;}
	protected int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
	
	
}
