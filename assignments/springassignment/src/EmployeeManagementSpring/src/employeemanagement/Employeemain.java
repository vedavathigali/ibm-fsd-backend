package employeemanagement;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Employeemain  extends EmployeeService{
	
		public static void main(String args[]) {
			ApplicationContext container=new ClassPathXmlApplicationContext("dao.xml");
			employeeDao d=(employeeDao) container.getBean("empdao");
			EmployeeService e1=new EmployeeService();
			Scanner sc=new Scanner(System.in);
	int n;	
		char choice;
		
		do {
	System.out.println("1.Add employee");
	System.out.println("2.view employee by id");
	System.out.println("3.View all employee");
	System.out.println("4.Delete employee");
	System.out.println("5. update employee");
	System.out.println("6.statistics employee");
	System.out.println("7.import");
	System.out.println("8.export");
	System.out.println("enter your choice");
		n=sc.nextInt();
	switch(n) {
	case 1:e1.addEmployee();
	break;
	case 2:e1.viewEmployeeById();
	break;
	case 3:e1.viewEmployees();
	break;
	case 4:e1.deleteEmployee();
	break;
	case 5:System.out.println("enter which element u want to update");
	int n3=sc.nextInt();
	e1.updateEmployee();
	break;
	case 6:e1.statistics();
	break;
	case 7:try {
			e1.Import();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	break;
	case 8:try {
			e1.Export();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	break;

	default:System.out.println("please enter a valid choice");
	}
	System.out.println("do u want to continue(y/n)");
		
		 choice=sc.next().charAt(0);
		}while(choice=='Y'||choice=='y');
		
		
		}}

