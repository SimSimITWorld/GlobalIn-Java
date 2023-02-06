package com.awteventex;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventEx03 extends Frame implements ActionListener {

	private Button[] bt = new Button[4];
	private Panel[] pp = new Panel[4];
	private Color[] cc = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};
	
	private CardLayout card = new CardLayout();
	private Panel pptp;
	
	public ActionEventEx03() {
		super("ActionEvent Test3");
		
		setLayout(new BorderLayout());
		Panel p = new Panel(new GridLayout(1, 4));
		
		for(int i = 0;i<bt.length;i++) {
			bt[i] = new Button((i+1)+"번 버튼");
			bt[i].addActionListener(this);
			p.add(bt[i]);
		}
		
		add("North", p);
		
		pptp = new Panel(card);
		for(int i = 0;i<pp.length;i++) {
			pp[i] = new Panel();
			pp[i].setBackground(cc[i]);
			pptp.add(""+i, pp[i]);
		}
		
		add("Center", pptp);
		card.show(pptp, "0");		
		
		WinEvent w = new WinEvent();
		setSize(300, 200);
		setVisible(true);
		addWindowListener(w);
	}
	
	
	public static void main(String[] args) {
		
		new ActionEventEx03();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
