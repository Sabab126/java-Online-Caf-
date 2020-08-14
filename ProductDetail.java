import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ProductDetail extends JFrame implements  ActionListener
{
	public void searchid1(String a)
	{
		//SELECT * FROM userpassword WHERE UserId LIKE '%a%';
		int counter=searchrowno();
		String [][]row = new String[counter][4];
		String []col = {"FoodName", "FoodID","Quantity","Price"};
		
		myTable = new JTable(row,col);
		tableScrollPane = new JScrollPane(myTable);
		tableScrollPane.setBounds(500,100,400,150);
		panel.add(tableScrollPane);
		
        String query = "SELECT * FROM foodinfo WHERE FoodID LIKE '%"+a+"%';";     
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
                String FoodName = rs.getString("FoodName");
                String FoodID = rs.getString("FoodID");
				String Quantity=rs.getString("Quantity");
				String Price=rs.getString("Price");
				
				row[recorder][0]=FoodName;
				row[recorder][1]=FoodID;
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
        String query = "select count(*) from foodinfo;";     
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
		String []col = {"FoodName", "FoodID","Quantity","Price"};
		
		myTable = new JTable(row,col);
		tableScrollPane = new JScrollPane(myTable);
		tableScrollPane.setBounds(500,100,400,150);
		panel.add(tableScrollPane);
		
        String query = "select * from foodinfo;";     
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
               
				 String FoodName = rs.getString("FoodName");
                String FoodID = rs.getString("FoodID");
				String Quantity=rs.getString("Quantity");
				String Price=rs.getString("Price");
				
				row[recorder][0]=FoodName;
				row[recorder][1]=FoodID;
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
        String query = "select count(*) from foodinfo;";     
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
	
	
		public void insertdata(String FoodName,String FoodID,int Quantity,int Price)
	{
						//insertdata(empname,sal,empphone,emprole,empid);
		String query = "insert into foodinfo values ('"+FoodName+"','"+FoodID+"',"+Quantity+","+Price+");";   
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
	
	
	public void updatedata(String FoodName,String FoodID,int Quantity,int Price)
	{
		
		//UPDATE Customers SET ContactName = 'Alfred Schmidt', City= 'Frankfurt' WHERE CustomerID = 1;
		//String query = "update employeeName set employeeName= '"++"' where employeeName ='"+a+"';","";    
		//String query = "UPDATE employee SET employeeName='"+empname+"', phoneNumber = '"+phnNo+"', role = '"+role+"', salary = "+salary+" WHERE userId='"+newId+"'";	
		String query="UPDATE foodinfo set FoodName='"+FoodName+"',Quantity="+Quantity+",Price="+Price+" where FoodID='"+FoodID+"'";
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
	
		public void  Deletedata(String FoodID)
	{
		//UPDATE Customers SET ContactName = 'Alfred Schmidt', City= 'Frankfurt' WHERE CustomerID = 1;
		String query = "Delete from foodinfo where FoodID ='"+FoodID+"';";     
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
	
	
	
	
	
	private JLabel userLabel,passLabel,quantity,price;
	private JTable myTable;
	private JScrollPane tableScrollPane;
	private JTextField userTF,userid,userquantity,userprice; 
	//private JPasswordField passPF;
	private JButton btnBack, btnExit,update,delete,create;
	private JPanel panel;
		String userId;

	
	public ProductDetail(String userId)
	{
		super("product detail ");
		this.userId = userId;
		this.setSize(1200,950);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		userLabel = new JLabel("food Name: ");
		userLabel.setBounds(0, 100, 180, 30);
		panel.add(userLabel);
		
		userTF = new JTextField();
		userTF.setBounds(100, 100, 80, 30);
		panel.add(userTF);
		
		
		passLabel= new JLabel("ID");
		passLabel.setBounds(0,150,80,30);
		panel.add(passLabel);
		
		
			userid = new JTextField();
		userid.setBounds(100, 150, 80, 30);
		panel.add(userid);
		
		quantity = new JLabel("quantity: ");
		quantity.setBounds(0, 200, 180, 30);
		panel.add(quantity);
		
		userquantity = new JTextField();
		userquantity.setBounds(100, 200, 80, 30);
		panel.add(userquantity);
		
		price= new JLabel("price: ");
		price.setBounds(0, 250, 180, 30);
		panel.add(price);
		
		userprice = new JTextField();
		userprice.setBounds(100, 250, 80, 30);
		panel.add(userprice);
		
		
		update = new JButton("update");
		update.setBounds(550, 50, 120, 30);
		update.setBackground(Color.RED);
		update.addActionListener(this);
		panel.add(update);
		
		
		delete = new JButton("delete Info");
		delete.setBounds(400, 50, 120, 30);
		delete.setBackground(Color.RED);
		delete.addActionListener(this);
		panel.add(delete);
		
		
		create = new JButton("create Info");
		create.setBounds(250,50, 120, 30);
		create.setBackground(Color.RED);
		create.addActionListener(this);
		panel.add(create);
		
		
		btnBack = new JButton("Back");
		btnBack.setBounds(350, 150, 80, 30);
		btnBack.setBackground(Color.GREEN);
		btnBack.addActionListener(this);
		panel.add(btnBack);
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(250, 150, 80, 30);
		btnExit.setBackground(Color.RED);
		btnExit.addActionListener(this);
		panel.add(btnExit);
		
		test();
					
		
		this.add(panel);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		if(str.equals(btnBack.getText()))
		{
			EmployeeInfo f21 = new EmployeeInfo(userId);
			f21.setVisible(true);
			this.setVisible(false);
		}
		
		else if(str.equals(create.getText()))
		{
			String FoodName=userTF.getText(); //userTF,userid,userquantity,userprice; 
			String FoodID=userid.getText();
			String quantity = userquantity.getText();
			int Quantity=Integer.valueOf(quantity);
			String price=userprice.getText();
			int Price=Integer.valueOf(price);
		
			insertdata(FoodName,FoodID,Quantity,Price);
			test();
			
		}
		
		else if(str.equals(update.getText()))
		{
			
            String FoodName=userTF.getText(); //userTF,userid,userquantity,userprice; 
			String FoodID=userid.getText();
			String quantity = userquantity.getText();
			int Quantity=Integer.valueOf(quantity);
			String price=userprice.getText();
			int Price=Integer.valueOf(price);
			
			updatedata(FoodName,FoodID,Quantity,Price);
			test();
			
		}
		else if (str.equals(delete.getText()))
		{
			String FoodID=userid.getText();
			Deletedata(FoodID);
			test();
			
		}
		else if(str.equals(btnExit.getText()))
		{
			System.exit(0);
		}
		else{}
	}
}