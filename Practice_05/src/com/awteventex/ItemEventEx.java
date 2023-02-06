package com.awteventex;

import java.awt.*;
import java.awt.event.*;

/* 문]
 *    혈액형	: A, B, AB, O
 *    년 		: 1980 ~ 2022
 *    월		:      1 ~ 12
 *    일		:      1 ~ 31
 *    
 *    
 *    리스트로 구현
 *    지역
 *    서울, 대구, 부산, 대전, 광주, 울산, 인천, 강원 	   
 */

public class ItemEventEx extends Frame implements ItemListener, ActionListener {

	private TextField tf1 = new TextField();
	private TextField tf2 = new TextField();
	private TextField tf3 = new TextField();

	private Label lb1 = new Label("혈액형 : ", Label.RIGHT);
	private Choice bType = new Choice();
	private String[] blood = { "A형", "B형", "AB형", "O형" };

	private Label lb2 = new Label("생년월일 : ", Label.RIGHT);
	private Choice year = new Choice();
	private Choice month = new Choice();
	private Choice day = new Choice();

	private Label lb3 = new Label("지역 : ", Label.RIGHT);

	private List li = new List(10, true);
	private String[] location = { "서울", "대구", "부산", "대전", "광주", "울산", "인천", "강원" };

	private Button bt = new Button("종료");

	private void setForm() {

		// 레이아웃 설정
		setLayout(new GridLayout(2, 1));

		Panel p = new Panel(new BorderLayout());
		Panel p1 = new Panel(new GridLayout(3, 1));

		p1.add(lb1);
		p1.add(lb2);
		p1.add(lb3);
		p.add("West", p1); // 라벨

		Panel p2 = new Panel(new GridLayout(3, 1));

		p2.add(tf1);
		p2.add(tf2);
		p2.add(tf3);
		p.add("Center", p2);

		Panel p3 = new Panel(new GridLayout(4, 1));
		p3.add(bType);
		p3.add(year);
		p3.add(month);
		p3.add(day);

		for (int i = 0; i < blood.length; i++) {
			bType.add(blood[i]);
		}

		for (int i = 1980; i <= 2022; i++) {
			year.add(String.valueOf(i) + "년");
		}

		for (int i = 1; i <= 12; i++) {
			month.add(String.valueOf(i) + "월");
		}

		for (int i = 1; i <= 31; i++) {
			day.add(String.valueOf(i) + "일");
		}

		p.add("East", p3);

		add("Center", p); // 중앙

		Panel p4 = new Panel(new BorderLayout());
		p4.add("Center", li);
		for (int i = 0; i < location.length; i++) {
			li.add(location[i]);
		}
		p4.add("East", bt);
		add("South", p4);
	}

	public ItemEventEx(String[] location) {
		super("Item Event");

		setForm();

		// 편집불가
		bType.setEnabled(false);
		
		// 리스너 등록
		bType.addItemListener(this);
		year.addItemListener(this);
		month.addItemListener(this);
		day.addItemListener(this);
		li.addItemListener(this);
		bt.addActionListener(this);

		WinEvent w = new WinEvent();
		setSize(300, 200);
		setVisible(true);
		addWindowListener(w);
	}

	public static void main(String[] args) {

		String[] location = { "서울", "대구", "부산", "대전", "광주", "울산", "인천", "강원" };
		new ItemEventEx(location);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bt) {
			System.exit(0);
		} else if (e.getSource() == li) {
			int i = li.getSelectedIndex();
			li.remove(i);
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		if(e.getSource()==bType) {
			String imsi = bType.getSelectedItem();
			tf1.setText(imsi);
		}else if(e.getSource()==day) {
			String y = year.getSelectedItem();
			String m = month.getSelectedItem();
			String d = day.getSelectedItem();
			tf2.setText(y+m+d);
		}else if(e.getSource()==li) {
			String imsi = li.getSelectedItem();
			tf3.setText(imsi);
		}
	}

}
