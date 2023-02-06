package com.awtex;

import java.awt.*;

public class CheckboxEx extends Frame {

	private Label lb = new Label("like fruit?");
	private Checkbox[] cb = { new Checkbox("Banana", true), new Checkbox("strawberry"), new Checkbox("pineapple") };
	// Checkbox("", [boolean]) boolean 값에 true로 체크되어 있으면 표시되어 있는 상태로 생성
	private Button bt = new Button("Confirm");

	public CheckboxEx() {
		super("Checkbox Test");

		setLayout(new GridLayout(5, 1));
		add(lb);

		for (int i = 0; i < cb.length; i++) {
			add(cb[i]);
		}

		add(bt);

		pack();
		setVisible(true);
		WinEvent w = new WinEvent();
		addWindowListener(w);
	}

	public static void main(String[] args) {

		new CheckboxEx();

	}

}
