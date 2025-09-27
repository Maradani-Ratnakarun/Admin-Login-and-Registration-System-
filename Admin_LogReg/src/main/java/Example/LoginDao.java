package Example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao 
{
   public LoginBean sb = null;
   
   public LoginBean login(String name,String pass)
   {
	   try
	   {
		   Connection con = dbConnect.getcon();
		   PreparedStatement st = con.prepareStatement("select*from reg1 where name=? and pass=?");
		   st.setString(1, name);
		   st.setString(2, pass);
		   ResultSet ex = st.executeQuery();
		   if(ex.next())
		   {
			   sb = new LoginBean();
			   sb.setName(ex.getString(1));
			   sb.setName(ex.getString(2));
		   }
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return sb;
   }
}
