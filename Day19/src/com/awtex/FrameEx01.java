package com.awtex;

import java.awt.*;	// 라이브러리

public class FrameEx01 {

	public static void main(String[] args) {
		
		// 프레임 객체 생성
		Frame f = new Frame("이벤트1");	// 툴바 타이틀명 세팅됨
		f.setSize(300, 200);						// f.setSize(가로, 세로);
		f.setVisible(true);						// f.setVisible(boolean);     true=보이게함,  false=보이지 않게 함
		
	//	f.setTitle("이벤트1");						// f.setName 아니고 f.setTitle 사용해야 툴바 타이틀에 들어감
		WinEvent w = new WinEvent();
		f.addWindowListener(w);
		
	}

}
