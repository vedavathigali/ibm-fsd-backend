package com.empmang.servlet;

import java.io.IOException;

import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(value="/delete")
public class deleteEmployeeServlet extends HttpServlet{
	EmployeeService employeeService = new EmployeeService();

    public void init() {
        System.out.println("Employee Servlet Initialized");

    }

   

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        String id = (String) request.getParameter("id");
        
        int ids = Integer.parseInt(id);
        System.out.println(ids);
        employeeService.deleteEmployee(ids);
        response.sendRedirect("view.jsp");
    }
}
