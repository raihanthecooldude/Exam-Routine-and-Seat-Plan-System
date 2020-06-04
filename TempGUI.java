import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class TempGUI extends JFrame implements ActionListener
{
	private JLabel label1, label2, label3, label4, label5, correct, error;
	private JTextField textfield1;
	private JPasswordField passwordfield1;
	private JButton button1;
	private ImageIcon image;
	private JPanel panel1;
	
	public TempGUI ()
	{
		super("AIUB");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		label1 = new JLabel("AMERICAN INTERNATIONAL");
		label1.setBounds (175, 40, 500, 80);
		label1.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label1);
		label2 = new JLabel("UNIVERSITY-BANGLADESH");
		label2.setBounds (180, 85, 450, 70);
		label2.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label2);
		
		label3 = new JLabel("-where leaders are created.");
		label3.setBounds (320, 140, 290, 38);
		label3.setFont (new Font("Calibri", 0, 18));
		panel1.add(label3);
		
		label4 = new JLabel("Sign in with your organizational ID number.");
		label4.setBounds (99, 270, 540, 40);
		label4.setFont (new Font("Calibri", 0, 22));
		panel1.add(label4);
		
		error = new JLabel("Invalid username or password.");
		error.setVisible(false);
		error.setBounds(200, 305, 400, 40);
		error.setFont(new Font("Calibri", 0, 16));
		error.setBackground(Color.WHITE);
		error.setForeground(Color.RED);
		panel1.add(error);
		
		textfield1 = new JTextField();
		textfield1.setBounds (97, 370, 400, 40);
		panel1.add(textfield1);
		
		passwordfield1 = new JPasswordField();
		passwordfield1.setBounds (97, 425, 400, 40);
		panel1.add(passwordfield1);
		
		button1 = new JButton("Log In");
		button1.setBounds (246, 500, 100, 35);
		button1.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		button1.setForeground(Color.WHITE);
		button1.setFont (new Font("Calibri Light", 1, 20));
		button1.addActionListener(this);
		panel1.add (button1);
		
		image = new ImageIcon (getClass().getResource("aiub.jpg"));
		label5 = new JLabel (image);
		label5.setBounds(10, 10, 160, 180);
		panel1.add(label5);		
		
		this.add(panel1);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		String btn = a.getActionCommand();
		
		if(btn.equals(button1.getText()))
		{
			check();
		}
	}
	public void check()
	{
        String query = "SELECT `UserId`, `Password`, `UserType`, `Name` FROM `users`;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
		boolean flag = true;
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AIUB","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
					
			while(rs.next())
			{
                String userId = rs.getString("UserId");
                String password = rs.getString("Password");
				int userType = rs.getInt("UserType");
				String name = rs.getString("Name");
				//System.out.println(userId + password);
				
				if(userId.equals(textfield1.getText()) && password.equals(passwordfield1.getText()))
				{
					System.out.println(userId + " " + password);
					if (userType == 1)
					{
						flag = false;
						StudentMain S = new StudentMain(name);
						S.setVisible(true);
						this.setVisible(false);
						break;
					}
					else if (userType == 2)
					{
						flag = false;
						FacultyMain F = new FacultyMain(name);
						F.setVisible(true);
						this.setVisible(false);
						break;
					}
					else if (userType == 3)
					{
						flag = false;
						Admin A = new Admin(name);
						A.setVisible(true);
						this.setVisible(false);
						break;
					}
				}
			}
			if(flag)
			{
				error.setVisible(true);;
			}
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
        finally
		{
            try
			{
                if(rs!=null)
					rs.close();

                if(st!=null)
					st.close();

                if(con!=null)
					con.close();
            }
            catch(Exception ex){}
        }
    } 
}