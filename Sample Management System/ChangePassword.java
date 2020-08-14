import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ChangePassword extends JFrame implements ActionListener
{
	JLabel oldPassLabel, newPassLabel;
	JTextField oldPassTF, newPassTF;
	JButton changeBtn, backBtn, logoutBtn;
	JPanel panel;
	String userId;
	
	public ChangePassword(String userId)
	{
		super("Sample Management System - Change Password Window");
		
		this.userId = userId;
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		logoutBtn = new JButton("Logout");
		logoutBtn.setBounds(600, 50, 100, 30);
		logoutBtn.addActionListener(this);
		panel.add(logoutBtn);
		
		
		
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
	}
}