package com.signin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signin")
public class SignIn_Page extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "root");
            
                        String query = "select * from signupdetails where email=? and password=?";
                        PreparedStatement ps = c.prepareStatement(query);
                        ps.setString(1, email);
                        ps.setString(2, password);
            
                        ResultSet rs = ps.executeQuery();
            
                        if (rs.next())
            	             out.print("<h1>Welcome " + email + "</h1>");
                        else
            	             out.print("<h1>Something Went Wrong .....</h1>"); 
            
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
