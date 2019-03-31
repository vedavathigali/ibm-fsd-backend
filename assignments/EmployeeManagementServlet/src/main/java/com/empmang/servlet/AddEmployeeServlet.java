package com.empmang.servlet;

import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/add.do")

public class AddEmployeeServlet extends HttpServlet{
public void init() {
	System.out.println("add employee servlet intialized");
	
}
public void doGet(HttpServletRequest req1,HttpServletResponse res1) {
	this.doPost(req1, res1);
	
}
public void doPost(HttpServletRequest req,HttpServletResponse res) {
	
	String name=req.getParameter("name");
	int id=Integer.parseInt(req.getParameter("id"));
	int age=Integer.parseInt(req.getParameter("age"));
	String Department=req.getParameter("department");
	String Designation=req.getParameter("designation");
	double Salary=Double.parseDouble(req.getParameter("salary"));
	employee emp=new employee(name,id,age,Department,Designation,Salary);
	EmployeeService  es=new EmployeeService();
	try {
		
		es.addEmployee(emp);
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public void destroy() {
	System.out.println("add employee destroyed");
}
}
