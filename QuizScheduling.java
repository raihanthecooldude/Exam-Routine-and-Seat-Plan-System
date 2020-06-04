import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizScheduling extends JFrame implements MouseListener, ActionListener
{
	private JLabel label1, label2, label5;
	private JComboBox combobox1, combobox2, combobox3;
	private JButton button1, button2, back, logout;
	private JPanel panel1;
	private String s1[] = {"Progamming Language 1","Progamming Language 2","Discrete Mathmatics","Data Structure","Introduction To DataBase", "Algorithm"};
	private String s2[] = {"A","B","C","D","E"};
	private String s3[] = {"12.3.17", "14.3.17", "16.3.17"};
	private String name;
	
	public QuizScheduling(){}
	public QuizScheduling (String name)
	{
		super("Quiz Scheduling");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		this.name=name;
		
		label1 = new JLabel("Course");
		label1.setBounds (60, 90, 150, 50);
		label1.setFont (new Font("Calibri", 1, 26));
		panel1.add(label1);
		
		combobox1 = new JComboBox(s1);
		combobox1.setBounds (60, 150, 200, 50);
		combobox1.setBackground(Color.WHITE);
		panel1.add(combobox1);
		
		label5 = new JLabel("Section");
		label5.setBounds (360, 90, 100, 50);
		label5.setFont (new Font("Calibri", 1, 26));
		panel1.add(label5);
		
		combobox2 = new JComboBox(s2);
		combobox2.setBounds (360, 150, 100, 50);
		combobox2.setBackground(Color.WHITE);
		panel1.add(combobox2);
						
		label2 = new JLabel("Date");
		label2.setBounds (70, 270, 100, 50);
		label2.setFont (new Font("Calibri", 1, 26));
		panel1.add(label2);

		combobox3 = new JComboBox(s3);
		combobox3.setBounds (70, 330, 100, 50);
		combobox3.setBackground(Color.WHITE);
		panel1.add(combobox3);
		
		button1 = new JButton("Submit");
		button1.setBounds (246, 500, 100, 35);
		button1.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		button1.setForeground(Color.WHITE);
		button1.setFont (new Font("Calibri Light", 1, 20));
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
		
		if(btn.equals("Submit"))
		{
		}
		else if(btn.equals("Back"))
		{
			FacultyMain TG = new FacultyMain(name);
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
}