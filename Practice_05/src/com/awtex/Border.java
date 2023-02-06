package com.awtex;

import java.awt.*;

public class Border extends Frame {

	Label a, b, c, d, e;
	
	public Border() {
		
		super("Border Test");
		
		setLayout(new BorderLayout(5, 5));
		
		a = new Label("A", Label.CENTER);
		b = new Label("B", Label.CENTER);
		c = new Label("C", Label.CENTER);
		d = new Label("D", Label.CENTER);
		e = new Label("E", Label.CENTER);
		
		a.setBackground(Color.BLUE);
		b.setBackground(Color.CYAN);
		c.setBackground(Color.DARK_GRAY);
		d.setBackground(Color.GREEN);
		e.setBackground(Color.MAGENTA);
		
		a.setForeground(Color.white);
		b.setForeground(Color.white);
		c.setForeground(Color.white);
		d.setForeground(Color.white);
		e.setForeground(Color.white);
		
		add("North", a);
		add("West",b);
		add("East", c);
		add("South", d);
		add(e);
		
		
		setSize(300, 200);
		setVisible(true);
		WinEvent w = new WinEvent();
		addWindowListener(w);
	}
	
	public static void main(String[] args) {
		
		new Border();
		
	}

}
