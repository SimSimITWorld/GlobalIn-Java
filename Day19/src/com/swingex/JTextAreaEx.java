package com.swingex;

import java.awt.*;
import javax.swing.*;

public class JTextAreaEx extends JFrame {

	private JTextArea ta = new JTextArea(5, 10);
	private JScrollPane js = new JScrollPane(ta);
	
	
	public JTextAreaEx() {
		
		super("JTextArea Test");
		
		JPanel jp = (JPanel)this.getContentPane();
		
		jp.setLayout(new BorderLayout());
		
		jp.add("Center", js);
		
		setSize(new Dimension(300, 200)); 
		// setSize(int, int) x축과 y축으로 사이즈 생성    
		// setSize(new Dimension(int, int) 배열로 사이즈를 생성(보이지 않는 행과 열 사용)
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new JTextAreaEx();

	}

}
