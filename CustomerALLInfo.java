import java.lang.*;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class CustomerALLInfo extends JFrame implements  ActionListener
{
	private JLabel userLabel,passLabel;
	private JTable myTable;
	private JTextField userTF,userpass,userrole,usersalary; 
	private JPasswordField passPF;
		private JScrollPane tableScrollPane;
	private JButton btnBack, btnExit,search,logout;
	private JPanel panel;
//	private Foolgame mg;
		String userId;
	public void searchid1(String a)
	{
		//SELECT * FROM userpassword WHERE UserId LIKE '%a%';
		int counter=searchrowno();
		String [][]row = new String[counter][4];
		String []col = {"UserId", "Customer Name","Phone No","Address"};
		
		myTable = new JTable(row,col);
		tableScrollPane = new JScrollPane(myTable);
		tableScrollPane.setBounds(500,50,400,150);
		panel.add(tableScrollPane);
		
        String query = "SELECT * FROM customer WHERE userId LIKE '%"+a+"%';";     
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
			int recorder=0;
			int recorder1=0;
			while(rs.next())
			{
                String userId = rs.getString("userId");
                String name = rs.getString("customerNamer");
				String phone=rs.getString("phoneNumber");
				String address=rs.getString("address");
				row[recorder][0]=userId;
				row[recorder][1]=name;
				row[recorder][2]=phone;
				row[recorder][3]=address;
				recorder++;
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
	
	public void search1(String a)
	{
		//SELECT * FROM userpassword WHERE UserId LIKE '%a%';
		int counter=searchrowno();
		String [][]row = new String[counter][4];
		String []col = {"UserId", "Customer Name","Phone No","Address"};
		
		myTable = new JTable(row,col);
		tableScrollPane = new JScrollPane(myTable);
		tableScrollPane.setBounds(500,50,400,150);
		panel.add(tableScrollPane);
		
        String query = "SELECT * FROM customer WHERE customerNamer LIKE '%"+a+"%';";     
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
			int recorder=0;
			int recorder1=0;
			while(rs.next())
			{
                String userId = rs.getString("userId");
                String name = rs.getString("customerNamer");
				String phone=rs.getString("phoneNumber");
				String address=rs.getString("address");
				row[recorder][0]=userId;
				row[recorder][1]=name;
				row[recorder][2]=phone;
				row[recorder][3]=address;
				recorder++;
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
	
	public int searchrowno()
	{
        String query = "select count(*) from userpassword;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		int count=0;
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
					
			while(rs.next())
			{
				count = rs.getInt("count(*)");
				System.out.println(count);
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
		return count;
    }

	public void test()
	{
		int counter=rowno();
		String [][]row = new String[counter][4];
		String []col = {"UserId", "Customer Name","Phone No","Address"};
		
		myTable = new JTable(row,col);
		tableScrollPane = new JScrollPane(myTable);
		tableScrollPane.setBounds(500,50,400,150);
		panel.add(tableScrollPane);
		
        String query = "select * from customer;";     
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
			int recorder=0;
			int recorder1=0;
			while(rs.next())
			{
                String userId = rs.getString("userId");
                String name = rs.getString("customerNamer");
				String phone=rs.getString("phoneNumber");
				String address=rs.getString("address");
				row[recorder][0]=userId;
				row[recorder][1]=name;
				row[recorder][2]=phone;
				row[recorder][3]=address;
				recorder++;
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
	
	public int rowno()
	{
        String query = "select count(*) from customer;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		int count=0;
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
					
			while(rs.next())
			{
				count = rs.getInt("count(*)");
				System.out.println(count);
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
		return count;
    }
	
	public CustomerALLInfo(String userId)
	{
		super("customer all info");
		this.userId=userId;
		this.setSize(1200,950);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		userLabel = new JLabel("customer Name: ");
		userLabel.setBounds(50, 100, 180, 30);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(200, 100, 80, 30);
		panel.add(userTF);
		
		
		passLabel= new JLabel("customer id ");
		passLabel.setBounds(50,150,80,30);
		panel.add(passLabel);
		
	
		
		userpass = new JTextField();
		userpass.setBounds(200, 150, 80, 30);
		panel.add(userpass);
		
			
		
		search = new JButton("search");
		search.setBounds(100, 250, 80, 30);
		search.addActionListener(this);
		panel.add(search);
		
		
		
		btnBack = new JButton("Back");
		btnBack.setBounds(200, 250, 80, 30);
		btnBack.addActionListener(this);
		panel.add(btnBack);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(300, 250, 80, 30);
		btnExit.addActionListener(this);
		panel.add(btnExit);
		
		logout = new JButton("logout");
		logout.setBounds(400, 250, 80, 30);
		logout.addActionListener(this);
		panel.add(logout);
		
		test();
		
		this.add(panel);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals(btnBack.getText()))
		{
			EmployeeInfo f1 = new EmployeeInfo(userId);
			f1.setVisible(true);
			this.setVisible(false);
		}
		else if(str.equals(search.getText()))
		{
			String usern = userTF.getText();
			String userid = userpass.getText();
			if(usern.length()!=0)
			{
				System.out.println("Search: "+userTF.getText());
				search1(userTF.getText());
			}
			else if(userid.length()!=0)
			{
				System.out.println("Search: "+userpass.getText());
				searchid1(userpass.getText());
			}
		}
		else if(str.equals(btnExit.getText()))
		{
			System.exit(0);
		}
		else{}
	}
}