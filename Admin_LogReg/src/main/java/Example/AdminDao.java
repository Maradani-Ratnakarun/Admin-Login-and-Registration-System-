package Example;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AdminDao 
{
  int k = 0;
  
  public int get(AdminBean x)
  {
	  try
	  {
		  Connection con = dbConnect.getcon();
		  PreparedStatement st = con.prepareStatement("insert into reg1 values(?,?,?,?,?,?)");
		  st.setString(1, x.getName());
		  st.setString(2, x.getPass());
		  st.setString(3, x.getFname());
		  st.setString(4, x.getLname());
		  st.setString(5, x.getMailid());
		  st.setLong(6, x.getNumber());
		  k = st.executeUpdate();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return k;
  }
}
