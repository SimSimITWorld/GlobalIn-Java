package com.project;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class AddPane extends JPanel implements ActionListener, ItemListener {

	// swing 관련 멤버 필드 선언
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];

	private JButton okb; // 저장 버튼
	private JButton rsb; // 다시 쓰기

	private int department = 10;

	String[] caption = { "이름 : ", "직책 : ", "메일 : ", "부서 : " };

	public AddPane() {

		setLayout(new GridLayout(6, 1));
		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);

		int size = caption.length;

		int i = 0;

		for (i = 0; i < size - 1; i++) {
			jp[i] = new JPanel();
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);

			add(jp[i]);
		}

		jp[i] = new JPanel();
		jl[i] = new JLabel(caption[i]);
		jp[i].add(jl[i]);
		add(jp[i]);

		JComboBox combo = new JComboBox();
		combo.addItem("부서번호를 선택하세요.");
		for (int c = 1; c <= 5; c++) {
			combo.addItem(c * 10);
		}

		jp[i].add(combo);
		combo.addItemListener(this);

		jp[size] = new JPanel();

		okb = new JButton("사원정보입력");
		okb.addActionListener(this);

		rsb = new JButton("다시쓰기");
		rsb.addActionListener(this);

		jp[size].add(okb);
		jp[size].add(rsb);
		add(jp[size]);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		if (e.getStateChange() == ItemEvent.SELECTED) {
			department = Integer.parseInt(e.getItem().toString());
		}

	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		String ae_type = ae.getActionCommand();
		EmployeeVO evo = null;
		EmployeeDAO edvo = null;

		if (ae_type.equals(okb.getText())) {
			try {
				evo = new EmployeeVO(0, tf[0].getText(), tf[1].getText(), department, tf[2].getText());
				edvo = new EmployeeDAO();
				edvo.getEmployeeregiste(evo);
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (edvo != null)
				JOptionPane.showMessageDialog(this, tf[0].getText() + "님이 성공적으로 추가 되었습니다.");

		} else if (ae_type.equals(rsb.getText())) {

			int size = caption.length;
			for (int i = 0; i < size - 1; i++) {
				tf[i].setText("");
			}
		}

	}

}
