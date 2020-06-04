import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class CourseAssign extends JFrame implements ActionListener
{
	private JLabel label1, label2, label3, label4, label5, label6, label7;
	private JComboBox combobox1, combobox2, combobox3, combobox4;
	private JPasswordField passwordfield1;
	private JButton button1, back, logout, select;
	private ImageIcon image;
	private JPanel panel1;
	private String name;
	private String[] s1 = new String[1000];
	private String[] s2 = new String[52];
	private String[] s3 = new String[200];
	private String s[] = {"-----"};
	//int j=0;
	
	public CourseAssign(){}
	public CourseAssign (String name)
	{
		super("Course Assigning");
		this.setSize(600, 700);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setOpaque(true);
        panel1.setBackground(Color.white);
		
		this.name=name;
		
		label1 = new JLabel("Course");
		label1.setBounds (50, 70, 150, 50);
		label1.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label1);
		getCourses();
		combobox1 = new JComboBox(s1);
		combobox1.setBounds (50, 120, 200, 40);
		combobox1.setBackground(Color.WHITE);
		panel1.add(combobox1);
		
		label3 = new JLabel("Section");
		label3.setBounds (50, 250, 100, 50);
		label3.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label3);
		combobox2 = new JComboBox(s);
		combobox2.setBounds (50, 300, 80, 40);
		combobox2.setBackground(Color.WHITE);
		panel1.add(combobox2);
		combobox2.setVisible(true);
		
		
		//combobox4 = new JComboBox(s2);
		//combobox4.setBounds (50, 300, 80, 40);
		//combobox4.setBackground(Color.WHITE);
		//panel1.add(combobox4);
		//combobox2.setVisible(false);
		//combobox4.setVisible(false);
				
		
		label5 = new JLabel("Faculty Name");
		label5.setBounds (50, 380, 400, 50);
		label5.setFont (new Font("Calibri Light", 0, 32));
		panel1.add(label5);
		getFaculty();
		combobox3 = new JComboBox(s3);
		combobox3.setBounds (50, 430, 250, 40);
		combobox3.setBackground(Color.WHITE);
		panel1.add(combobox3);
		
		button1 = new JButton("Submit");
		button1.setBounds (360, 350, 100, 35);
		button1.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		button1.setForeground(Color.WHITE);
		button1.setFont (new Font("Calibri Light", 1, 20));
		button1.addActionListener(this);
		panel1.add (button1);
		
		select = new JButton("Select");
		select.setBounds (360, 120, 100, 35);
		select.setBackground(Color.BLUE); //(new java.awt.Color(0, 153, 255));
		select.setForeground(Color.WHITE);
		select.setFont (new Font("Calibri Light", 1, 20));
		select.addActionListener(this);
		panel1.add (select);
		
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
		
		if(btn.equals("Submit"))
		{
			assign();
		}
		else if(btn.equals("Select"))
		{
			//combobox4.setVisible(false);
			getSection();
			//j++;			
		}
		else if(btn.equals("Back"))
		{
			Admin ai = new Admin(name);
			ai.setVisible(true);
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
	public void getCourses()
	{
		String query = "SELECT distinct course FROM `course_section`;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aiub","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
			int i = 0;
			int valid=0;
					
			while(rs.next())
			{
                String course = rs.getString("course");
                //String section = rs.getString("section");
				//String course_teacher = rs.getString("course_teacher");
				
				//for(int k=0;k<i;k++)
				//{
					//if(course==s1[k])
					//{
					//	valid=1;
					//	break;
					//}
				//}
				//if(valid==0)
				//{
					s1[i] = course;
					i++;
				//}
				//valid=0;
				//i++;
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
	public void getSection()
	{
		String query = "SELECT * FROM `course_section`;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
		String selected = combobox1.getSelectedItem().toString();
		System.out.println(selected);
		//String[] s2 = new String[52];
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aiub","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
			int i = 0;
					
					
			while(rs.next())
			{
				//s2 = new String[52];
                String course = rs.getString("course");
                String section = rs.getString("section");
				String course_teacher = rs.getString("course_teacher");
				//System.out.println(course);
				if (course.equals(selected))
				{
					System.out.println(course);
					s2[i] = section;
					System.out.println(s2[i]);
					i++;
				}				
			}
			//i=0;
			combobox4 = new JComboBox(s2);
			combobox4.setBounds (50, 300, 80, 40);
			combobox4.setBackground(Color.WHITE);
			panel1.add(combobox4);
			combobox2.setVisible(false);
			combobox4.setVisible(true);
			
			/*System.out.println(j);
			hello[j] = new JComboBox(s2);
			hello[j].setBounds (50, 300, 80, 40);
			hello[j].setBackground(Color.WHITE);
			panel1.add(hello[j]);
			combobox2.setVisible(false);
			hello[j].setVisible(true);*/
			
			
		}
        catch(Exception ex)
		{
			System.out.println("Exception : " +ex.getMessage());
        }
        finally
		{
            try
			{
                //if(rs!=null)
					rs.close();

                //if(st!=null)
					st.close();

               // if(con!=null)
					con.close();
            }
            catch(Exception ex){}
        }
	}
	public void getFaculty()
	{
		String query = "SELECT * FROM `users`;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aiub","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
			int i = 0;
					
			while(rs.next())
			{
                String userId = rs.getString("UserId");
                String password = rs.getString("Password");
				int userType = rs.getInt("UserType");
				String name = rs.getString("Name");
				if (userType == 2)
				{
					s3[i] = name;
					i++;
				}				
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
	public void assign()
	{
		String c = combobox1.getSelectedItem().toString();
		String c1 = combobox4.getSelectedItem().toString();
		String c2 = combobox3.getSelectedItem().toString();
		System.out.println(c2);
		String query = "UPDATE `course_section` SET course_teacher = '"+combobox3.getSelectedItem().toString()+"' where course = '"+combobox1.getSelectedItem().toString()+"' and section = '"+combobox4.getSelectedItem().toString()+"';";
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