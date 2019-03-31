package com.empmang.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(value="/register.do")
public class AdminRegisterservlet extends HttpServlet {
public void init() {
	System.out.println("admin register called");
}
public void doGet(HttpServletRequest req,HttpServletResponse res) {
	this.doPost(req,res);
	
}
public void doPost( HttpServletRequest  req, HttpServletResponse res) {
	HttpSession hs=req.getSession();
	String name=req.getParameter("name");
	String password=req.getParameter("password");
	hs.setAttribute("name", name);
	hs.setAttribute("password",password);
	RequestDispatcher rd= req.getRequestDispatcher("registration.jsp");
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
public void destroy() {
	System.out.println("destroy called");
}
}
