package com.enumex;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

class WinEvent extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		
		System.exit(0);
	}
}

public class WindowEx  {
	
	public static void main(String[] args) {
		Frame f = new Frame();
		WinEvent we = new WinEvent();
		
		f.addWindowListener(we);
		f.setSize(300, 200);
		f.setVisible(true);

	}


}
