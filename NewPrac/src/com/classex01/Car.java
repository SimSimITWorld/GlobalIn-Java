package com.classex01;

public class Car {

	private int Speed;
	private String Color;
	
	public int getSpeed() {
		return Speed;
	}
	public void setSpeed(int speed) {
		Speed = speed;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	public void speedUp(int up) {
		this.Speed = up;
	}
	
	public void changecol(String col) {
		this.Color = col;
	}
	
}
