package com.awtex;

import java.awt.*;

public class BorderEx extends Frame {

	Label a, b, c, d, e;
	
	public BorderEx() {
		
		super("BorderLayout");
		
		setLayout(new BorderLayout(5, 5));
		
		a = new Label("↑", Label.CENTER);
		b = new Label("↓", Label.CENTER);
		c = new Label("←", Label.CENTER);
		d = new Label("→", Label.CENTER);
		e = new Label("이동", Label.CENTER);
		
		setBackground(Color.GRAY);
		
		a.setBackground(Color.RED);
		b.setBackground(Color.GREEN);
		c.setBackground(Color.BLUE);
		d.setBackground(Color.MAGENTA);
		e.setBackground(Color.YELLOW);
		
		a.setForeground(Color.WHITE);
		b.setForeground(Color.WHITE);
		c.setForeground(Color.WHITE);
		d.setForeground(Color.WHITE);
		e.setForeground(Color.WHITE);
		
		
		
		add("North", a);
		add("South", b);
		add(c, BorderLayout.WEST);
		add(d, BorderLayout.EAST);
		add("Center", e);
		
		
		WinEvent w = new WinEvent();
	//	setBounds(300, 300, 300, 200);		// SetBounds(길이, 크기, 가로, 세로)
		setLocation(300, 300);
		setSize(300, 200);
	//	pack();											// 최소 크기
		setVisible(true);
		addWindowListener(w);
		
	}
	
	public static void main(String[] args) {
		
		new BorderEx();
	}

}
