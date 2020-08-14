
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Customer extends JFrame implements  ActionListener
{
	private JLabel title;
	private JTable myTable;
	private JScrollPane tableScrollPane;
	private JButton btnBack, btnExit,login,resister;
	private JPanel panel;
	//private Foolgame mg;
	
	public Customer()
	{
		super("customer login and resister");
		//this.mg = mg;
		this.setSize(800,650);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		title= new JLabel();
		title.setBounds(300,50,200,50);
		panel.add(title);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(150, 200, 80, 30);
		btnBack.setBackground(Color.GREEN);
		//btnBack.addMouseListener(this);
		btnBack.addActionListener(this);
		panel.add(btnBack);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(250, 200, 80, 30);
		btnExit.setBackground(Color.RED);
		//btnExit.addMouseListener(this);
		btnExit.addActionListener(this);
		panel.add(btnExit);
		
		
		
		login = new JButton("login");
		login.setBounds(150, 100, 80, 30);
		login.setBackground(Color.GREEN);
		//btnBack.addMouseListener(this);
		login.addActionListener(this);
		panel.add(login);
		
		/*String [][]row = {{"ABCD", "DEFG", "IJKL"},
					     {"XYZ", "UVW", "MNO"},
						 {"ABCD", "DEFG", "IJKL"},
					     {"XYZ", "UVW", "MNO"},
						 {"ABCD", "DEFG", "IJKL"},
					     {"XYZ", "UVW", "MNO"},
						 {"ABCD", "DEFG", "IJKL"},
					     {"XYZ", "UVW", "MNO"}};
		String []col = {"Col1", "Col2", "Col3"};
		
		myTable = new JTable(row,col);
		tableScrollPane = new JScrollPane(myTable);
		tableScrollPane.setBounds(400,50,300,100);
		panel.add(tableScrollPane);*/

		resister = new JButton("resister");
		resister.setBounds(250, 100, 80, 30);
		resister.setBackground(Color.GREEN);
		resister.addActionListener(this);
		panel.add(resister);
		
		this.add(panel);
	}
	
	
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		
		if(str.equals(btnBack.getText()))
		{
			Cafejojo f1 = new Cafejojo();
			f1.setVisible(true);
			this.setVisible(false);
		}
		else if(str.equals(login.getText()))
		{
			Customerlogin f1 = new Customerlogin();
			f1.setVisible(true);
			this.setVisible(false);
		}
		else if(str.equals(resister.getText()))
		{
			CustomerResistration f1 = new CustomerResistration();
			f1.setVisible(true);
			this.setVisible(false);
		}
		
		
		else if(str.equals(btnExit.getText()))
		{
			System.exit(0);
		}
		else{}
	}
}