import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;

public class EmployeeALLInfo extends JFrame implements  ActionListener
{
		
	
	public void searchid1(String a)
	{
		//SELECT * FROM userpassword WHERE UserId LIKE '%a%';
		int counter=searchrowno();
		String [][]row = new String[counter][5];
		String []col = {"userId", "employeeName","phoneNumber","role","salary"};
		
		myTable = new JTable(row,col);
		tableScrollPane = new JScrollPane(myTable);
		tableScrollPane.setBounds(500,50,400,150);
		panel.add(tableScrollPane);
		
        String query = "SELECT * FROM employee WHERE userId LIKE '%"+a+"%';";     
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
                String name = rs.getString("employeeName");
				String phone=rs.getString("phoneNumber");
				String role=rs.getString("role");
				String salary=rs.getString("salary");
				
				row[recorder][0]=userId;
				row[recorder][1]=name;
				row[recorder][2]=phone;
				row[recorder][3]=role;
				row[recorder][4]=salary;
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
		String [][]row = new String[counter][5];
		String []col = {"userId", "employeeName","phoneNumber","role","salary"};
		
		myTable = new JTable(row,col);
		tableScrollPane = new JScrollPane(myTable);
		tableScrollPane.setBounds(500,50,400,150);
		panel.add(tableScrollPane);
		
        String query = "SELECT * FROM employee WHERE employeeName LIKE '%"+a+"%';";     
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
                String name = rs.getString("employeeName");
				String phone=rs.getString("phoneNumber");
				String role=rs.getString("role");
				String salary=rs.getString("salary");
				
				row[recorder][0]=userId;
				row[recorder][1]=name;
				row[recorder][2]=phone;
				row[recorder][3]=role;
				row[recorder][4]=salary;
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
        String query = "select count(*) from employee;";     
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
		String [][]row = new String[counter][5];
		String []col = {"userId", "employeeName","phoneNumber","role","salary"};
		
		myTable = new JTable(row,col);
		tableScrollPane = new JScrollPane(myTable);
		tableScrollPane.setBounds(500,50,400,150);
		panel.add(tableScrollPane);
		
        String query = "select * from employee;";     
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
                String name = rs.getString("employeeName");
				String phone=rs.getString("phoneNumber");
				String role=rs.getString("role");
				String salary=rs.getString("salary");
				
				row[recorder][0]=userId;
				row[recorder][1]=name;
				row[recorder][2]=phone;
				row[recorder][3]=role;
				row[recorder][4]=salary;
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
        String query = "select count(*) from employee;";     
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
	
	public void updatedata(String empname,double empsalary,String empphone,String emprole,String empid)
	{
		
		//UPDATE Customers SET ContactName = 'Alfred Schmidt', City= 'Frankfurt' WHERE CustomerID = 1;
		//String query = "update employeeName set employeeName= '"++"' where employeeName ='"+a+"';","";    
		//String query = "UPDATE employee SET employeeName='"+empname+"', phoneNumber = '"+phnNo+"', role = '"+role+"', salary = "+salary+" WHERE userId='"+newId+"'";	
		String query="UPDATE employee set employeeName='"+empname+"',salary="+empsalary+",phoneNumber='"+empphone+"',role='"+emprole+"' where userId='"+empid+"'";
        //updatedata(empname,empsalary,empphone,emprole);		
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
			st.executeUpdate(query);//getting result
			System.out.println("results received");
			int recorder=0;
			int recorder1=0;
			
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
	
	public void  Deletedata(String empid)
	{
		//UPDATE Customers SET ContactName = 'Alfred Schmidt', City= 'Frankfurt' WHERE CustomerID = 1;
		String query = "Delete from employee where userId ='"+empid+"';";     
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
			st.executeUpdate(query);//getting result
			System.out.println("results received");
			int recorder=0;
			int recorder1=0;
			
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
	
	
	public void insertdata(String empname,double empsalary,String empphone,String emprole,String empid)
	{
						//insertdata(empname,sal,empphone,emprole,empid);
		String query = "insert into employee values ('"+empid+"','"+empname+"','"+empphone+"','"+emprole+"',"+empsalary+");";   
       // String query = "insert into userpassword values ('"+a+"','"+b+"');"; 		
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
			st.executeUpdate(query);//getting result
			System.out.println("results received");
			int recorder=0;
			int recorder1=0;
			
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
	
	
	
	
	
	
	private JLabel userLabel,passLabel,salary,phone,role;
	private JTable myTable;
	private JTextField userTF,emppass,userrole,usersalary,userphone; 
	//private JPasswordField passPF;
	private JScrollPane tableScrollPane;
	private JButton btnBack, btnExit,search,logout,insert,delete,update;
	private JPanel panel;
	private JCheckBox c1, c2, c3;
	private ButtonGroup bg1, bg2;
		String userId;

	
	public EmployeeALLInfo(String userId)
	{
		super("employee all info");
		this.userId = userId;
		this.setSize(1200,950);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		userLabel = new JLabel("employee Name: ");
		userLabel.setBounds(50, 100, 180, 30);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(150, 100, 80, 30);
		panel.add(userTF);

		
		passLabel= new JLabel("employee id ");
		passLabel.setBounds(50,150,80,30);
		panel.add(passLabel);
		
		
		emppass = new JTextField();
		emppass.setBounds(150, 150, 80, 30);
		panel.add(emppass);
		
		
		salary = new JLabel("salary: ");
		salary.setBounds(50, 200, 180, 30);
		panel.add(salary);
		
		usersalary = new JTextField();
		usersalary.setBounds(150, 200, 80, 30);
		panel.add(usersalary);
		
		phone = new JLabel("phone: ");
		phone.setBounds(50, 250, 180, 30);
		panel.add(phone);
		
		userphone = new JTextField();
		userphone.setBounds(150, 250, 80, 30);
		panel.add(userphone);
		
		role = new JLabel("role: ");
		role.setBounds(50, 300, 180, 30);
		panel.add(role);
		
		//userrole = new JTextField();
		//userrole.setBounds(150, 300, 80, 30);
		//panel.add(userrole);
		
		c1 = new JCheckBox("manager");
		c1.setBounds(150, 290, 150, 30);
		panel.add(c1);
		
		c2 = new JCheckBox("employee");
		c2.setBounds(150, 320, 150, 30);
		panel.add(c2);
		
		bg2 = new ButtonGroup();
		bg2.add(c1);
		bg2.add(c2);
			
			
			
		
		search = new JButton("search");
		search.setBounds(100, 400, 80, 30);
		search.addActionListener(this);
		panel.add(search);
		
		insert = new JButton("insert");
		insert.setBounds(200, 400, 80, 30);
		insert.addActionListener(this);
		panel.add(insert);
		
		delete = new JButton("delete");
		delete.setBounds(300, 400, 80, 30);
		delete.addActionListener(this);
		panel.add(delete);
		
		update = new JButton("update");
		update.setBounds(400, 400, 80, 30);
		update.addActionListener(this);
		panel.add(update);
		
		
		btnBack = new JButton("Back");
		btnBack.setBounds(200, 450, 80, 30);
		btnBack.addActionListener(this);
		panel.add(btnBack);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(300, 450, 80, 30);
		btnExit.addActionListener(this);
		panel.add(btnExit);
		
		
		logout = new JButton("logout");
		logout.setBounds(400, 450, 80, 30);
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
			ManagerInfo f1 = new ManagerInfo(userId);
			f1.setVisible(true);
			this.setVisible(false);
		}
		
			else if(str.equals(insert.getText()))
		{
			String empname=userTF.getText();
			String empid=emppass.getText();
			String empsalary=usersalary.getText();
			double sal = Double.valueOf(empsalary);
			String empphone=userphone.getText();
			String emprole="";
			if(c1.isSelected())
			{
				System.out.println(c1.getText());
				emprole = c1.getText();
			}

			if(c2.isSelected())
			{
				System.out.println(c2.getText());
				emprole = c2.getText();
				
			}
			
			//public void updatedata(String empname,String empsalary,String empphone,String emprole,String empid)
			insertdata(empname,sal,empphone,emprole,empid);
			test();
			
		}
		
		else if(str.equals(search.getText()))
		{
			String usern = userTF.getText();
			String userid = emppass.getText();
			System.out.println(c1.getText());
			System.out.println(c2.getText());
			if(usern.length()!=0)
			{
				System.out.println("Search: "+userTF.getText());
				search1(userTF.getText());
			}
			else if(userid.length()!=0)
			{
				System.out.println("Search: "+emppass.getText());
				searchid1(emppass.getText());
			}
		}
		
		else if (str.equals(delete.getText()))
		{
			String empid=emppass.getText();
			Deletedata(empid);
			test();
			
		}
		
		else if(str.equals(update.getText()))
		{
			//update(userTF.getText(),usersalary.getText(),userphone.getText());
			//test();
			//userTF,emppass,userrole,usersalary,userphone; 
			String empname=userTF.getText();
			String empid=emppass.getText();
			String empsalary=usersalary.getText();
			double sal = Double.valueOf(empsalary);
			String empphone=userphone.getText();
			String emprole="";
			if(c1.isSelected())
			{
				System.out.println(c1.getText());
				emprole = c1.getText();
			}

			if(c2.isSelected())
			{
				System.out.println(c2.getText());
				emprole = c2.getText();
				
			}
			
			//public void updatedata(String empname,String empsalary,String empphone,String emprole,String empid)
			updatedata(empname,sal,empphone,emprole,empid);
			test();
			
			
		}
		
		else if(str.equals(btnExit.getText()))
		{
			System.exit(0);
		}
		else{}
	}
}