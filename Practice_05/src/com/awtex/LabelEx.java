package com.awtex;

import java.awt.*;

public class LabelEx extends Frame {

	Label l1;
	Label l2;
	Label l3;
	Label l4;
	
	Font f1;
	Font f2;
	
	public LabelEx() {
		
		super("Label Test");
		
		f1 = new Font("굴림체", Font.BOLD, 20);
		f2 = new Font("궁서체", Font.ITALIC, 35);
		
		l1 = new Label("Hi");
		l2 = new Label("Please call me", Label.CENTER);
		l3 = new Label("Gildong Hong", Label.LEFT);
		l4 = new Label("Nice to meet you", Label.RIGHT);
		
		setLayout(new GridLayout(4, 1));
		
		l1.setFont(f1);  l3.setFont(f2);
		l2.setFont(f1);  l4.setFont(f2);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		l1.setBackground(Color.RED);
		l2.setBackground(Color.BLUE);
		l3.setBackground(Color.GREEN);
		l4.setBackground(Color.PINK);
		
		WinEvent w = new WinEvent();
		setSize(300, 200);
		setVisible(true);
		addWindowListener(w);
	}
	
	public static void main(String[] args) {
		
		new LabelEx();

	}

}
