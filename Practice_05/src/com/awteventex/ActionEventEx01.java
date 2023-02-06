package com.awteventex;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventEx01 extends Frame implements ActionListener{

	private TextField tf = new TextField(10);
	
	public ActionEventEx01() {
		
		super("ActionEvent Test");
		setLayout(new FlowLayout());
		add(tf);
		
		WinEvent w = new WinEvent();
		setSize(300, 200);
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
			System.out.println("메시지 : " + str);
			tf.setText("");
		}
		
	}

}
