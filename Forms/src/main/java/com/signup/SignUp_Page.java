package com.signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class SignUp_Page extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
    {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmpassword = req.getParameter("confirmpassword");

        PrintWriter out = resp.getWriter();
        
        if (password.equals(confirmpassword)) 
        {
            try 
            {
                Class.forName("com.mysql.cj.jdbc.Driver");

                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/register", "root", "root");

                String query = "insert into signupdetails (email, password) values (?, ?)";
                PreparedStatement ps = c.prepareStatement(query);

                ps.setString(1, email);
                ps.setString(2, password);

                int i = ps.executeUpdate(); 
                
                if (i > 0) 
                	resp.sendRedirect("signin.html");
                else  
                	out.print("Registration failed.");
                
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        } 
        else  
        	out.print("Passwords do not match.");  
    }
}
