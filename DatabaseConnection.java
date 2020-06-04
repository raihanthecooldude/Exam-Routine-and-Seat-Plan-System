import java.sql.*;
public class DatabaseConnection
{
    public static void main(String[] args)
	{
		DatabaseConnection d= new DatabaseConnection();
		d.test();
    }
    public void test()
	{
        String query = "SELECT `UserId`, `Password`, `AccountNumber`, `AccountHolderName`, `Balance` FROM `account`;";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		System.out.println(query);
        try
		{
			Class.forName("com.mysql.jdbc.Driver");//load driver
			System.out.println("driver loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop1","root","");
			System.out.println("connection done");//connection with database established
			st = con.createStatement();//create statement
			System.out.println("statement created");
			rs = st.executeQuery(query);//getting result
			System.out.println("results received");
					
			while(rs.next())
			{
                String userId = rs.getString("UserID");
                String password = rs.getString("Password");
				int accountNumber = rs.getInt("AccountNumber");
				String accountHolderName = rs.getString("AccountHolderName");
				double balance = rs.getDouble("Balance");
				System.out.println("User: " +userId);
				System.out.println("Password: " +password);
				System.out.println("AccountNumber: " +accountNumber);
				System.out.println("AccountHolderName: " +accountHolderName);
				System.out.println("Balance: " +balance);
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
