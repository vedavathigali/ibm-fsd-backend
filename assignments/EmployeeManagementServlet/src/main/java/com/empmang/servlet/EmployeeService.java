package com.empmang.servlet;import java.util.*;

import java.util.Map.Entry;
import java.util.stream.Collectors;

import java.sql.Statement;
import java.sql.Connection;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class EmployeeService {
	     employeeDao ed=new employeeDao();
		Scanner sc=new Scanner(System.in);
		//private Object employee;
		//adding employee
		public void addEmployee(employee emp) throws SQLException {
			System.out.println("add method called");
			
			ed.createUser(emp);
}
		public void viewEmployeeById() {
			System.out.println("enter which element u want to view");
		     int n1=sc.nextInt();
			ed.viewEmployee(n1);
			}
		public List<employee> viewEmployees() {
			System.out.println("list of all employee details");
			return ed.displayEmployees();
			
		}
		
		public void updateEmployee(employee e) throws SQLException{
			
			ed.updateUser(e.getEname(),e.getEid(),e.getEage(),e.getEdes(),e.getEdept(),e.getEsalary());

	}
		
		
		public void deleteEmployee(int n) {
			// TODO Auto-generated method stub
			//.out.println("enter which element u want to delete");
			//int n1=sc.nextInt();
				
				ed.deleteEmp(n);
		}
		
		
		/*
			public void statistics() {
				//no of employees in each  department
				ed.printStatistics();
			}
			public void Import() throws IOException {
				ed.importdata();
			      			   }

			public void Export()throws IOException {

		       ed.exportData();
	}
		*/	
			}
		


