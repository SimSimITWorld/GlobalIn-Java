package newhomework;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class Main extends JFrame implements ActionListener, MouseListener {

	// 전체
	JPanel all = new JPanel();
	JPanel jpincome;
	JPanel jpincomememo;
	JPanel jpexpense;
	JPanel jpexpensememo;
	JPanel moneyButton;
	JPanel leftop;
	JPanel leftwindow;
	JPanel leftside;
	
	
	// 메뉴바
	private MenuBar mb = new MenuBar();

	private Menu func = new Menu("기능(F)");
	private Menu col = new Menu("계산기(C)");
	private Menu help = new Menu("도움말(H)");

	private MenuItem save = new MenuItem("저장하기(S)");
	private MenuItem load = new MenuItem("불러오기(L)");
	private MenuItem play = new MenuItem("실행하기(O)");
	private MenuItem inform = new MenuItem("정보(I)");

	private Icon icon = new ImageIcon("src/pig/피글렛.png");
	private JLabel jl1 = new JLabel(icon);

	// 수입
	private JLabel inlabel = new JLabel("수입", JLabel.LEFT);

	private String[] incomearray = { "월급", "용돈", "기타수입" };

	private JLabel inmoney = new JLabel("금액", JLabel.LEFT);

	private TextField incometf = new TextField(15);

	private JLabel inmemotitle = new JLabel("MEMO", JLabel.LEFT);

	private TextField inmemo = new TextField(30);

	public void settMenuBar() {
		mb.add(func);
		mb.add(col);
		mb.add(help);
		mb.setFont(new Font("굵게", Font.BOLD, 15));
		func.add(save);
		func.add(load);
		col.add(play);
		help.add(inform);
		setMenuBar(mb);
	}

	public void settIncome() {
		jpincome = new JPanel();

		inlabel.setFont(new Font("굵게", Font.BOLD, 15));
		JComboBox<String> incomemain = new JComboBox<String>(incomearray);

		jpincome.add("West", inlabel);
		jpincome.add(incomemain);
		jpincome.add(inmoney);
		jpincome.add(incometf);

		add("West", this.jpincome);
	}

	public void setIncomeMemo() {
		jpincomememo = new JPanel();

		inmemotitle.setFont(new Font("굵게", Font.BOLD, 13));
		jpincomememo.add("West", inmemotitle);
		jpincomememo.add(inmemo);

		add(this.jpincomememo);
	}

	// 지출
	private JLabel exlabel = new JLabel("지출", JLabel.LEFT);

	private String[] expensearray = { "식비", "주거비", "교통비", "문화생활" };

	private JLabel exmoney = new JLabel("금액", JLabel.LEFT);

	private TextField expensetf = new TextField(15);

	private JLabel exmemotitle = new JLabel("MEMO", JLabel.LEFT);

	private TextField exmemo = new TextField(30);

	public void settExpense() {
		jpexpense = new JPanel();

		exlabel.setFont(new Font("굵게", Font.BOLD, 15));
		JComboBox<String> expensemain = new JComboBox<String>(expensearray);

		jpexpense.add("West", exlabel);
		jpexpense.add(expensemain);
		jpexpense.add(exmoney);
		jpexpense.add(expensetf);

		add("West", jpexpense);
	}

	public void setExpenseMemo() {
		jpexpensememo = new JPanel();

		inmemotitle.setFont(new Font("굵게", Font.BOLD, 13));
		jpexpensememo.add("West", exmemotitle);
		jpexpensememo.add(exmemo);

		add(jpexpensememo);
	}

	
	
	
	
	
	
	// 버튼
	private JButton inbutton = new JButton("INCOME");
	private JButton exbutton = new JButton("EXPENSE");
	
	public void button() {
		moneyButton = new JPanel();
		Container con = this.getContentPane();
		con.add(inbutton);
		con.add(exbutton);
	}
	
	
	// LEFT OPTION
	public void leftop() {
		leftop = new JPanel();
	//	setLayout(new GridLayout(4,2));
		add(jpincome);
		add(jpincomememo);
		add(jpexpense);
		add(jpexpensememo);
		add(jpincomememo);
	}
	
	
	
	
	// LEFT SIDE
	public void left() {
		leftwindow = new JPanel();
		Container con = this.getContentPane();
		con.add(jpincome, BorderLayout.CENTER);
		con.add(jpincomememo, BorderLayout.CENTER);
		con.add(jpexpense, BorderLayout.CENTER);
		con.add(jpexpensememo, BorderLayout.CENTER);
		
	}
	
	public void leftside() {
		leftside = new JPanel();
		Container con = this.getContentPane();
		setLayout(new BorderLayout());
		con.add("North",jl1);
		con.add(moneyButton);
		
		
	}
	
	// 실험
	
	public void lab() {
		JPanel jp = new JPanel();
		setLayout(new BorderLayout(9, 2));
		jpincome = new JPanel();

		inlabel.setFont(new Font("굵게", Font.BOLD, 15));
		JComboBox<String> incomemain = new JComboBox<String>(incomearray);

		jpincome.add("West", inlabel);
		jpincome.add(incomemain);
		jpincome.add(inmoney);
		jpincome.add(incometf);

		add("West", this.jpincome);
		
		jpincomememo = new JPanel();

		inmemotitle.setFont(new Font("굵게", Font.BOLD, 13));
		jpincomememo.add("West", inmemotitle);
		jpincomememo.add(inmemo);

		add(this.jpincomememo);
		
		jpexpense = new JPanel();

		exlabel.setFont(new Font("굵게", Font.BOLD, 15));
		JComboBox<String> expensemain = new JComboBox<String>(expensearray);

		jpexpense.add("West", exlabel);
		jpexpense.add(expensemain);
		jpexpense.add(exmoney);
		jpexpense.add(expensetf);

		add("West", jpexpense);
		
		jpexpensememo = new JPanel();

		inmemotitle.setFont(new Font("굵게", Font.BOLD, 13));
		jpexpensememo.add("West", exmemotitle);
		jpexpensememo.add(exmemo);

		add(jpexpensememo);
		
	
	}
	
	
	
	
	public Main() {
		super("피글렛 가계부");

		Container con = this.getContentPane();
		con.setLayout(new FlowLayout(15,10,10));
		settMenuBar();
		con.add(jl1, BorderLayout.NORTH);
		
	//	lab();
		JPanel newpanel = new JPanel();
    	settIncome();
		setIncomeMemo();
		settExpense();
		setExpenseMemo();
		button();

	//	setLayout(new BorderLayout(7, 2));
	//	leftside();
		
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	

	public static void main(String[] args) {

		new Main();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

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
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
