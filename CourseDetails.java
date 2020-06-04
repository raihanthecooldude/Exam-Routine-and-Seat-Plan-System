import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CourseDetails extends JFrame implements MouseListener, ActionListener
{
	private JLabel label1, label2, label3;
	private JLabel label11, label22, label33;
	private JLabel label111, label222, label333;
	private JLabel label1111, label2222, label3333;
	private JLabel label11111, label22222, label33333;
	private JLabel label111111, label222222, label333333;
	private JButton button1, back, logout;
	private ImageIcon image;
	private JPanel panel1;
	private JComboBox combobox1;
	private String s1[] = {"Progamming Language 1","Progamming Language 2","Discrete Math","Data Structure","Introduction To DataBase", "Algorithm"};
	private String s2[] = {"A","B","C","D","E"};
	private String s3[] = {"Slot 1","Slot 2","Slot 3"};
	private String s4[] = {"1101","1102","1210","2204","6120"};
	private String s5[] = {"Mir Riyanul Islam","Mohaimen Bin Noor","Victor Stany Rozario","Hasibul Hasan","Rezwan Ahmed"};
	private String s6[] = {"Day 1", "Day 2", "Day 3", "Day 4", "Day 5", "Day 6"};
	private String s7[] = {"Annex 1", "Annex 2", "Annex 3", "Annex 4", "Annex 5", "Annex 6"};
	private String name;
	
	public CourseDetails(){}
	public CourseDetails (String name)
	{
		super("Course Details");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		this.name=name;
		
		label11 = new JLabel("Section");
		label11.setBounds (60, 90, 100, 50);
		label11.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label11);
		combobox1 = new JComboBox(s2);
		combobox1.setBounds (60, 140, 80, 40);
		combobox1.setBackground(Color.WHITE);
		panel1.add(combobox1);
		
		label3 = new JLabel("Student Details");
		label3.setBounds (200, 90, 200, 50);
		label3.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label3);
		
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
	public void mouseClicked(MouseEvent m){}
	public void mousePressed(MouseEvent m){}
	public void mouseReleased(MouseEvent m){}
	public void mouseEntered(MouseEvent m){}
	public void mouseExited(MouseEvent m){}
	
	public void actionPerformed(ActionEvent a)
	{
		String btn = a.getActionCommand();
		
		if(btn.equals("Back"))
		{
			FacultyMain mn = new FacultyMain(name);
			mn.setVisible(true);
			this.setVisible(false);
		}
		else if(btn.equals("Log Out"))
		{
			TempGUI TG = new TempGUI();
			TG.setVisible(true);
			this.setVisible(false);
		}
		else if(btn.equals("Done"))
		{
			
		}
		else{}
	}
}