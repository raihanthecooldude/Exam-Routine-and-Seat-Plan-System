import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AdminAddCourse extends JFrame implements ActionListener
{
	private JLabel label1, label2, label3, type, proname;
	private JRadioButton rbutton1, rbutton2, rbutton3;
	private JPanel panel1;
	private ButtonGroup bg1;
	private JButton button1, back, logout;
	private ImageIcon image1, image2;
	private String name;
	private JTextField course, section;
	
	public AdminAddCourse(){}
	public AdminAddCourse (String name)
	{
		super("Admin Adding Course and Section");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		this.name=name;
		
		label1 = new JLabel("Insert Course Name You want to Add:");
		label1.setBounds (80, 120, 400, 50);
		label1.setFont (new Font("Calibri", 0, 24));
		panel1.add(label1);
		
		course = new JTextField("");
		course.setBounds (80, 170, 350, 35);
		//course.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		//course.setForeground(Color.WHITE);
		//course.setFont (new Font("Calibri Light", 1, 20));
		course.addActionListener(this);
		panel1.add(course);
		
		label2 = new JLabel("Insert Section Name You want to Add:");
		label2.setBounds (80, 250, 400, 50);
		label2.setFont (new Font("Calibri", 0, 24));
		panel1.add(label2);
		
		section = new JTextField("");
		section.setBounds (80, 300, 350, 35);
		//section.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		//section.setForeground(Color.WHITE);
		//section.setFont (new Font("Calibri Light", 1, 20));
		section.addActionListener(this);
		panel1.add(section);
		
		
		button1 = new JButton("Done");
		button1.setBounds (246, 500, 100, 35);
		button1.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		button1.setForeground(Color.WHITE);
		button1.setFont (new Font("Calibri Light", 1, 20));
		button1.addActionListener(this);
		panel1.add (button1);
		
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
		
		if(btn.equals("Done"))
		{
			add();
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
	public void add ()
	{
		String query = "INSERT INTO course_section VALUES ('"+course.getText()+"','"+section.getText()+"','');";
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
}