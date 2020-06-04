import javax.swing.*;
import java.awt.*;

public class Student extends JFrame
{
	private JLabel label1, label2, label3, label4;
	private JLabel label11, label22, label33, label44;
	private JLabel label111, label222, label333, label444;
	private JLabel label1111, label2222, label3333, label4444;
	private JLabel label11111, label22222, label33333, label44444;
	private JLabel label111111, label222222, label333333, label444444;
	private JButton button1;
	private ImageIcon image;
	private JPanel panel1;
	
	public Student ()
	{
		super("Student");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		label1 = new JLabel("Course");
		label1.setBounds (50, 40, 200, 50);
		label1.setFont (new Font("Calibri", 1, 26));
		panel1.add(label1);
		
		label11 = new JLabel("wegweg");
		label11.setBounds (50, 100, 200, 50);
		label11.setFont (new Font("Calibri", 0, 26));
		panel1.add(label11);
		
		label111 = new JLabel("wegweg");
		label111.setBounds (50, 160, 200, 50);
		label111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label111);
		
		label1111 = new JLabel("wegweg");
		label1111.setBounds (50, 220, 200, 50);
		label1111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label1111);
		
		label11111 = new JLabel("wegweg");
		label11111.setBounds (50, 280, 200, 50);
		label11111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label11111);
		
		label111111 = new JLabel("wegweg");
		label111111.setBounds (50, 340, 200, 50);
		label111111.setFont (new Font("Calibri", 0, 26));
		panel1.add(label111111);
		
		label2 = new JLabel("Day");
		label2.setBounds (250, 40, 60, 50);
		label2.setFont (new Font("Calibri", 1, 26));
		panel1.add(label2);

		label22 = new JLabel("Day");
		label22.setBounds (250, 100, 60, 50);
		label22.setFont (new Font("Calibri", 0, 26));
		panel1.add(label22);

		label222 = new JLabel("Day");
		label222.setBounds (250, 160, 60, 50);
		label222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label222);
		
		label2222 = new JLabel("Day");
		label2222.setBounds (250, 220, 60, 50);
		label2222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label2222);
		
		label22222 = new JLabel("Day");
		label22222.setBounds (250, 280, 60, 50);
		label22222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label22222);
		
		label222222 = new JLabel("Day");
		label222222.setBounds (250, 340, 60, 50);
		label222222.setFont (new Font("Calibri", 0, 26));
		panel1.add(label222222);
		
		label3 = new JLabel("Slot");
		label3.setBounds (350, 40, 60, 50);
		label3.setFont (new Font("Calibri", 1, 26));
		panel1.add(label3);
		
		label33 = new JLabel("Slot");
		label33.setBounds (350, 100, 60, 50);
		label33.setFont (new Font("Calibri", 0, 26));
		panel1.add(label33);
		
		label333 = new JLabel("Slot");
		label333.setBounds (350, 160, 60, 50);
		label333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label333);
		
		label3333 = new JLabel("Slot");
		label3333.setBounds (350, 220, 60, 50);
		label3333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label3333);
		
		label33333 = new JLabel("Slot");
		label33333.setBounds (350, 280, 60, 50);
		label33333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label33333);
		
		label333333 = new JLabel("Slot");
		label333333.setBounds (350, 340, 60, 50);
		label333333.setFont (new Font("Calibri", 0, 26));
		panel1.add(label333333);
				
		label4 = new JLabel("Room");
		label4.setBounds (450, 40, 150, 50);
		label4.setFont (new Font("Calibri", 1, 26));
		panel1.add(label4);
		
		label44 = new JLabel("Room");
		label44.setBounds (450, 100, 100, 50);
		label44.setFont (new Font("Calibri", 0, 26));
		panel1.add(label44);
		
		label444 = new JLabel("Room");
		label444.setBounds (450, 160, 100, 50);
		label444.setFont (new Font("Calibri", 0, 26));
		panel1.add(label444);
		
		label4444 = new JLabel("Room");
		label4444.setBounds (450, 220, 100, 50);
		label4444.setFont (new Font("Calibri", 0, 26));
		panel1.add(label4444);
		
		label44444 = new JLabel("Room");
		label44444.setBounds (450, 280, 100, 50);
		label44444.setFont (new Font("Calibri", 0, 26));
		panel1.add(label44444);
		
		label444444 = new JLabel("Room");
		label444444.setBounds (450, 340, 100, 50);
		label444444.setFont (new Font("Calibri", 0, 26));
		panel1.add(label444444);
		
		/*button1 = new JButton("Submit");
		button1.setBounds (100, 500, 500, 50);
		button1.setBackground (Color.BLUE);
		button1.setFont (new Font("Calibri Light", 0, 32));
		panel1.add (button1);
		
		image = new ImageIcon (getClass().getResource("aiub.jpg"));
		label5 = new JLabel (image);
		label5.setBounds(10, 10, 220, 220);
		panel1.add(label5);		*/
		
		this.add(panel1);
	}
}