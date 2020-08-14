import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CustomerProductDetails extends JFrame implements  ActionListener
{
	
	public void searchid1(String a)
	{
		//SELECT * FROM userpassword WHERE UserId LIKE '%a%';
		int counter=searchrowno();
		String [][]row = new String[counter][4];
		String []col = {"ProductName", "ProductID","Quantity","Price"};
		
		myTable = new JTable(row,col);
		tableScrollPane = new JScrollPane(myTable);
		tableScrollPane.setBounds(500,100,400,150);
		panel.add(tableScrollPane);
		
        String query = "SELECT * FROM allProduct WHERE ProductID LIKE '%"+a+"%';";     
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
                String ProductName = rs.getString("ProductName");
                String ProductID = rs.getString("ProductID");
				String Quantity=rs.getString("Quantity");
				String Price=rs.getString("Price");
				
				row[recorder][0]=ProductName;
				row[recorder][1]=ProductID;
				row[recorder][2]=Quantity;
				row[recorder][3]=Price;
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
		String []col = {"ProductName", "ProductID","Quantity","Price"};
		
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
                String ProductName = rs.getString("ProductName");
                String ProductID = rs.getString("ProductID");
				String Quantity=rs.getString("Quantity");
				String Price=rs.getString("Price");
				
				row[recorder][0]=ProductName;
				row[recorder][1]=ProductID;
				row[recorder][2]=Quantity;
				row[recorder][3]=Price;
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
        String query = "select count(*) from allProduct;";     
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
		String []col = {"ProductName", "ProductID","Quantity","Price"};
		
		myTable = new JTable(row,col);
		tableScrollPane = new JScrollPane(myTable);
		tableScrollPane.setBounds(500,100,400,150);
		panel.add(tableScrollPane);
		
        String query = "select * from allProduct;";     
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
               
				 String ProductName = rs.getString("ProductName");
                String ProductID = rs.getString("ProductID");
				String Quantity=rs.getString("Quantity");
				String Price=rs.getString("Price");
				
				row[recorder][0]=ProductName;
				row[recorder][1]=ProductID;
				row[recorder][2]=Quantity;
				row[recorder][3]=Price;
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
        String query = "select count(*) from allProduct;";     
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
	
	
	

	
	
	
	
	
	private JLabel userLabel,passLabel,quantity,price;
	private JTable myTable;
	private JTextField userTF,userpass,userquantity,userprice; 
	private JPasswordField passPF;
	private JButton btnBack, btnExit,update,delete,search,purchase,logout;
	private JScrollPane tableScrollPane;
	private JPanel panel;
	String userId;

	
	public CustomerProductDetails(String userId)
	{
		super("customer product detail");
		this.userId = userId;
		this.setSize(1400,950);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		userLabel = new JLabel("product-Name: ");
		userLabel.setBounds(50, 100, 180, 30);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(200, 100, 80, 30);
		panel.add(userTF);
		
		
		passLabel= new JLabel("product-ID");
		passLabel.setBounds(50,150,80,30);
		panel.add(passLabel);
		
		userpass = new JTextField();
		userpass.setBounds(200, 150, 80, 30);
		panel.add(userpass);
		
		quantity = new JLabel("quantity: ");
		quantity.setBounds(50, 200, 180, 30);
		panel.add(quantity);
		
		userquantity = new JTextField();
		userquantity.setBounds(200, 200, 80, 30);
		panel.add(userquantity);
		
		price= new JLabel("price: ");
		price.setBounds(50, 250, 180, 30);
		panel.add(price);
		
		userprice = new JTextField();
		userprice.setBounds(100, 250, 80, 30);
		panel.add(userprice);
		
		
		search = new JButton("search");
		search.setBounds(100, 400, 80, 30);
		search.setBackground(Color.RED);
		search.addActionListener(this);
		panel.add(search);
		
		purchase = new JButton("purchase");
		purchase.setBounds(200, 400, 100, 30);
		purchase.setBackground(Color.RED);
		purchase.addActionListener(this);
		panel.add(purchase);
		
		
		btnBack = new JButton("Back");
		btnBack.setBounds(350, 400, 80, 30);
		btnBack.setBackground(Color.GREEN);
		btnBack.addActionListener(this);
		panel.add(btnBack);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(150, 500, 80, 30);
		btnExit.setBackground(Color.RED);
		btnExit.addActionListener(this);
		panel.add(btnExit);
			
		logout = new JButton("logout");
		logout.setBounds(250, 500, 80, 30);
		logout.setBackground(Color.RED);
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
			CustomerPage f1 = new CustomerPage(userId);
			f1.setVisible(true);
			this.setVisible(false);
		}
		else if(str.equals(purchase.getText()))
		{
			System.out.println("par");
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