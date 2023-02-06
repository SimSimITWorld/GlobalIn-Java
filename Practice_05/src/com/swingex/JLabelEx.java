package com.swingex;

import java.awt.*;
import javax.swing.*;

public class JLabelEx extends JFrame {

	private Icon icon = new ImageIcon("src/img/네이버블로그.png");
	private JLabel jl1 = new JLabel(icon);
	private JLabel jl2 = new JLabel("Test2", JLabel.CENTER);
	private JLabel jl3 = new JLabel("Test3", icon, SwingConstants.RIGHT);
	
	public JLabelEx() {
		
		super("JLabel Test");
		
		Container con = this.getContentPane();
		con.setLayout(new GridLayout(3,1));
		con.add(jl1);
		con.add(jl2);
		jl2.setIcon(icon);
		con.add(jl3);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new JLabelEx();

	}

}
