package com.awtex;

import java.awt.*;
import java.awt.event.*;

public class FrameEx03 extends Frame {

	public FrameEx03() {
		super("이벤트1");
		setSize(300, 200);
		setVisible(true);
		WinEventEx03 ww = new WinEventEx03();
		addWindowListener(ww);
	}
	
	class WinEventEx03 extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		
		new FrameEx03();
		

	}

}
