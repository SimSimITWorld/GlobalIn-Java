package com.awtex;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameEx04 extends Frame{

	public FrameEx04() {
		super("이벤트1");
		setSize(300, 200);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		
		new FrameEx04();

	}

}
