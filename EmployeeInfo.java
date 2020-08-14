import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class EmployeeInfo extends JFrame implements  ActionListener
{
	private JLabel title;
	private JButton profileinfo,productdetail,customerinfo,btnBack,logout,exit;
	private JPanel panel;
	String userId;
	
	public EmployeeInfo(String userId)
	{
		super("this is emplyeee info");
		//this.mg = mg;
		this.userId = userId;
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
	
		
		profileinfo = new JButton(" profile");
		profileinfo.setBounds(150, 50, 150, 30);
		profileinfo.setBackground(Color.GREEN);
		profileinfo.addActionListener(this);
		panel.add(profileinfo);
		
		productdetail = new JButton("product detail");
		productdetail.setBounds(150, 100, 120, 30);
		productdetail.setBackground(Color.RED);
		productdetail.addActionListener(this);
		panel.add(productdetail);
		
		
		
		customerinfo = new JButton("customer Info");
		customerinfo.setBounds(150, 200, 120, 30);
		customerinfo.setBackground(Color.RED);
		customerinfo.addActionListener(this);
		panel.add(customerinfo);
		
		
		btnBack = new JButton("Back");
		btnBack.setBounds(150, 300, 80, 30);
		btnBack.setBackground(Color.GREEN);
		btnBack.addActionListener(this);
		panel.add(btnBack);
		
		logout = new JButton("logout");
		logout.setBounds(250, 300, 80, 30);
		logout.setBackground(Color.GREEN);
		logout.addActionListener(this);
		panel.add(logout);
		
		exit = new JButton("exit");
		exit.setBounds(350, 300, 80, 30);
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
		else if(str.equals(logout.getText()))
		{
			Employee e1 = new Employee();
			e1.setVisible(true);
			this.setVisible(false);
		}
		else if(str.equals(customerinfo.getText()))
		{
			CustomerALLInfo e1 = new CustomerALLInfo(userId);
			e1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(str.equals(productdetail.getText()))
		{
			ProductDetail e1 = new ProductDetail(userId);
			e1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(str.equals(profileinfo.getText()))
		{
			ProfileInfo e1 = new ProfileInfo(userId);
			e1.setVisible(true);
			this.setVisible(false);
		}
		
		
		else if(str.equals(exit.getText()))
		{
			System.exit(0);
		}
		
		else{}
	}
}