package com.awtex;

import java.awt.*;

public class ListEx extends Frame{
	
	private Label la = new Label("과목 이름 : ");
	private List li = new List(4, true);
	private Button bt = new Button("확인");
	private String[] a = {"Java", "Jsp", "DataBase", "Spring"};
	
	public ListEx() {
		
		super("List Test");
		
		for(int i = 0;i<a.length;i++) {
			li.add(a[i]);
		}
		
		add("North", la);
		add("Center", li);
		add("South", bt);
		
		li.setFont(new Font("궁서체", Font.BOLD, 30));
		
		
		setSize(300, 200);
		setVisible(true);
		WinEvent w = new WinEvent();
		addWindowListener(w);
	}
	
	public static void main(String[] args) {
		
		new ListEx();
		
	}

}
