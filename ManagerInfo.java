import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ManagerInfo extends JFrame implements ActionListener
{
	private JLabel title;
	private JButton Profile,productdetail,customerinfo,employeeinfo,btnBack,exit,logout;
	private JPanel panel;

	String userId;
	
	public ManagerInfo(String userId)
	{
		super("this is manager info");
		//this.mg = mg;
		this.userId = userId;
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
	
		
		Profile = new JButton("profile");
		Profile.setBounds(150, 200, 80, 30);
		Profile.setBackground(Color.GREEN);
		Profile.addActionListener(this);
		panel.add(Profile);
		
		productdetail = new JButton("product detail");
		productdetail.setBounds(300, 200, 120, 30);
		productdetail.setBackground(Color.RED);
		productdetail.addActionListener(this);
		panel.add(productdetail);
		
		
		
		customerinfo = new JButton("customer Info");
		customerinfo.setBounds(450, 200, 120, 30);
		customerinfo.addActionListener(this);
		panel.add(customerinfo);
		
	    employeeinfo = new JButton("emplyeee Info");
		employeeinfo.setBounds(600, 200, 120, 30);
		employeeinfo.addActionListener(this);
		panel.add(employeeinfo);
		
		
			btnBack = new JButton("Back");
		btnBack.setBounds(350, 300, 80, 30);
		btnBack.setBackground(Color.GREEN);
		btnBack.addActionListener(this);
		panel.add(btnBack);
		
		exit = new JButton("exit");
		exit.setBounds(450, 300, 80, 30);
		exit.setBackground(Color.GREEN);
		exit.addActionListener(this);
		panel.add(exit);
		
		this.add(panel);
	}
		public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals(btnBack.getText()))
		{
			Employee f1 = new Employee();
			f1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(str.equals(customerinfo.getText()))
		{
			CustomerInfoManager f1 = new CustomerInfoManager(userId);
			f1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(str.equals(productdetail.getText()))
		{
			ProductDetailsManager g1 = new ProductDetailsManager(userId);
			g1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(str.equals(Profile.getText()))
		{
			ProfileManager ex1 = new ProfileManager(userId);
			ex1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(str.equals(employeeinfo.getText()))
		{
			EmployeeALLInfo ex2 = new EmployeeALLInfo(userId);
			ex2.setVisible(true);
			this.setVisible(false);
		}
		
		
		else if(str.equals(exit.getText()))
		{
			System.exit(0);
		}
		
		else{}
	}
	
	
	
	
	
}