import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CustomerResistration extends JFrame implements  ActionListener
{
    private JLabel userLabel, password,phonenumber,address;
	private JTextField userTF,number,addressfield;
	private JPasswordField passPF;
	private JButton resistration,btnBack,cancel;
	private JPanel panel;
	
	
	public CustomerResistration()
	{
		super("customer resistration");
		//this.mg = mg;
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		
		userLabel = new JLabel("User Name: ");
		userLabel.setBounds(0, 100, 180, 30);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(200, 100, 80, 30);
		panel.add(userTF);
		
		
		
		password= new JLabel("Password");
		password.setBounds(50,150,80,30);
		panel.add(password);
		
		passPF = new JPasswordField();
		passPF.setBounds(200, 150, 80, 30);
		//passPF.setEchoChar('$');
		panel.add(passPF);
		
		
		/*passLabel= new JLabel("ID");
		passLabel.setBounds(0,150,80,30);
		panel.add(passLabel);*/
		
		phonenumber = new JLabel("phone number: ");
		phonenumber.setBounds(0, 200, 180, 30);
		panel.add(phonenumber);
		
		
		number = new JTextField();
		number.setBounds(100, 200, 80, 30);
		panel.add(number);

		address = new JLabel("address: ");
		address.setBounds(0, 250, 180, 30);
		panel.add(address);
		
		
		addressfield = new JTextField();
		addressfield.setBounds(100, 250, 80, 30);
		panel.add(addressfield);
		
		
		
		resistration = new JButton("resistration");
		resistration.setBounds(200, 300, 120, 30);
		resistration.setBackground(Color.GREEN);		
		resistration.addActionListener(this);
		panel.add(resistration);
		
		btnBack = new JButton("Back");
		btnBack.setBounds(350, 300, 80, 30);	
		btnBack.addActionListener(this);
		panel.add(btnBack);
		
		
		cancel= new JButton("cancel");
		cancel.setBounds(450,300,80,30);
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
		else if(str.equals(resistration.getText()))
		{
			Employee fr1 = new Employee();
			fr1.setVisible(true);
			this.setVisible(false);
		}
		
		else if (str.equals(cancel.getText()))
		{
			System.exit(0);
		}
		else{}
	}
}