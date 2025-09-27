package Example;
import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginAdmin  extends HttpServlet
{
	@Override
  protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
  {
	  HttpSession se = req.getSession();
	  if(se==null)
	  {
		  req.setAttribute("mesg", "Session Expired");
		  req.getRequestDispatcher("Mesg.jsp").forward(req, res);
  }
	  else
	  {
		  String name = req.getParameter("name");
		  String pass = req.getParameter("pass");
		  LoginBean l = new LoginDao().login(name, pass);
		  se.setAttribute("abean", l);
		  if(l!=null)
		  {
			  req.setAttribute("msg", "Login SucessFull..");
			  req.getRequestDispatcher("Login.jsp").forward(req, res);
		  }
		  
	  }
  }
}
