package com.swingex;

import java.awt.*;
import javax.swing.*;

public class JButtonEx extends JFrame {

	private Icon icon1 = new ImageIcon("src/img/네이버블로그.png");
	private Icon icon2 = new ImageIcon("src/img/유튜브2.png");
	private Icon icon3 = new ImageIcon("src/img/인스타그램1.png");
	private Icon icon4 = new ImageIcon("src/img/카카오톡.png");

	private JRadioButton[] jb = new JRadioButton[4];
	private ButtonGroup bg = new ButtonGroup();

	public JButtonEx() {
		super("Button Test");

		Container con = this.getContentPane();
		con.setLayout(new GridLayout(2, 2));

		for (int i = 0; i < 4; i++) {
			jb[i] = new JRadioButton(i+1+"번 버튼", icon1);
			con.add(jb[i]);
			jb[i].setToolTipText(i+1+"번째 버튼이다. 눌러....");
			jb[i].setRolloverIcon(icon2);
			jb[i].setPressedIcon(icon3);
			jb[i].setSelectedIcon(icon4);
			bg.add(jb[i]);
		}

		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		new JButtonEx();

	}

}
