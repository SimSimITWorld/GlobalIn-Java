package com.gameex;

public class Point3D extends Point{

	private int z = 0;
	
	public Point3D(int x, int y) {
		super(x, y);
	}

	public Point3D(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
	public void moveUp() {
		z++;
	}
	
	public void moveDown() {
		z--;
	}
	
	public void move(int x, int y, int z) {
		super.move(x, y);
		this.z = z;
	}
	
	protected int getZ() {
		return z;
	}

	public String toString() {
		return  "("+getX()+", "+getY()+", " + this.getZ() +")의 점";
	}
	
	public static void main(String[] args) {
		
		Point3D p = new Point3D(1, 2, 3); // 1, 2, 3 은 각각 x, y, z 축의 값을 의미함
	      System.out.println(p.toString()+"입니다.");

	      p.moveUp(); // z축 위쪽으로 이동
	      System.out.println(p.toString()+"입니다.");

	      p.moveDown(); // z축 아래쪽으로 이동
	      p.move(10, 10); // x, y축으로 이동
	      System.out.println(p.toString()+"입니다.");

	      p.move(100,200,300);
	      System.out.println(p.toString()+"입니다.");

	}

}
