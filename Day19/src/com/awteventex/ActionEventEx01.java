package com.awteventex;

import java.awt.*;
import java.awt.event.*;

public class ActionEventEx01 extends Frame implements ActionListener {

	private TextField tf = new TextField(10);
	
	public ActionEventEx01() {
		
		super("ActionEvent Test");
		
		setLayout(new FlowLayout());
		add(tf);
		
		
		
		
		setSize(300, 200);
		WinEvent w = new WinEvent();
		setVisible(true);
		addWindowListener(w);
		tf.addActionListener(this);
	}
	
	
	public static void main(String[] args) {
		
		new ActionEventEx01();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==tf) {
			String str = tf.getText();
			System.out.println("메시지 : "+ str);
			tf.setText(""); // 초기화를 해주지 않으면 자기가 직접 지워야 함
		}
	}
	
	
}
