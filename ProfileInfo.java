import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ProfileInfo extends JFrame implements  ActionListener
{
    private JLabel userLabel, password,phonenumber,address;
	private JTextField userTF,number,addressfield;
	private JPasswordField passPF;
	private JButton resistration,btnBack,cancel,update,logout;
	private JPanel panel;
		String userId;
	
	
	public ProfileInfo(String userId)
	{
		super("employee profile");
		this.userId=userId;
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		
		userLabel = new JLabel(" employee Name: ");
		userLabel.setBounds(50, 100, 180, 30);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(150, 100, 80, 30);
		panel.add(userTF);
		
		
		
		password= new JLabel("Password");
		password.setBounds(50,150,80,30);
		panel.add(password);
		
		passPF = new JPasswordField();
		passPF.setBounds(150, 150, 80, 30);
		//passPF.setEchoChar('$');
		panel.add(passPF);
		
		
		/*passLabel= new JLabel("ID");
		passLabel.setBounds(0,150,80,30);
		panel.add(passLabel);*/
		
		phonenumber = new JLabel("phone number: ");
		phonenumber.setBounds(50, 200, 180, 30);
		panel.add(phonenumber);
		
		
		number = new JTextField();
		number.setBounds(150, 200, 80, 30);
		panel.add(number);

		address = new JLabel("address: ");
		address.setBounds(50, 250, 180, 30);
		panel.add(address);
		
		
		addressfield = new JTextField();
		addressfield.setBounds(150, 250, 80, 30);
		panel.add(addressfield);
		
		
		
		update = new JButton("update");
		update.setBounds(300, 150, 80, 30);
		update.setBackground(Color.GREEN);		
		update.addActionListener(this);
		panel.add(update);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(300, 300, 80, 30);	
		btnBack.addActionListener(this);
		panel.add(btnBack);
		
		
		cancel= new JButton("cancel");
		cancel.setBounds(400,300,80,30);
		cancel.addActionListener(this);
		panel.add(cancel);
		
		logout= new JButton("logout");
		logout.setBounds(500,300,80,30);
		logout.addActionListener(this);
		panel.add(logout);
		
		this.add(panel);
	}
	

	
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals(btnBack.getText()))
		{
			EmployeeInfo ff1 = new EmployeeInfo(userId);
			ff1.setVisible(true);
			this.setVisible(false);
		}
		
		else if (str.equals(cancel.getText()))
		{
			System.exit(0);
		}
		else{}
	}
}