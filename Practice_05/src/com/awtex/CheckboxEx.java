package com.awtex;

import java.awt.*;

public class CheckboxEx extends Frame{

	private Label lb = new Label("좋아하는 과일을 선택해주세요.");
	private Checkbox[] cb = {new Checkbox("딸기", true), new Checkbox("바나나"), new Checkbox("파인애플")};
	private Button bt = new Button("확인");
	
	public CheckboxEx() {
		super("Checkbox Test");
		setLayout(new GridLayout(5,1));
		add(lb);
		for(int i = 0;i<cb.length;i++) {
			add(cb[i]);
		}
		add(bt);
		WinEvent w = new WinEvent();
		setSize(300, 200);
		setVisible(true);
		addWindowListener(w);
	}
	
	public static void main(String[] args) {
		
		new CheckboxEx();

	}

}
