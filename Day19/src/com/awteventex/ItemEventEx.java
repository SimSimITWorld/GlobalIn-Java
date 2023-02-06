package com.awteventex;

import java.awt.*;
import java.awt.event.*;

public class ItemEventEx extends Frame implements ItemListener, ActionListener {

	private Label lb = new Label("blood:", Label.RIGHT);

	private Label lb1 = new Label("birth:", Label.RIGHT);
	private Label lb2 = new Label("area:", Label.RIGHT);
	private TextField bType = new TextField();
	private Choice blood = new Choice();
	private TextField birth = new TextField();
	private Choice year = new Choice();
	private Choice month = new Choice();
	private Choice day = new Choice();
	private TextField area = new TextField();
	private List li = new List(3, false);
	private Button end = new Button("exit");

	public ItemEventEx() {

		super("ItemEvent Test");

		setForm();
		bType.setEditable(false);
		birth.setEditable(false);
		area.setEditable(false);

		// 리스너 등록
		blood.addItemListener(this);
		day.addItemListener(this);
		li.addItemListener(this);
		li.addActionListener(this);
		end.addActionListener(this);

		blood.requestFocus();// blood에서부터 커서 시작

		WinEvent w = new WinEvent();// 종료창
		setSize(300, 200);// 사이즈
		setVisible(true);// 화면 출력여부
		addWindowListener(w); // 종료 실행

	}

	private void setForm() {

		setLayout(new GridLayout(2, 1));
		Panel p = new Panel(new BorderLayout());
		Panel p1 = new Panel(new GridLayout(3, 1));

		p1.add(lb);
		p1.add(lb1);
		p1.add(lb2);
		p.add("West", p1);// 라벨

		Panel p2 = new Panel(new GridLayout(3, 1));
		p2.add(bType);
		p2.add(birth);
		p2.add(area);
		p.add("Center", p2);

		Panel p3 = new Panel(new GridLayout(4, 1));
		p3.add(blood);
		p3.add(year);
		p3.add(month);
		p3.add(day);

		blood.add("A형");
		blood.add("AB형");
		blood.add("B형");
		blood.add("O형");

		// 년
		for (int i = 1980; i <= 2022; i++)
			year.add(i + "year");
		// 월
		for (int i = 1; i <= 12; i++)
			month.add(i + "month");
		// 일
		for (int i = 1; i <= 31; i++)
			day.add(i + "day");
		p.add("East", p3);

		add("Center", p);// 중앙
		Panel p4 = new Panel(new BorderLayout());
		p4.add("Center", li);
		li.add("SEOUL");
		li.add("BUSAN");
		li.add("DAEJON");
		li.add("KIMPO");
		li.add("JEONJU");
		li.add("INCHEON");
		li.add("JAPAN");
		p4.add("East", end);
		add(p4);

	}

	public static void main(String[] args) {

		new ItemEventEx();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == end) {
			System.exit(0);
		} else if (e.getSource() == li) {
			int i = li.getSelectedIndex();
			li.remove(i);
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		if (e.getSource() == blood) {
			String imsi = blood.getSelectedItem();
			bType.setText(imsi);

		} else if (e.getSource() == day) {
			String imsi = year.getSelectedItem();
			String imsi1 = month.getSelectedItem();
			String imsi2 = day.getSelectedItem();
			birth.setText(imsi + imsi1 + imsi2);

		} else if (e.getSource() == li) {
			String imsi = li.getSelectedItem();
			area.setText(imsi + "지역");
		}

	}

}