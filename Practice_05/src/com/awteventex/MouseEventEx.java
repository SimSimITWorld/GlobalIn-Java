package com.awteventex;

import java.awt.*;
import java.awt.event.*;

public class MouseEventEx extends Frame implements MouseListener {

	private Button bt1 = new Button("확인"); // 이벤트 소스
	private Button bt2 = new Button("취소");
	
	public MouseEventEx() {
		super("MouseEvent Test");
		
		setLayout(new FlowLayout());
		add(bt1); add(bt2);
		
		WinEvent w = new WinEvent();
		setSize(300, 200);
		setVisible(true);
		addWindowListener(w);
		
		// 이벤트 리스너
		bt1.addMouseListener(this);
		bt2.addMouseListener(this);
	}
	
	public static void main(String[] args) {
		
		new MouseEventEx();

	}

	@Override
	public void mouseClicked(MouseEvent e) { // 이벤트 핸들러
		if(e.getSource()==bt1) System.out.println("확인버튼");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource()==bt2) System.out.println("취소버튼");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource()==bt2) System.out.println("취소 버튼을 눌렀다가 뗏을 때");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource()==bt1 || e.getSource()==bt2) System.out.println("마우스가 버튼 위에 있을 때");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()==bt1 || e.getSource()==bt2) System.out.println("마우스가 버튼 위에 없을 때");
	}

}
