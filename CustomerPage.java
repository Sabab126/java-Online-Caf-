import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CustomerPage extends JFrame implements  ActionListener
{
	
	
	private JButton profile,productdetail,buyhistory,btnBack,cancel;
	private JPanel panel;
		String userId;
	
	
	public CustomerPage(String userId )
	{
		super("This is customer page");
		this.setSize(1200,650);
		this.userId=userId;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
	
		profile = new JButton("profile");
		profile.setBounds(150, 100, 80, 30);
		profile.setBackground(Color.GREEN);
		profile.addActionListener(this);
		panel.add(profile);
		
		productdetail = new JButton("customer-productdetail");
		productdetail.setBounds(150, 200, 150, 30);
		productdetail.setBackground(Color.RED);
		productdetail.addActionListener(this);
		panel.add(productdetail);
		
		
		
		buyhistory = new JButton("buyhistory");
		buyhistory.setBounds(150, 300, 120, 30);
		buyhistory.setBackground(Color.RED);
		buyhistory.addActionListener(this);
		panel.add(buyhistory);

		
		
		
		btnBack = new JButton("Back");
		btnBack.setBounds(100, 400, 80, 30);
		btnBack.setBackground(Color.GREEN);
		btnBack.addActionListener(this);
		panel.add(btnBack);
		
		cancel= new JButton("cancel");
		cancel.setBounds(200,400,80,30);
		cancel.addActionListener(this);
		panel.add(cancel);
		
	
		
		
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
		
		if(str.equals(productdetail.getText()))
		{
			CustomerProductDetails f1 = new CustomerProductDetails(userId);
			f1.setVisible(true);
			this.setVisible(false);
		}
		else if(str.equals(buyhistory.getText()))
		{
			BuyHistory f1 = new BuyHistory(userId);
			f1.setVisible(true);
			this.setVisible(false);
		}
		else if(str.equals(profile.getText()))
		{
			CustomerProfile f1 = new CustomerProfile(userId);
			f1.setVisible(true);
			this.setVisible(false);
		}
		
		else if(str.equals(cancel.getText()))
		{
			System.exit(0);
		}
		
		
		
		
		else{}
	}
}