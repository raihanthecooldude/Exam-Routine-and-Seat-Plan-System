import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExamDuty extends JFrame implements MouseListener, ActionListener
{
	private JLabel label1, label2, label3, label4, label5;
	private JLabel label11, label22, label33, label44, label55;
	private JButton button1, back, logout;
	private JPanel panel1;
	private String name;
	
	public ExamDuty(){}
	public ExamDuty (String name)
	{
		super("Exam Duty");
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
		
		label11 = new JLabel("Course 1");
		label11.setBounds (60, 150, 150, 50);
		label11.setFont (new Font("Calibri", 0, 26));
		panel1.add(label11);
		
		label5 = new JLabel("Section");
		label5.setBounds (360, 90, 100, 50);
		label5.setFont (new Font("Calibri", 1, 26));
		panel1.add(label5);
		
		label55 = new JLabel("Section 1");
		label55.setBounds (360, 150, 100, 50);
		label55.setFont (new Font("Calibri", 0, 26));
		panel1.add(label55);
						
		label2 = new JLabel("Day");
		label2.setBounds (60, 270, 100, 50);
		label2.setFont (new Font("Calibri", 1, 26));
		panel1.add(label2);

		label22 = new JLabel("Day 1");
		label22.setBounds (60, 330, 100, 50);
		label22.setFont (new Font("Calibri", 0, 26));
		panel1.add(label22);
		
		label3 = new JLabel("Slot");
		label3.setBounds (230, 270, 100, 50);
		label3.setFont (new Font("Calibri", 1, 26));
		panel1.add(label3);
		
		label33 = new JLabel("Slot 1");
		label33.setBounds (230, 330, 100, 50);
		label33.setFont (new Font("Calibri", 0, 26));
		panel1.add(label33);
				
		label4 = new JLabel("Room");
		label4.setBounds (380, 270, 100, 50);
		label4.setFont (new Font("Calibri", 1, 26));
		panel1.add(label4);
		
		label44 = new JLabel("Room 1");
		label44.setBounds (380, 330, 100, 50);
		label44.setFont (new Font("Calibri", 0, 26));
		panel1.add(label44);
		
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