package com.empmang.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(value="/update")
public class updateEmployeeServlet extends HttpServlet{
	public void init() {
		System.out.println("update servlet called");
		
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
	 HttpSession session = req.getSession();

	       
	        String name = req.getParameter("name");
	        int ids = Integer.parseInt(req.getParameter("id"));
	        String eage=req.getParameter("age");
	        int age=Integer.parseInt(eage);
	        String designation = req.getParameter("designation");
	        String department = req.getParameter("department");
	        
	        Double sal = Double.parseDouble(req.getParameter("salary"));
	       System.out.println(req.getParameter("age"));
       System.out.println(age);
	    EmployeeService es=new EmployeeService();
	        employee emp = new employee(name, ids,age,designation, department, sal);
	        try {
	            es.updateEmployee(emp);
	        } catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        try {
				res.sendRedirect("view.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
		public void destroy() {
		System.out.println("update servlet called");
	}
}
	