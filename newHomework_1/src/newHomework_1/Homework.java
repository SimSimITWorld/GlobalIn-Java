package newHomework_1;

import java.awt.*;
import java.awt.List;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.filechooser.*;


public class Homework extends JFrame implements ActionListener, MouseListener, ItemListener {

	// 메뉴바 생성
	private JMenuBar mb = new JMenuBar();

	private JMenu Function = new JMenu("기능(F)");
	private JMenu Colculate = new JMenu("계산기(C)");
	private JMenu Help = new JMenu("도움말(H)");

	private JMenuItem save = new JMenuItem("저장하기(S)");
	private JMenuItem load = new JMenuItem("불러오기(L)");
	private JMenuItem play = new JMenuItem("실행하기(O)");
	private JMenuItem information = new JMenuItem("정보(I)");

	public void Menubar() {

		setJMenuBar(mb);
		mb.setFont(new Font("궁서체", Font.BOLD, 20));
		mb.add(Function);
		mb.add(Colculate);
		mb.add(Help);
		Function.add(save);
		Function.add(load);
		Colculate.add(play);
		Help.add(information);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 이미지 생성
	private Icon icon = new ImageIcon("src/pig/피글렛.png");
	private JLabel pig = new JLabel(icon);

	
	
	
	
	
	
	
	
	
	
	
	
	
	// 수입
	private JLabel incomelabel = new JLabel("수입");
	
	
	
	
	
	
	
	
	
	
	// 수입 선택지
	private String[] incomelist = { "월급", "용돈", "기타수입" };
	JComboBox<String> incomecombo = new JComboBox<String>(incomelist);
	
	
	
	
	
	
	
	// 수입 금액
	private JLabel incomemoney = new JLabel("금액");
	
	
	
	
	
	
	
	
	
	// 수입 금액 창
	private JTextField incometext = new JTextField(12);
	
	
	
	
	
	
	
	
	
	
	// 수입 메모
	private JLabel incomememo = new JLabel("MEMO");
	private JTextField incomememotext = new JTextField(23);

	
	
	
	
	
	
	
	
	
	
	
	// 지출
	private JLabel expenselabel = new JLabel("지출");
	
	
	
	
	
	
	
	
	
	
	
	// 지출 선택지
	private String[] expenselist = { "식비", "주거비", "교통비", "문화생활", "경조사비" };
	JComboBox<String> expensecombo = new JComboBox<String>(expenselist);
	
	
	
	
	
	
	
	
	
	
	
	// 지출 금액
	private JLabel expensemoney = new JLabel("금액");
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 지출 금액 창
	private JTextField expensetext = new JTextField(12);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 지출 메모
	private JLabel expensememo = new JLabel("MEMO");
	private JTextField expensememotext = new JTextField(23);

	
	
	
	
	
	
	
	
	
	// 버튼 파넬 만들기
	private JButton income = new JButton("INCOME");
	private JButton expense = new JButton("EXPENSE");

	
	
	
	
	
	
	
	
	
	// 수입, 지출 창
	private JTextArea incomeli = new JTextArea(10, 23);
	private JTextArea expenseli = new JTextArea(10, 23);

	
	
	
	
	
	
	
	
	
	
	
	
	
	// 잔액 창
	private int a = 0;
	private JLabel currentmoneytext = new JLabel("현재 잔액: ");
	private String v = String.valueOf(a);
	private JLabel currentvalue = new JLabel(v);
	private JLabel currentmoney = new JLabel("원");

	
	
	
	
	
	
	
	
	
	
	// 파일 선택
	private JFileChooser jf = new JFileChooser();

	
	
	
	
	
	
	
	// 파일 로드
	private FileDialog fl = new FileDialog(this, "열기", FileDialog.LOAD);
	FileReader reader = null;
	
	
	
	
	// 파일 저장
	String dir;
	FileWriter writer = null;
	private FileDialog fd = new FileDialog(this, "저장", FileDialog.SAVE);
	JTextField name = new JTextField();
	private JFileChooser jfc = new JFileChooser();
	BufferedWriter br = null;

	
	
	
	// 파일 열기
	private JFrame open = new JFrame("내역");
	
	
	
	
	
	
	
	// 계산기
	private JFrame colwindow = new JFrame("계산기");
	private String[] col = {"","","←","CE","C","7","8","9","/","sqrt","4","5","6","*","%","1","2","3","-","1/x","0","+/-",".","+","="};
	private JButton[] colbutton = new JButton[col.length];
	private JTextField coltext = new JTextField(34);
	private String first_num = "" ;
	private String second_num = "" ;
	private String first_sum = "";
	private String second_sum  = "";
	private String result = "";
	private int first_value ;
	private int second_value ;
	private int result_value ;
	private boolean count = false;
	private boolean colcol = false;
	private boolean colvalue = true;
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 계산기 숫자
	private int i = 0;
	
	
	
	
	
	public Homework() {

		super("피글렛 가계부");
		Container con = this.getContentPane();
		add(pig);
		con.setLayout(new CardLayout());

		// 피글렛 사진 및 수입
		JPanel incomepanel = new JPanel();
		incomepanel.setLayout(new FlowLayout());
		incomepanel.add(incomelabel);
		incomepanel.add(incomecombo);
		incomepanel.add(incomemoney);
		incomepanel.add(incometext);

		// 수입 메모
		JPanel incomeMemo = new JPanel();
		incomeMemo.setLayout(new FlowLayout());
		incomeMemo.add(incomememo);
		incomeMemo.add(incomememotext);

		// 수입 라인 결합
		JPanel Leftside = new JPanel();
		Leftside.setLayout(new BorderLayout());
		Leftside.add("North", pig);
		Leftside.add("Center", incomepanel);
		Leftside.add("South", incomeMemo);

		// 지출
		JPanel expensepanel = new JPanel();
		expensepanel.setLayout(new FlowLayout());
		expensepanel.add(expenselabel);
		expensepanel.add(expensecombo);
		expensepanel.add(expensemoney);
		expensepanel.add(expensetext);

		// 지출 메모
		JPanel expenseMemo = new JPanel();
		expenseMemo.setLayout(new FlowLayout());
		expenseMemo.add(expensememo);
		expenseMemo.add(expensememotext);

		// 피글렛, 수입, 지출 결합
		JPanel Midside = new JPanel();
		Midside.setLayout(new BorderLayout());
		Midside.add("North", Leftside);
		Midside.add("Center", expensepanel);
		Midside.add("South", expenseMemo);

		// 버튼 생성
		JPanel button1 = new JPanel();
		button1.add(income, BorderLayout.WEST);
		button1.add(expense, BorderLayout.EAST);
		con.add(button1);

		// 왼쪽 라인 결합 완성
		JPanel leftcontrol = new JPanel();
		leftcontrol.setLayout(new BorderLayout());
		leftcontrol.add(Midside, BorderLayout.CENTER);
		leftcontrol.add("South", button1);

		// 오른쪽 스크롤 창 생성
		JPanel windows = new JPanel();
		windows.setLayout(new BorderLayout());
		windows.add(new JScrollPane(incomeli), BorderLayout.WEST);
		windows.add(new JScrollPane(expenseli), BorderLayout.EAST);
		con.add(windows, BorderLayout.CENTER);

		// 밑에 현재 값 생성
		JPanel current = new JPanel();
		current.setLayout(new FlowLayout());
		current.add(currentmoneytext);
		current.add(currentvalue);
		current.add(currentmoney);

		// 상태창 및 현재 값 결합
		JPanel rightcontrol = new JPanel();
		rightcontrol.setLayout(new BorderLayout());
		rightcontrol.add(windows);
		rightcontrol.add(current, BorderLayout.SOUTH);
		con.add(rightcontrol);

		// 좌측(피글렛, 수입, 지출, 버튼) 과 우측(상태창 및 현재 값) 결합 완성
		JPanel all = new JPanel();
		all.setLayout(new BorderLayout());
		all.add(leftcontrol, BorderLayout.WEST);
		all.add(rightcontrol, BorderLayout.EAST);
		con.add(all, BorderLayout.CENTER);

		con.add("Center", all);

		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		Menubar();

		pack();
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		incomeli.setEditable(false);
		save.addActionListener(this);
		load.addActionListener(this);
		information.addActionListener(this);
		income.addMouseListener(this);
		expense.addMouseListener(this);
		play.addActionListener(this);
		
	}

	
	
	public static void main(String[] args) {

		new Homework();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==save) {
			fd.setVisible(true);
			
			String dir = fd.getDirectory();
			String filename = fd.getFile();
			
			if(dir==null) {
				return;
			}
			
			File fdfile = new File(dir);
			try {
				br = new BufferedWriter(new FileWriter(fdfile + "/" + filename));
				br.write("■ 수입 ■\n\n\n");
				br.write(incomeli.getText());
				br.write("\n\n■ 지출 ■\n\n\n");
				br.write(expenseli.getText());
				br.write("\n\n■ 현재 잔액 ■\n\n\n");
				br.write(": " + currentvalue.getText() + "원");
				br.flush();
				br.close();

				
				
				
				
				
				
			}catch(IOException ee) {
				ee.printStackTrace();
			}
		}
		else if(e.getSource()==load) {
			fl.setVisible(true);
			
			String dir = fl.getDirectory();
			String path=fl.getDirectory()+fl.getFile();
			String filename = fl.getFile();
			
			if(dir==null) {
				return;
			}
			
			File fdfile = new File(dir);
			BufferedReader br = null;
			FileReader fr = null;
			try {
				fr = new FileReader(path);
				br = new BufferedReader(new FileReader(path));
				int readValue = 0;
				JFrame jf = new JFrame("내역");
				JTextArea jta = new JTextArea();
				jf.setVisible(true);
				
				jf.setSize(300, 200);
				reader = new FileReader(path);
				
				
				jta.setEditable(false);
				String[] str = new String[reader.read()];
				int i = 0;
				
				while((readValue = reader.read()) != -1) {
					str[i] = new String();
					str[i] = String.valueOf((char)readValue);
					i++;
				}
				
				
				String result = String.join("", str);
				jta.setText(result);
		//		jta.setText(Arrays.toString(ss));
				jf.add(jta);
				
		//		JFrame jf = new JFrame("내역");
		//		JPanel inin = new JPanel();
		//		JTextArea jta = new JTextArea();
		//		inin.setLayout(new GridLayout());
		//		jta.setText("■ 수입 ■\n\n\n" + incomeli.getText() + "\n\n■ 지출 ■\n\n\n" + expenseli.getText() + "\n\n■ 현재 잔액 ■\n\n\n" + ": " + currentvalue.getText() + "원");
		//		jta.setEditable(false);
		//		JScrollPane js = new JScrollPane(jta);
		//		inin.add(js, BorderLayout.SOUTH);
		//		jf.add(inin);
		//		jf.setVisible(true);
		//		jf.setSize(300, 400);
		//		jf.setResizable(false);
				br.close();
				
				
				
			}catch(IOException ee) {
				ee.printStackTrace();
			}
			
			int i = JFileChooser.APPROVE_OPTION;
			
			
			
			
			
		}
		
		
		
		
		
		else if(e.getSource()==play) {
			
			class Jbutton implements ActionListener{

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton btn=(JButton)e.getSource();
					String jtext=btn.getText();
					boolean aa = true;
					
						
					
					if(count==false) {
						if(btn.getText().equals("0")) {
							first_num = "0";
							first_sum += first_num;
							coltext.setText(first_sum);
						}
						else if(btn.getText().equals("1")) {
							first_num = "1";
							first_sum += first_num;
							coltext.setText(first_sum);
						}
						else if(btn.getText().equals("2")) {
							first_num = "2";
							first_sum += first_num;
							coltext.setText(first_sum);
						}
						else if(btn.getText().equals("3")) {
							first_num = "3";
							first_sum += first_num;
							coltext.setText(first_sum);
						}
						else if(btn.getText().equals("4")) {
							first_num = "4";
							first_sum += first_num;
							coltext.setText(first_sum);
						}
						else if(btn.getText().equals("5")) {
							first_num = "5";
							first_sum += first_num;
							coltext.setText(first_sum);
						}
						else if(btn.getText().equals("6")) {
							first_num = "6";
							first_sum += first_num;
							coltext.setText(first_sum);
						}
						else if(btn.getText().equals("7")) {
							first_num = "7";
							first_sum += first_num;
							coltext.setText(first_sum);
						}
						else if(btn.getText().equals("8")) {
							first_num = "8";
							first_sum += first_num;
							coltext.setText(first_sum);
						}
						else if(btn.getText().equals("9")) {
							first_num = "9";
							first_sum += first_num;
							coltext.setText(first_sum);
						}
						else {
							count = true;
						}
					}else if(count==true) {
						if(btn.getText().equals("+")) {
							result = "+";
							coltext.setText(result);
						}
						else if(btn.getText().equals("-")) {
							result = "-";
							coltext.setText(result);
						}
						else if(btn.getText().equals("*")) {
							result = "*";
							coltext.setText(result);
						}
						else if(btn.getText().equals("/")) {
							result = "/";
							coltext.setText(result);
						}
						else {
							if(btn.getText().equals("0")) {
								second_num = "0";
								second_sum += second_num;
								coltext.setText(second_sum);
							}
							else if(btn.getText().equals("1")) {
								second_num = "1";
								second_sum += second_num;
								coltext.setText(second_sum);
							}
							else if(btn.getText().equals("2")) {
								second_num = "2";
								second_sum += second_num;
								coltext.setText(second_sum);
							}
							else if(btn.getText().equals("3")) {
								second_num = "3";
								second_sum += second_num;
								coltext.setText(second_sum);
							}
							else if(btn.getText().equals("4")) {
								second_num = "4";
								second_sum += second_num;
								coltext.setText(second_sum);
							}
							else if(btn.getText().equals("5")) {
								second_num = "5";
								second_sum += second_num;
								coltext.setText(second_sum);
							}
							else if(btn.getText().equals("6")) {
								second_num = "6";
								second_sum += second_num;
								coltext.setText(second_sum);
							}
							else if(btn.getText().equals("7")) {
								second_num = "7";
								second_sum += second_num;
								coltext.setText(second_sum);
							}
							else if(btn.getText().equals("8")) {
								second_num = "8";
								second_sum += second_num;
								coltext.setText(second_sum);
							}
							else if(btn.getText().equals("9")) {
								second_num = "9";
								second_sum += second_num;
								coltext.setText(second_sum);
							}
							else if(btn.getText().equals("=")) {
								colcol = true;
								if(colcol==true) {
									if(result=="+") {
										first_value = Integer.parseInt(first_sum);
										second_value = Integer.parseInt(second_sum);
										result_value = first_value + second_value;
										coltext.setText(Integer.toString(result_value));
										count = false;
									}
									else if(result=="-") {
										first_value = Integer.parseInt(first_sum);
										second_value = Integer.parseInt(second_sum);
										result_value = first_value - second_value;
										coltext.setText(Integer.toString(result_value));
										count = false;
									}
									else if(result=="*") {
										first_value = Integer.parseInt(first_sum);
										second_value = Integer.parseInt(second_sum);
										result_value = first_value * second_value;
										coltext.setText(Integer.toString(result_value));
										count = false;
									}
									else if(result=="/") {
										first_value = Integer.parseInt(first_sum);
										second_value = Integer.parseInt(second_sum);
										result_value = first_value / second_value;
										coltext.setText(Integer.toString(result_value));
										count = false;
									}
									
								}
							}
						}
					}
					
//					if(colcol==true) {
//						if(result=="+") {
//							first_value = Integer.parseInt(first_sum);
//							second_value = Integer.parseInt(second_sum);
//							result_value = first_value + second_value;
//							coltext.setText(Integer.toString(result_value));
//							count = false;
//						}
//						else if(result=="-") {
//							first_value = Integer.parseInt(first_sum);
//							second_value = Integer.parseInt(second_sum);
//							result_value = first_value - second_value;
//							coltext.setText(Integer.toString(result_value));
//							count = false;
//						}
//						else if(result=="*") {
//							first_value = Integer.parseInt(first_sum);
//							second_value = Integer.parseInt(second_sum);
//							result_value = first_value * second_value;
//							coltext.setText(Integer.toString(result_value));
//							count = false;
//						}
//						else if(result=="/") {
//							first_value = Integer.parseInt(first_sum);
//							second_value = Integer.parseInt(second_sum);
//							result_value = first_value / second_value;
//							coltext.setText(Integer.toString(result_value));
//							count = false;
//						}
//						
//					}
					
				
					
					
					
				//	coltext.setText(btn.getText());
					
				
//					
//					if(e.getSource()==colbutton[20]) {
//						i = 0;
//						coltext.setText(Integer.toString(i));
//					}
//					else if(e.getSource()==colbutton[15]) {
//						i = 1;
//						coltext.setText(Integer.toString(i));
//					}
//					else if(e.getSource()==colbutton[16]) {
//						i = 2;
//						coltext.setText(Integer.toString(i));
//					}
//					else if(e.getSource()==colbutton[17]) {
//						i = 3;
//						coltext.setText(Integer.toString(i));
//					}
//					else if(e.getSource()==colbutton[10]) {
//						i = 4;
//						coltext.setText(Integer.toString(i));
//					}
//					else if(e.getSource()==colbutton[11]) {
//						i = 5;
//						coltext.setText(Integer.toString(i));
//					}
//					else if(e.getSource()==colbutton[12]) {
//						i = 6;
//						coltext.setText(Integer.toString(i));
//					}
//					else if(e.getSource()==colbutton[5]) {
//						i = 7;
//						coltext.setText(Integer.toString(i));
//					}
//					else if(e.getSource()==colbutton[6]) {
//						i = 8;
//						coltext.setText(Integer.toString(i));
//					}
//					else if(e.getSource()==colbutton[7]) {
//						i = 9;
//						coltext.setText(Integer.toString(i));
//					}
					
				}
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			JPanel coljp1 = new JPanel();
			coljp1.setLayout(new GridLayout(5, 5, 5, 5));
			colwindow.setLayout(new BorderLayout());
			
			for(int i = 0;i<colbutton.length;i++) {
				colbutton[i] = new JButton(col[i]);
				coljp1.add(colbutton[i],BorderLayout.SOUTH);
				colbutton[i].addActionListener(new Jbutton());
			}
			
			for(int i = 0;i<col.length;i++) {
				if(col[i]==col[i].replaceAll("[^0-9]", " ")) 
					colbutton[i].setForeground(Color.BLUE);
				else 
					colbutton[i].setForeground(Color.RED);
			}
		
			
			coltext.setHorizontalAlignment(JTextField.RIGHT);
			JPanel coljp2 = new JPanel();
			coljp2.add(coltext);
			coljp2.setEnabled(true);
			coltext.setEditable(false);
			colwindow.add("North",coljp2);
			colwindow.add(coljp1);
			colwindow.setVisible(true);
			
				
			
			
			
			
			
			
			
			
			
			
			
			
			colwindow.setSize(400,350);
			colwindow.setResizable(false);
		}
		
		
		
	
		
		
		
		else if(e.getSource()==information) {
			
			JOptionPane.showMessageDialog(this,
					"Piglet Account Book for all people.\n"
					+ "Version: Piglet Account Book Service Release 1.1\n"
					+ "(c) Copyright yhk and others, 2013.05.\n"
					+ "All rights reserved.","가계부 정보",JOptionPane.INFORMATION_MESSAGE);
			
		}

	}

	
	
	

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==income) { 
			String inmemo = incomememotext.getText();
			String inmoneytext = incometext.getText();
			a = a + Integer.parseInt(inmoneytext);
			v = Integer.toString(a);
			currentvalue.setText(v);
			String incombo = incomecombo.getSelectedItem().toString();
			incomeli.append(incombo+"\t"+inmoneytext+"원"+"\n"+inmemo+"\n");
			incomeli.append("\n");
			incometext.setText("");
			incomememotext.setText("");
		} else if(e.getSource()==expense) {
			String exmemo = expensememotext.getText();
			String expensemoneytext = expensetext.getText();
			a = a - Integer.parseInt(expensemoneytext);
			v = Integer.toString(a);
			currentvalue.setText(v);
			String excombo = expensecombo.getSelectedItem().toString();
			expenseli.append(excombo+"\t"+expensemoneytext+"원"+"\n"+exmemo+"\n");
			expenseli.append("\n");
			expensetext.setText("");
			expensememotext.setText("");
		}
		
		
		
		
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
		
	}

	

	
}
