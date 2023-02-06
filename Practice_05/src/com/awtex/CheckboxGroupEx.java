package com.awtex;

import java.awt.*;

public class CheckboxGroupEx extends Frame {

	private GridLayout gl = new GridLayout(4, 1);
	private Label la = new Label("성별 체크");
	private Button bt = new Button("확인");
	private CheckboxGroup cg = new CheckboxGroup();
	private Checkbox man = new Checkbox("M", cg, true);
	private Checkbox woman = new Checkbox("W", cg, false);
	
	public CheckboxGroupEx() {
		
		setLayout(gl);
		add(la);
		add(man);
		add(woman);
		add(bt);
		
		WinEvent w = new WinEvent();
		setSize(300, 200);
		setVisible(true);
		addWindowListener(w);
	}
	
	public static void main(String[] args) {
		
		new CheckboxGroupEx();

	}

}
