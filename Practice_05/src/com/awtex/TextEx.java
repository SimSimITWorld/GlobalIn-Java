package com.awtex;

import java.awt.*;

public class TextEx extends Frame{
	
	private TextField tf = new TextField("제목 : ");
	private TextArea ta = new TextArea("메모", 5, 10);
	private Label la = new Label("내용");
	private Button bt = new Button("확인");

	public TextEx() {
		super("Text Test");
		
		setLayout(new BorderLayout());
		add("North", tf);
		add("South", bt);
		add("West", la);
		add("Center", ta);
		
		
		WinEvent w = new WinEvent();
		setSize(300, 200);
		setVisible(true);
		addWindowListener(w);
	}
	
	public static void main(String[] args) {
		
		new TextEx();

	}

}
