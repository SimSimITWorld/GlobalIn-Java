package com.swingex;

import java.awt.*;
import javax.swing.*;

public class JTabbedPaneEx extends JFrame {
	
	private ImageIcon icon1 = new ImageIcon("src/img/네이버블로그.png");
	private ImageIcon icon2 = new ImageIcon("src/img/유튜브2.png");
	
	private JLabel jlb = new JLabel("라벨", icon1, JLabel.CENTER);
	
	private JButton jbt = new JButton("버튼", icon1);
	
	private JTabbedPane jtp = new JTabbedPane(SwingConstants.TOP); // ← TOP, BOTTOM, CENTER 로 위치 지정
	
	public JTabbedPaneEx() {
		super("JTabbedPane Test");
		
		Container con = this.getContentPane();
		setLayout(new BorderLayout());
		
		jtp.addTab("라벨", icon2, jlb);
		jtp.addTab("라벨", icon2, jbt);
		
		
		con.add("Center", jtp);
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		new JTabbedPaneEx();
	}

}
