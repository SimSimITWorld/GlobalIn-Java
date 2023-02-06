package com.gameex;

/*
 * 문4]

    Point클래스를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하시오.

    main()
      
      public static void main(String[] args) {
      
      ColorPoint cp = new ColorPoint(5, 5, "YELLO"); 
      
      cp.setXY(10, 20);
      cp.setColor("RED");

      String str = cp.toString();
      System.out.println(str+"입니다.");
}

  출력결과
  
  RED색의 (10, 20)의 점입니다.
 */



public class ColorPoint extends Point {

	private String color = " ";
	
	public ColorPoint() {
		this(0, 0);
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}
	
	public void setXY(int x, int y) {
		move(x, y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return color + "색의 ("+getX()+", "+getY()+")의 점";
	}
	
	public static void main(String[] args) {
		
		ColorPoint zeroPoint = new ColorPoint(); // 0, 0 위치의 BLACK 색점
	    System.out.println(zeroPoint.toString()+"입니다.");

	    ColorPoint cp = new ColorPoint(10, 10); // 10, 10 위치의 BLACK 색점 
	    cp.setXY(5, 5);
	    cp.setColor("RED");

	     System.out.println(cp.toString()+"입니다.");
	}
	
}


/*
 *  Point클래스를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하시오.

    main()
      
      public static void main(String[] args) {
      
      ColorPoint zeroPoint = new ColorPoint(); // 0, 0 위치의 BLACK 색점
      System.out.println(zeroPoint.toString()+"입니다.");

      ColorPoint cp = new ColorPoint(10, 10); // 10, 10 위치의 BLACK 색점 
      cp.sexXY(5, 5);
      cp.setColor("RED");

      System.out.println(cp.toString()+"입니다.");
}

  출력결과
  
  BLACK색의 (0, 0)의 점입니다.
  RED색의 (5, 5)의 점입니다.
 */
