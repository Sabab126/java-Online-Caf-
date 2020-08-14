import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Employee extends JFrame implements  ActionListener
{
		public void checkLogin()
	{
		String query = "SELECT `userId`, `password`, `status` FROM `login`;";     
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
                String userId = rs.getString("userId");
                String password = rs.getString("password");
				int status = rs.getInt("status");
				
				if(userId.equals(userTF.getText()) && password.equals(passPF.getText()))
				{
					flag=true;
					if(status==0)
					{
						ManagerInfo eh = new ManagerInfo(userId);
						eh.setVisible(true);
						this.setVisible(false);
						
						
					}
					else if(status==1)
					{
						EmployeeInfo ch= new EmployeeInfo(userId);
						ch.setVisible(true);
						this.setVisible(false);
					
					}
					else if(status==2)
					{
						
						
							CustomerPage f222 = new CustomerPage(userId);
		                    	f222.setVisible(true);
			                   this.setVisible(false);
						
					}
					
				}
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
	
	
	
	
	
	
	private JLabel userLabel,passLabel;
	private JTextField userTF; 
	private JPasswordField passPF;
	private JButton btnBack, btnExit, login;
	private JPanel panel;

	
	public Employee()
	{
		super("emplyeee");
		
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		userLabel = new JLabel("User Name: ");
		userLabel.setBounds(100, 100, 180, 30);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(200, 100, 80, 30);
		panel.add(userTF);
		
		passLabel= new JLabel("Password");
		passLabel.setBounds(100,150,80,30);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(200, 150, 80, 30);
		//passPF.setEchoChar('$');
		panel.add(passPF);
		
		
		
		
		btnBack = new JButton("registration");
		btnBack.setBounds(150, 200, 80, 30);
		btnBack.setBackground(Color.GREEN);

		btnBack.addActionListener(this);
		panel.add(btnBack);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(250, 200, 80, 30);
		btnExit.setBackground(Color.RED);

		btnExit.addActionListener(this);
		panel.add(btnExit);
		
		login = new JButton("login");
		login.setBounds(350, 200, 80, 30);
		login.setBackground(Color.GREEN);
		login.addActionListener(this);
		panel.add(login);
		
		this.add(panel);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals(btnBack.getText()))
		{
			CustomerResistration f62 = new CustomerResistration();
			f62.setVisible(true);
			this.setVisible(false);
		}
		
		else if(str.equals(login.getText()))
		{
			//ManagerInfo e1 = new ManagerInfo();
			//EmployeeInfo e1= new EmployeeInfo();
			//e1.setVisible(true);
			//this.setVisible(false);
		      checkLogin();
		
		}
		
		else if(str.equals(btnExit.getText()))
		{
			System.exit(0);
		}
		else{}
	}
}