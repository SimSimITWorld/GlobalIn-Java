package com.awtex;

import java.awt.*; // 라이브러리
import java.awt.event.*;

public class FrameEx02 extends Frame implements WindowListener {

	public FrameEx02() {
		super("이벤트1");
		setSize(300, 200);			
		setVisible(true);
		addWindowListener(this);
	}
	
	public static void main(String[] args) {
		new FrameEx02();
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
