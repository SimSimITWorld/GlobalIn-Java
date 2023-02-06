package com.swingex;

import java.awt.*;
import javax.swing.*;

public class FrameEx extends JFrame {

	public FrameEx() {
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new FrameEx();

	}

}
