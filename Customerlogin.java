import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Customerlogin extends JFrame implements  ActionListener
{
	private JLabel username,password;
	private JTextField userTF; 
	private JPasswordField passPF;
	private JButton profile,productdetail,boughtfood,ok,btnBack,cancel;
	private JPanel panel;
	//private Foolgame mg;
	
	public Customerlogin()
	{
		super("This is customer login");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
	
		
		
		
		
	    username = new JLabel("User Name: ");
		username.setBounds(50, 100, 180, 30);
		panel.add(username);
		
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
		
	
		
		/*profile = new JButton("profile");
		profile.setBounds(150, 200, 80, 30);
		profile.setBackground(Color.GREEN);
	
		profile.addActionListener(this);
		panel.add(profile);
		
		productdetail = new JButton("customer-productdetail");
		productdetail.setBounds(300, 200, 150, 30);
		productdetail.setBackground(Color.RED);
		productdetail.addActionListener(this);
		panel.add(productdetail);
		
		
		
		boughtfood = new JButton("boughtfood");
		boughtfood.setBounds(550, 200, 120, 30);
		boughtfood.setBackground(Color.RED);
		boughtfood.addActionListener(this);
		panel.add(boughtfood);*/

		ok = new JButton("ok");
		ok.setBounds(100, 200, 80, 30);
		ok.setBackground(Color.RED);
		ok.addActionListener(this);
		panel.add(ok);
		
		
		btnBack = new JButton("Back");
		btnBack.setBounds(200, 200, 80, 30);
		btnBack.setBackground(Color.GREEN);
		btnBack.addActionListener(this);
		panel.add(btnBack);
		
		cancel= new JButton("cancel");
		cancel.setBounds(300,200,80,30);
		cancel.addActionListener(this);
		panel.add(cancel);
		
	
		
		
		this.add(panel);
	}
	
	
	
	public void checkLogin()
	{
		String query = "SELECT `UserName`, `Password` FROM `customerlogin`;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop1","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
			
			boolean flag = false;			
			while(rs.next())
			{
                String userId = rs.getString("UserName");
                String password = rs.getString("Password");
				//int status = rs.getInt("status");
				
				if(userId.equals(userTF.getText()) && password.equals(passPF.getText()))
				{
					flag=true;
					
				        CustomerPage eh = new CustomerPage(userId);
						eh.setVisible(true);
						this.setVisible(false);
					
					
				}
				else{}
			}
			if(!flag)
			{
				JOptionPane.showMessageDialog(this,"Invalid ID or Password"); 
			}
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
        finally
		{
            try
			{
                if(rs!=null)
					rs.close();

                if(st!=null)
					st.close();

                if(con!=null)
					con.close();
            }
            catch(Exception ex){}
        }
	}
	
	
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals(btnBack.getText()))
		{
			Customer f1 = new Customer();
			f1.setVisible(true);
			this.setVisible(false);
		}
		else if(str.equals(ok.getText()))
		{
			
			checkLogin();
			
		}
		else if(str.equals(cancel.getText()))
		{
			System.exit(0);
		}
		
		
		
		
		else{}
	}
}