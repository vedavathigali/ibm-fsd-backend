package employeemanagement;import java.util.*;

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
		public void addEmployee() {
			System.out.println("add method called");
			System.out.println("enter name");
			String ename=sc.next();
			System.out.println("enter id");
			int eid=sc.nextInt();
			System.out.println("enter age");
			int eage=sc.nextInt();
			System.out.println("enter designation");
			String edes=sc.next();
			System.out.println("enter department");
			String edept=sc.next();
			System.out.println("enter salary");
			Double esalary=sc.nextDouble();
			ed.createUser(new employee(ename, eid,eage,edes,edept,esalary ));
}
		public void updateEmployee() {
			System.out.println("enter id where to update");
			int uid=sc.nextInt();
			System.out.println("enter the employee name");
			String name=sc.next();
			System.out.println("enter the id");
			int id=sc.nextInt();
			System.out.println("enter the age");
			int age=sc.nextInt();
			System.out.println("enter the designation");
			String des=sc.next();
			System.out.println("enter the department");
			String dept=sc.next();
			System.out.println("enter the salary");
			double salary=sc.nextDouble();
			ed.updateUser(name,id,age,des,dept, salary,uid);

	}
		public void viewEmployeeById() {
			System.out.println("enter which element u want to view");
		     int n1=sc.nextInt();
			ed.viewEmployee(n1);
			}
		
		public void deleteEmployee() {
			// TODO Auto-generated method stub
			System.out.println("enter which element u want to delete");
			int n1=sc.nextInt();
				
				ed.deleteEmp(n1);
		}
		
		public void viewEmployees() {
			System.out.println("list of all employee details");
			ed.displayEmployees();
			
		}
		
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
			
			}
		


