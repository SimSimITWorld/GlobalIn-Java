package com.awtex;

import java.awt.*;

public class ChoiceEx extends Frame {

	private Label la = new Label("생일");
	private Choice co = new Choice();
	private Button bt = new Button("확인");
	
	public ChoiceEx() {
		
		super("Choice Test");
		
		setLayout(new GridLayout(3, 1));
		
		add(la);
		for(int i = 1;i<=12;i++) {
			co.add(String.valueOf(i)+"월");
		}
		add(co);
		add(bt);
		
		
		pack();
		setVisible(true);
		WinEvent w = new WinEvent();
		addWindowListener(w);
	}
	
	public static void main(String[] args) {
		
		new ChoiceEx();

	}

}
