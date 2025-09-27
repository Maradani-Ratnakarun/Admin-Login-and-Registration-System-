package Example;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/registartion")
public class AdminReg extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException
    {
    	AdminBean b = new AdminBean();
    	b.setName(req.getParameter("name"));
    	b.setPass(req.getParameter("pass"));
    	b.setFname(req.getParameter("fname"));
    	b.setLname(req.getParameter("lname"));
    	b.setMailid(req.getParameter("mail"));
    	b.setNumber(Long.parseLong(req.getParameter("phno")));
    	int k = new AdminDao().get(b);
    	
    	if(k<0)
    	{
    		req.setAttribute("mesg", "Registration Failed...");
    		req.getRequestDispatcher("Mesg.jsp").forward(req, res);
    	}
    	else 
    	{
    		HttpSession se = req.getSession();
    		se.setAttribute("sf", b);
    		req.getRequestDispatcher("rege.jsp").forward(req, res);
    		
    	}
    	
    	
    }
} 
