import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizSchedule extends JFrame implements MouseListener, ActionListener
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
	private String name;
	
	public QuizSchedule(){}
	public QuizSchedule (String name)
	{
		super("Quiz Schedule");
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
		label11.setBounds (50, 130, 150, 50);
		label11.setFont (new Font("Calibri", 0, 26));
		panel1.add(label11);
		
		label111 = new JLabel("Sub 2");
		label111.setBounds (50, 190, 150, 50);
		label111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label111);
		
		label1111 = new JLabel("Sub 3");
		label1111.setBounds (50, 250, 150, 50);
		label1111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label1111);
		
		label11111 = new JLabel("Sub 4");
		label11111.setBounds (50, 310, 150, 50);
		label11111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label11111);
		
		label111111 = new JLabel("Sub 5");
		label111111.setBounds (50, 370, 150, 50);
		label111111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label111111);
		
		label2 = new JLabel("Section");
		label2.setBounds (280, 70, 100, 50);
		label2.setFont (new Font("Calibri", 1, 26));
		panel1.add(label2);

		label22 = new JLabel("Sec 1");
		label22.setBounds (280, 130, 100, 50);
		label22.setFont (new Font("Calibri", 0, 26));
		panel1.add(label22);

		label222 = new JLabel("Sec 2");
		label222.setBounds (280, 190, 100, 50);
		label222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label222);
		
		label2222 = new JLabel("Sec 3");
		label2222.setBounds (280, 250, 100, 50);
		label2222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label2222);
		
		label22222 = new JLabel("Sec 4");
		label22222.setBounds (280, 310, 100, 50);
		label22222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label22222);
		
		label222222 = new JLabel("Sec 5");
		label222222.setBounds (280, 370, 100, 50);
		label222222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label222222);
		
		label3 = new JLabel("Date");
		label3.setBounds (450, 70, 100, 50);
		label3.setFont (new Font("Calibri", 1, 26));
		panel1.add(label3);
		
		label33 = new JLabel("Date 1");
		label33.setBounds (450, 130, 100, 50);
		label33.setFont (new Font("Calibri", 0, 26));
		panel1.add(label33);
		
		label333 = new JLabel("Date 2");
		label333.setBounds (450, 190, 100, 50);
		label333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label333);
		
		label3333 = new JLabel("Date 3");
		label3333.setBounds (450, 250, 100, 50);
		label3333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label3333);
		
		label33333 = new JLabel("Date 4");
		label33333.setBounds (450, 310, 100, 50);
		label33333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label33333);
		
		label333333 = new JLabel("Date 5");
		label333333.setBounds (450, 370, 100, 50);
		label333333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label333333);
		
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