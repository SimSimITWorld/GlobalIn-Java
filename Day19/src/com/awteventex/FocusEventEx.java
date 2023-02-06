package com.awteventex;

import java.awt.*;
import java.awt.event.*;

// 잠시 멈추는 것을 보여주는 작업

public class FocusEventEx extends Frame implements FocusListener {

	private TextField[] tf = new TextField[3];

	
	@Override
	public void focusGained(FocusEvent e) {
		if(e.getSource()==tf[1]) {
			if(tf[0].getText().trim().length()==0) {
				tf[0].setText("");
				try {
					Thread.sleep(3000);
				}catch(InterruptedException ii) {
					
				}
				tf[0].requestFocus();
			}
		}else if(e.getSource()==tf[2]) {
			if(tf[1].getText().trim().length()==0) {
				tf[1].setText("");
				try {
					Thread.sleep(3000);
				}catch(InterruptedException ii) {
					
				}
				tf[1].requestFocus();
			}
		}
	}

	@Override
	public void focusLost(FocusEvent e) {

	}

	public FocusEventEx() {
		super("FocusEvent");
		
		setForm();
		
		WinEvent w = new WinEvent();
		setSize(200, 100);
		setVisible(true);
		addWindowListener(w);
	}
	
	public void setForm() {
		
		BorderLayout bl = new BorderLayout();
		
		Panel p = new Panel(new GridLayout(3, 1));
		p.add(new Label("이름 "));
		p.add(new Label("전번"));
		p.add(new Label("주소"));
		
		add("West", p);
		
		Panel pp = new Panel(new GridLayout(3, 1));
		for(int i = 0;i<tf.length;i++) {
			tf[i] = new TextField();
			pp.add(tf[i]);
			tf[i].addFocusListener(this);
		}
		
		add("Center", pp);
		
	}
	
	public static void main(String[] args) {
		
		new FocusEventEx();

	}

}
