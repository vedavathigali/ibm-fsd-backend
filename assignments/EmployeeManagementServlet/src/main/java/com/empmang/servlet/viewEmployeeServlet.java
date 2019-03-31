package com.empmang.servlet;

import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value="/view.do")
public class viewEmployeeServlet extends HttpServlet {
public void init() {
	System.out.println("view servlet called");
	
}
public void doGet(HttpServletRequest req,HttpServletResponse res) {
	this.doPost(req, res);
}
public void doPost(HttpServletRequest req,HttpServletResponse res) {
	//RequestDispatcher rd;
	int id=Integer.parseInt(req.getParameter("id"));
	EmployeeService  es=new EmployeeService();
	//rd = req.getRequestDispatcher("home.jsp");
	 es.viewEmployees();
	req.setAttribute("empdetails", es.viewEmployees());
	
}
public void destroy() {
	System.out.println("view servlet destroyed");
	
}
}
