import javax.swing.*;
import java.awt.event.*;
public class TableDemo extends JFrame implements MouseListener
{
	private JTable myTable;
	private JScrollPane tableScrollPane;
	private JPasswordField pf;
	private JButton btn;
	private JPanel panel;
	
	public TableDemo()
	{
		super("");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		String [][]row = {{"ABCD", "DEFG", "IJKL"},
					     {"XYZ", "UVW", "MNO"},
						 {"ABCD", "DEFG", "IJKL"},
					     {"XYZ", "UVW", "MNO"},
						 {"ABCD", "DEFG", "IJKL"},
					     {"XYZ", "UVW", "MNO"},
						 {"ABCD", "DEFG", "IJKL"},
					     {"XYZ", "UVW", "MNO"}};
		String []col = {"Col1", "Col2", "Col3"};
		
		myTable = new JTable(row,col);
		tableScrollPane = new JScrollPane(myTable);
		tableScrollPane.setBounds(50,50,300,100);
		panel.add(tableScrollPane);
		
		pf = new JPasswordField();
		pf.setBounds(700,300,80,30);
		pf.setEchoChar('*');
		panel.add(pf);
		
		btn = new JButton("Show Password");
		btn.setBounds(500, 300, 150,30);
		btn.addMouseListener(this);
		panel.add(btn);
		
		this.add(panel);
	}
	public void mouseEntered(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public void mouseReleased(MouseEvent me)
	{
		if(me.getSource().equals(btn))
		{
			pf.setEchoChar('*');
		}
	}
	public void mousePressed(MouseEvent me)
	{
		if(me.getSource().equals(btn))
		{
			pf.setEchoChar((char)0);
		}
	}
	
	public static void main(String args[])
	{
		TableDemo td = new TableDemo();
		td.setVisible(true);
	}
}