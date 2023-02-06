package com.awtex;

import java.awt.*;

public class ButtonEx extends Frame {

	private String[] st = {"7","8","9","4","5","6","1","2","3","#","0","*"};
	private Button[] bt = new Button[st.length];
	
	public ButtonEx() {
		
		super("Button Test");
		
		setLayout(new GridLayout(4, 3, 5, 5));
		
		for(int i = 0;i<bt.length;i++) {
			bt[i] = new Button(st[i]);
			bt[i].setFont(new Font("궁서체",Font.BOLD,30));
			add(bt[i]);
		}
		
		setSize(300, 200);
		setVisible(true);
		WinEvent w = new WinEvent();
		addWindowListener(w);
		
	}
	
	public static void main(String[] args) {
		
		new ButtonEx();

	}

}
