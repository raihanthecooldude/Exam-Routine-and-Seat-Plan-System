import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FacultyMain extends JFrame implements ActionListener
{
	private JLabel label1, label2, type, proname;
	private JRadioButton rbutton1, rbutton2, rbutton3;
	private JPanel panel1;
	private ButtonGroup bg1;
	private JButton button1, back, logout;
	private ImageIcon image1, image2;
	private String name;
	
	public FacultyMain(){}
	public FacultyMain(String name)
	{
		super("Faculty Main");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		this.name=name;
		
		type = new JLabel("Faculty Profile");
		type.setBounds (70, 50, 300, 50);
		type.setFont (new Font("Calibri Light", 0, 24));
		type.setForeground(new java.awt.Color(124, 121, 121));
		type.setBackground(Color.WHITE);
		panel1.add(type);
		
		proname = new JLabel(name);
		proname.setBounds (70, 100, 300, 50);
		proname.setFont (new Font("Calibri Light", 0, 28));
		proname.setBackground(Color.WHITE);
		panel1.add(proname);
		
		rbutton1 = new JRadioButton("Exam Duty");
		rbutton1.setBounds(150, 300, 400, 50);
		rbutton1.setBackground(Color.WHITE);
		panel1.add(rbutton1);
		
		rbutton2 = new JRadioButton("Quiz Scheduling");
		rbutton2.setBounds(150, 350, 400, 50);
		rbutton2.setBackground(Color.WHITE);
		panel1.add(rbutton2);
		
		rbutton3 = new JRadioButton("Course Details");
		rbutton3.setBounds(150, 400, 400, 50);
		rbutton3.setBackground(Color.WHITE);
		panel1.add(rbutton3);
		
		bg1 = new ButtonGroup();
		bg1.add(rbutton1);
		bg1.add(rbutton2);
		bg1.add(rbutton3);
		
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
		
		label1 = new JLabel("Choose Your Option");
		label1.setBounds (100, 250, 300, 50);
		label1.setFont (new Font("Calibri Light", 0, 32));
		label1.setBackground(Color.WHITE);
		panel1.add(label1);
		
		
		
		this.add(panel1);
	}
	
	
	public void actionPerformed(ActionEvent a)
	{
		String btn = a.getActionCommand();
		
		if(btn.equals("Done"))
		{
			if(rbutton1.isSelected())
			{
				ExamDuty ER = new ExamDuty(name);
				ER.setVisible (true);
				this.setVisible(false);
			}
			else if(rbutton2.isSelected())
			{
				QuizScheduling QS = new QuizScheduling(name);
				QS.setVisible (true);
				this.setVisible(false);
			}
			else if(rbutton3.isSelected())
			{
				CourseDetails cd = new CourseDetails(name);
				cd.setVisible(true);
				this.setVisible(false);
			}
		}
		else if(btn.equals("Back"))
		{
			TempGUI TG = new TempGUI();
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