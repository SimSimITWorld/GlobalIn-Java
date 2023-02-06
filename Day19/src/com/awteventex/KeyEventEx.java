package com.awteventex;

import java.awt.event.*;
import java.awt.*;

public class KeyEventEx extends Frame implements KeyListener, ActionListener {

	private Label lb1 = new Label("주민번호 : ", Label.RIGHT);
	private Label lb2 = new Label("-", Label.CENTER);
	
	private Button bt = new Button("확인");
	
	private TextField jumin1 = new TextField(10);
	private TextField jumin2 = new TextField(10);
	
	public void setForm() {
		
		setLayout(new BorderLayout());
		add("West", lb1);
		
		Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
		p.add("West", jumin1);
		p.add("Center", lb2);
		p.add("East", jumin2);
		add("Center", p);
		
		Panel p1 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p1.add(bt);
		add("South", p1);
	}
	
	public KeyEventEx() {
		super("KeyEvent Test");
		
		setForm();
		
		jumin1.addKeyListener(this);
		jumin2.addKeyListener(this);
		
		bt.addActionListener(this);
		
		
		
		WinEvent w = new WinEvent();
		pack();
		setVisible(true);
		addWindowListener(w);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getSource()==jumin1) {
			if(jumin1.getText().trim().length()==6) {
				jumin2.requestFocus();
			}
		}else if(e.getSource()==jumin2) {
			if(jumin2.getText().trim().length()==7) {
				bt.requestFocus();
			}
		}

	}

	public static void main(String[] args) {
		
		new KeyEventEx();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt) {
			System.exit(0);
		}
		
	}

}
