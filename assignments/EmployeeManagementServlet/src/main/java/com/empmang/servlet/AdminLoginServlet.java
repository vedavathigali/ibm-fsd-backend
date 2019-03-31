package com.empmang.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(value="/login.do")
public class AdminLoginServlet  extends HttpServlet  {
	public void init() {
		System.out.println("admin login called");
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		this.doPost(req,res);
		
	}
	public void doPost( HttpServletRequest  req, HttpServletResponse res) {
		HttpSession hs=req.getSession();
		RequestDispatcher rd;
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		String name1=(String) hs.getAttribute("name");
		String password1=(String)hs.getAttribute("password");
		if((name.equalsIgnoreCase(name1))&&(password.equals(password1)))
        {
            rd = req.getRequestDispatcher("home.jsp");
            try {
                rd.forward(req, res);
            } catch (ServletException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else {
            rd=req.getRequestDispatcher("invalidcredentials.jsp");
            try {
                rd.forward(req, res);
            } catch (ServletException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
    }
		
		
		
	
	public void destroy() {
		System.out.println("destroy called");
	}
}
