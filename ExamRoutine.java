import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExamRoutine extends JFrame implements MouseListener, ActionListener
{
	private JLabel label1, label2, label3, label4;
	private JLabel label11, label22, label33, label44;
	private JLabel label111, label222, label333, label444;
	private JLabel label1111, label2222, label3333, label4444;
	private JLabel label11111, label22222, label33333, label44444;
	private JLabel label111111, label222222, label333333, label444444;
	private JButton button1, back, logout;
	private ImageIcon image;
	private JPanel panel1;
	private String name;
	
	public ExamRoutine(){}
	public ExamRoutine (String name)
	{
		super("Exam Routine");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		this.name=name;
		
		label1 = new JLabel("Course");
		label1.setBounds (50, 70, 200, 50);
		label1.setFont (new Font("Calibri", 1, 26));
		panel1.add(label1);
		
		label11 = new JLabel("Sub 1");
		label11.setBounds (50, 130, 200, 50);
		label11.setFont (new Font("Calibri", 0, 26));
		panel1.add(label11);
		
		label111 = new JLabel("Sub 2");
		label111.setBounds (50, 190, 200, 50);
		label111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label111);
		
		label1111 = new JLabel("Sub 3");
		label1111.setBounds (50, 250, 200, 50);
		label1111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label1111);
		
		label11111 = new JLabel("Sub 4");
		label11111.setBounds (50, 310, 200, 50);
		label11111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label11111);
		
		label111111 = new JLabel("Sub 5");
		label111111.setBounds (50, 370, 200, 50);
		label111111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label111111);
		
		label2 = new JLabel("Day");
		label2.setBounds (250, 70, 60, 50);
		label2.setFont (new Font("Calibri", 1, 26));
		panel1.add(label2);

		label22 = new JLabel("Day 1");
		label22.setBounds (250, 130, 60, 50);
		label22.setFont (new Font("Calibri", 0, 26));
		panel1.add(label22);

		label222 = new JLabel("Day 2");
		label222.setBounds (250, 190, 60, 50);
		label222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label222);
		
		label2222 = new JLabel("Day 3");
		label2222.setBounds (250, 250, 60, 50);
		label2222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label2222);
		
		label22222 = new JLabel("Day 4");
		label22222.setBounds (250, 310, 60, 50);
		label22222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label22222);
		
		label222222 = new JLabel("Day 5");
		label222222.setBounds (250, 370, 60, 50);
		label222222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label222222);
		
		label3 = new JLabel("Slot");
		label3.setBounds (350, 70, 60, 50);
		label3.setFont (new Font("Calibri", 1, 26));
		panel1.add(label3);
		
		label33 = new JLabel("Slot 1");
		label33.setBounds (350, 130, 60, 50);
		label33.setFont (new Font("Calibri", 0, 26));
		panel1.add(label33);
		
		label333 = new JLabel("Slot 2");
		label333.setBounds (350, 190, 60, 50);
		label333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label333);
		
		label3333 = new JLabel("Slot 3");
		label3333.setBounds (350, 250, 60, 50);
		label3333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label3333);
		
		label33333 = new JLabel("Slot 4");
		label33333.setBounds (350, 310, 60, 50);
		label33333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label33333);
		
		label333333 = new JLabel("Slot 5");
		label333333.setBounds (350, 370, 60, 50);
		label333333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label333333);
				
		label4 = new JLabel("Room");
		label4.setBounds (450, 70, 150, 50);
		label4.setFont (new Font("Calibri", 1, 26));
		panel1.add(label4);
		
		label44 = new JLabel("Room 1");
		label44.setBounds (450, 130, 100, 50);
		label44.setFont (new Font("Calibri", 0, 26));
		panel1.add(label44);
		
		label444 = new JLabel("Room 2");
		label444.setBounds (450, 190, 100, 50);
		label444.setFont (new Font("Calibri", 0, 26));
		panel1.add(label444);
		
		label4444 = new JLabel("Room 3");
		label4444.setBounds (450, 250, 100, 50);
		label4444.setFont (new Font("Calibri", 0, 26));
		panel1.add(label4444);
		
		label44444 = new JLabel("Room 4");
		label44444.setBounds (450, 310, 100, 50);
		label44444.setFont (new Font("Calibri", 0, 26));
		panel1.add(label44444);
		
		label444444 = new JLabel("Room 5");
		label444444.setBounds (450, 370, 100, 50);
		label444444.setFont (new Font("Calibri", 0, 26));
		panel1.add(label444444);
		
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
			StudentMain mn = new StudentMain(name);
			mn.setVisible(true);
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