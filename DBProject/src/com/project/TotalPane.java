package com.project;

import javax.swing.*;
import java.awt.*;

public class TotalPane extends JPanel{
	
	public TotalPane() {
		
		setLayout(null);
		
		JTable table = new JTable(new EmployeeModel());
		JScrollPane jp = new JScrollPane(table);
		jp.setBounds(10, 100, 500, 400);
		add(jp);
	}
	
	
}
