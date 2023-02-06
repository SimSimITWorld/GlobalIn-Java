package com.awtex;

import java.awt.*;

public class FrameEx01 {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setSize(300, 200);
		f.setVisible(true);
		
		WinEvent w = new WinEvent();
		f.addWindowListener(w);
		
	}

}
