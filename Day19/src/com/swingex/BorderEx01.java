package com.swingex;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class BorderEx01 extends JFrame {
	
	private JButton[] jb = new JButton[6];

	public BorderEx01() {
		super("Border Test");
		
		Container con = this.getContentPane();
		
		con.setLayout(new GridLayout(3, 2, 5, 5));
		
		for(int i = 0;i<6;i++) {
			jb[i] = new JButton(i+"번 버튼");
			con.add(jb[i]);
		}
		
		EmptyBorder eb = new EmptyBorder(10, 10, 10, 10); // 테두리에 선이 생김
		jb[0].setBorder(eb);
		LineBorder lb = new LineBorder(Color.RED, 5); // 테두리 색깔 변환
		jb[1].setBorder(lb);
		
		
		EtchedBorder eb1 = new EtchedBorder();
		jb[2].setBorder(eb1);
		
		BevelBorder bb = new BevelBorder(BevelBorder.RAISED);
		jb[3].setBorder(bb);
		
		SoftBevelBorder sbb = new SoftBevelBorder(SoftBevelBorder.LOWERED);
		jb[4].setBorder(sbb);
		
		MatteBorder mb = new MatteBorder(5, 10, 15, 20, Color.GREEN);
		jb[5].setBorder(mb);
		
		setSize(new Dimension(300, 200));
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		
		new BorderEx01();

	}

}
