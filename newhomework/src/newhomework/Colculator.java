package newhomework;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class Colculator extends JFrame implements ActionListener, MouseListener{

	static boolean r = true;
	
	private String[] col = {"7","8","9","4","5","6","1","2","3","#","0","*"};
	private JButton[] bt = new JButton[col.length];
	
	private JTextField tf = new JTextField(20);
	private TextField tf1 = new TextField(20);
	private JPanel jp = new JPanel();
	
	public Colculator() {
		
		super("계산기");
		
		Container con = this.getContentPane();
		
		con.setLayout(new BorderLayout());
		con.add(tf, BorderLayout.NORTH);
		
		
		con.setLayout(new GridLayout(4, 3, 5, 5));
		BevelBorder bb = new BevelBorder(BevelBorder.RAISED);
		
		for(int i = 0;i<col.length;i++) {
			bt[i] = new JButton(col[i]);
			con.add(bt[i]);
			bt[i].setBorder(bb);
			bt[i].addMouseListener(this);
		}
		
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new Colculator();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	
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

}
