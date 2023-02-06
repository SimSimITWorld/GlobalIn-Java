package com.awtex;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameEx03 extends Frame{

	public FrameEx03() {
		super("이벤트1");
		setSize(300, 200);
		setVisible(true);
		addWindowListener(new WinEvent());
	}
	
	class WinEvent03 extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			
		}
	}
	
	public static void main(String[] args) {
		
		new FrameEx03();

	}

}
