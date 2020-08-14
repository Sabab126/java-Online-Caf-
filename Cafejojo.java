import java.lang.*;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Cafejojo extends JFrame implements  ActionListener
{
	private JLabel  imgLabel,	imagelabel, title;
	private JButton btyes, btno;
	
	private ImageIcon img;
	private JPanel panel;
	private Font f1;

	
	
	
	public Cafejojo()
	{
		super("welcome to our cafe JOJO'S ");
		
		this.setSize(625,416);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		
	
		
		title = new JLabel("welcome to our  cafe JOJO'S");
		//title.setBackground(Color.orange);
		title.setForeground(Color.white);
		title.setFont(new Font("Serif", Font.PLAIN, 40));
		title.setBounds(80,100,800,400);
		panel.add(title);
	
		/*btyes = new JButton("customer");
		btyes.setBounds(120,200,100,30);
		btyes.setBackground(Color.GREEN);
		//btyes.addMouseListener(this);
		btyes.addActionListener(this);
		panel.add(btyes);*/
		
		btno = new JButton("please login ");
		btno.setBounds(170,200,200,30);
		btno.setBackground(Color.RED);
		//btno.addMouseListener(this);
		btno.addActionListener(this);
		panel.add(btno);
		
		
		
		
		img=new ImageIcon("fastfood.jpg");
		imagelabel=new JLabel(img);
		imagelabel.setBounds(0,0,625,416);
		panel.add(imagelabel);
		
		this.add(panel);
		
	}
	
	
	
	
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		
		/*if(str.equals(btyes.getText()))
		{
			
			Customer ng = new Customer();
			ng.setVisible(true);
			this.setVisible(false);
			
			
		}*/
		 if(str.equals(btno.getText()))
		{
			
			Employee fg= new Employee();
			fg.setVisible(true);
			this.setVisible(false);
		}
	}
	
	
	
	
}