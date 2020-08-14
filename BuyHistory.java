import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class BuyHistory extends JFrame implements  ActionListener
{
	private JLabel userLabel,passLabel,quantity,price;
	private JTable myTable;
	private JTextField userTF,userquantity,userprice; 
	private JPasswordField passPF;
	private JButton btnBack, btnExit,update,delete,search,purchase,logout;
	private JScrollPane tableScrollPane;
	private JPanel panel;
	String userId;

	
	public BuyHistory(String userId)
	{
		super("customer buy history");
		this.userId = userId;
		this.setSize(1400,950);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		userLabel = new JLabel("Buy Historyy");
		userLabel.setBounds(100, 10, 400, 50);
		userLabel.setFont(new Font("Serif", Font.PLAIN, 40));
		panel.add(userLabel);
		
		
		
		
		
		btnBack = new JButton("Back");
		btnBack.setBounds(100, 300, 80, 30);
		btnBack.setBackground(Color.GREEN);
		btnBack.addActionListener(this);
		panel.add(btnBack);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(200, 300, 80, 30);
		btnExit.setBackground(Color.RED);
		btnExit.addActionListener(this);
		panel.add(btnExit);
			
		logout = new JButton("logout");
		logout.setBounds(300, 300, 80, 30);
		logout.setBackground(Color.RED);
		logout.addActionListener(this);
		panel.add(logout);
		
		
		
		
				String [][]row = {{"ABCD", "1", "100","700","15th june-2018"},
					     {"XYZ", "2", "45","554","15th june-2018"},
						 {"ABCD", "3", "45","552","15th june-2018"},
					     {"XYZ", "4", "32","554","15th june-2018"},
						 {"ABCD", "5", "488","545","15th june-2018"},
					     {"XYZ", "6", "55","545","15th june-2018"},
						 {"ABCD", "7", "23","54","15th june-2018"},
					     {"XYZ", "8", "45","54","15th june-2018"}};
		String []col = {"purchase name", "food id", "quantity","price","date"};
		
		myTable = new JTable(row,col);
		tableScrollPane = new JScrollPane(myTable);
		tableScrollPane.setBounds(100,80,500,200);
		panel.add(tableScrollPane);
		
		
		
		this.add(panel);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals(btnBack.getText()))
		{
			CustomerPage f1 = new CustomerPage(userId);
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