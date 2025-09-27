package Example;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnect 
{
    private  static  Connection con = null;
	
	 
	 static
	 {
		 try
		 {
			Class.forName(connect.driver);
			con = DriverManager.getConnection(connect.dburl,connect.usname,connect.pass);
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	public static Connection getcon()
	{
		return con;
	}
}
