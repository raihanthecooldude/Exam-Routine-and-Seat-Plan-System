import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class FacultyGUI extends JFrame implements ActionListener
{
	private JLabel label1, label2, label3, label4, label5, label6, label7;
	private JComboBox combobox1, combobox2, combobox3, combobox4, combobox5, combobox6, combobox7;
	private JPasswordField passwordfield1;
	private JButton button1, back, logout, button2;
	private ImageIcon image;
	private JPanel panel1;
	private String s1[] = {"Progamming Language 1","Progamming Language 2","Discrete Math","Data Structure","Introduction To DataBase", "Algorithm"};
	private String s2[] = {"A","B","C","D","E"};
	private String s3[] = {"Slot 1","Slot 2","Slot 3"};
	private String s4[] = {"1101","1102","1210","2204","6120"};
	private String s5[] = {"Mir Riyanul Islam","Mohaimen Bin Noor","Victor Stany Rozario","Hasibul Hasan","Rezwan Ahmed"};
	private String s6[] = {"Day 1", "Day 2", "Day 3", "Day 4", "Day 5", "Day 6"};
	private String s7[] = {"Annex 1", "Annex 2", "Annex 3", "Annex 4", "Annex 5", "Annex 6"};
	private String name;
	private JTextField user, type, delete, pass, id;
	
	public FacultyGUI(){}
	public FacultyGUI (String name)
	{
		super("Admin Adding or Deleting Users");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		this.name=name;
		
		label1 = new JLabel("Add User's Name:");
		label1.setBounds (50, 100, 200, 50);
		label1.setFont (new Font("Calibri", 0, 24));
		panel1.add(label1);
		
		user = new JTextField("");
		user.setBounds (250, 100, 300, 35);
		//user.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		//user.setForeground(Color.WHITE);
		//user.setFont (new Font("Calibri Light", 1, 20));
		user.addActionListener(this);
		panel1.add(user);
		
		label2 = new JLabel("Add User's ID:");
		label2.setBounds (50, 150, 300, 50);
		label2.setFont (new Font("Calibri", 0, 24));
		panel1.add(label2);
		
		id = new JTextField("");
		id.setBounds (250, 150, 300, 35);
		//id.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		//id.setForeground(Color.WHITE);
		//id.setFont (new Font("Calibri Light", 1, 20));
		id.addActionListener(this);
		panel1.add(id);
		
		label3 = new JLabel("Add User's Type:");
		label3.setBounds (50, 200, 300, 50);
		label3.setFont (new Font("Calibri", 0, 24));
		panel1.add(label3);
		
		type = new JTextField("");
		type.setBounds (250, 200, 300, 35);
		//type.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		//type.setForeground(Color.WHITE);
		//type.setFont (new Font("Calibri Light", 1, 20));
		type.addActionListener(this);
		panel1.add(type);
		
		label4 = new JLabel("Add User's Pass:");
		label4.setBounds (50, 250, 300, 50);
		label4.setFont (new Font("Calibri", 0, 24));
		panel1.add(label4);
		
		pass = new JTextField("");
		pass.setBounds (250, 250, 300, 35);
		//pass.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		//pass.setForeground(Color.WHITE);
		//pass.setFont (new Font("Calibri Light", 1, 20));
		pass.addActionListener(this);
		panel1.add(pass);
		
		button1 = new JButton("ADD");
		button1.setBounds (246, 360, 100, 35);
		button1.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		button1.setForeground(Color.WHITE);
		button1.setFont (new Font("Calibri", 1, 20));
		button1.addActionListener(this);
		panel1.add (button1);
		
		label3 = new JLabel("Delete User's ID:");
		label3.setBounds (50, 490, 300, 50);
		label3.setFont (new Font("Calibri", 0, 24));
		panel1.add(label3);
		
		delete = new JTextField("");
		delete.setBounds (250, 490, 300, 35);
		//delete.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		//delete.setForeground(Color.WHITE);
		//delete.setFont (new Font("Calibri Light", 1, 20));
		delete.addActionListener(this);
		panel1.add(delete);
		
		button2 = new JButton("DELETE");
		button2.setBounds (246, 570, 100, 35);
		button2.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		button2.setForeground(Color.WHITE);
		button2.setFont (new Font("Calibri", 1, 20));
		button2.addActionListener(this);
		panel1.add (button2);
		
		back = new JButton("Back");
		back.setBounds (20, 8, 100, 35);
		back.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		back.setForeground(Color.WHITE);
		back.setFont (new Font("Calibri", 1, 20));
		back.addActionListener(this);
		panel1.add (back);
		
		logout = new JButton("Log Out");
		logout.setBounds (460, 8, 100, 35);
		logout.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		logout.setForeground(Color.WHITE);
		logout.setFont (new Font("Calibri", 1, 20));
		logout.addActionListener(this);
		panel1.add (logout);
		
		
		this.add(panel1);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		String btn = a.getActionCommand();
		
		if(btn.equals("ADD"))
		{
			addToDB();
		}
		else if(btn.equals("DELETE"))
		{
			deleteFromDB();
		}
		else if(btn.equals("Back"))
		{
			Admin TG = new Admin(name);
			TG.setVisible(true);
			this.setVisible(false);
		}
		else if(btn.equals("Log Out"))
		{
			TempGUI TG = new TempGUI();
			TG.setVisible(true);
			this.setVisible(false);
		}
		else{}
	}
	public void addToDB()
	{
		String query = "INSERT INTO users VALUES ('"+id.getText()+"','"+pass.getText()+"',"+type.getText()+",'"+user.getText()+"');";
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aiub", "root", "");
			Statement stm = con.createStatement();
			stm.execute(query);
			stm.close();
			con.close();					
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
	}
	public void deleteFromDB ()
	{
		String query = "DELETE from users where UserId='"+id.getText()+"';";
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aiub", "root", "");
			Statement stm = con.createStatement();
			stm.execute(query);
			stm.close();
			con.close();	
			System.out.println(query);			
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
	}
}