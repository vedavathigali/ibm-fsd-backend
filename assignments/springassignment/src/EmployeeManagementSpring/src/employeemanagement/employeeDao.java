package employeemanagement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class employeeDao {
	private static String  jdbcDriver;
	private static String url;
	private static String user;
	private static String password;
Connection conn=null;
	Statement stmt =null;
	/*static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/jdbcassignment";//jdbc i drivername
	//mysql is database and jdbc is schema name

	// Database credentials
	static final String USER = "root";
	final String PASS = "pass@word1";
	
	*/public employeeDao() {
		// TODO Auto-generated constructor stub
	}
	public static String getJdbcDriver() {
		return jdbcDriver;
	}
	public static void setJdbcDriver(String jdbcDriver) {
		employeeDao.jdbcDriver = jdbcDriver;
	}
	public static String getUrl() {
		return url;
	}
	public static void setUrl(String url) {
		employeeDao.url = url;
	}
	public static String getUser() {
		return user;
	}
	public static void setUser(String user) {
		employeeDao.user = user;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		employeeDao.password = password;
	}
	public employeeDao(String jdbcDriver,String url,String user,String password) {
		super();
		this.jdbcDriver=jdbcDriver;
		this.url=url;
		this.user=user;
		this.password=password;
	 /* try {
Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("connection established");
		}
		catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		} 
		*/
		
	}
	public employeeDao(EmployeeService employeeService) {
		// TODO Auto-generated constructor stub
	}
	
	public void  createUser(employee e) {
		
		String insertQuery="INSERT INTO employeemanagement values(?,?,?,?,?,?)";
		try {Class.forName(this.jdbcDriver);
		System.out.println("Connecting to database...");
		conn = DriverManager.getConnection(this.url, this.user, this.password);
		System.out.println("connection established");
		PreparedStatement pst=conn.prepareStatement(insertQuery);
		
		pst.setString(1,e.getEname());
		pst.setInt(2,e.getEid());
		pst.setInt(3, e.getEage());
		pst.setString(4, e.getEdes());
		pst.setString(5, e.getEdept());
		pst.setDouble(6,e.getEsalary() );
	     pst.execute();
		}catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception ex) {
			// Handle errors for Class.forName
			ex.printStackTrace();
		} 
	}
	public void updateUser(String name,int id,int age,String des,String dept,double salary,int uid)
{
		String updateEmployee="update employeemanagement set ename=?,eid=?,eage=?,edes=?,edept=?,esalary=? where eid=?";
		try {
			
		Class.forName(this.jdbcDriver);
			conn = DriverManager.getConnection(this.url, this.user, this.password);
			
			PreparedStatement pst=conn.prepareStatement(updateEmployee);
			
			pst.setInt(7,uid );
			pst.setString(1,name);
			pst.setInt(2,id);
			pst.setInt(3,age);
			pst.setString(4,des);
			pst.setString(5,dept);
			pst.setDouble(6,salary);
			pst.execute();
			
		}catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}
	
	}
	public void viewEmployee(int eid) {
		// TODO Auto-generated method stub
		String searche="select eid from employeemanagement where eid=?";
		String viewemp="select * from employeemanagement where eid=?";
		try {
			Class.forName(this.jdbcDriver);
			conn = DriverManager.getConnection(this.url, this.user, this.password);
			
			PreparedStatement pst1=conn.prepareStatement(searche);
			pst1.setInt(1, eid);
			ResultSet rs1=pst1.executeQuery();
			if(rs1.next()) { 
				try{
		PreparedStatement pst=conn.prepareStatement(viewemp);
		pst.setInt(1, eid);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			String name = rs.getString("ename");
			int empid = rs.getInt("eid");
			int age = rs.getInt("eage");
			String designation = rs.getString("edes");
			String department = rs.getString("edept");
			Double salary=rs.getDouble("esalary");
// Display values
			System.out.print(" Name: " + name);
			System.out.print("ID: " + empid);
			System.out.print(", Age: " + age);
			System.out.print(", Designation: " + designation);
			System.out.print(", Department: " + department);
			System.out.println(",Salary:"+salary);
			
		System.out.println();
		}}catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
			}}
		else {
			System.out.println("Employee not found");
		}
		}catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}
	}
	
	
	public void deleteEmp(int eid) {
		// TODO Auto-generated method stub
		String searchemp="select eid from employeemanagement where eid=?";
		String delemp="delete from employeemanagement where eid=?";
		try {
			Class.forName(this.jdbcDriver);
		conn = DriverManager.getConnection(this.url, this.user, this.password);
		
			PreparedStatement pst=conn.prepareStatement(searchemp);
			pst.setInt(1, eid);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				try {
					PreparedStatement pst1=conn.prepareStatement(delemp);
					pst1.setInt(1, eid);
					pst1.execute();
					System.out.println("employee deleted sucessfully");
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			else {
				System.out.println("Employee not found");
			}
		}catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}

	}
	public void displayEmployees() {
		String viewemp="select * from employeemanagement";
		try {
			Class.forName(this.jdbcDriver);
		conn = DriverManager.getConnection(this.url, this.user, this.password);
		
		 stmt =  conn.createStatement();
		 ResultSet rs=stmt.executeQuery(viewemp);
			while(rs.next()) {
				
				
				String name = rs.getString("ename");
				int empid = rs.getInt("eid");
				int age = rs.getInt("eage");
				String designation = rs.getString("edes");
				String department = rs.getString("edept");
				Double salary=rs.getDouble("esalary");
	// Display values
				System.out.print(" Name: " + name);
				System.out.print("ID: " + empid);
				System.out.print(", Age: " + age);
				System.out.print(", Designation: " + designation);
				System.out.print(", Department: " + department);
				System.out.println(",Salary:"+salary);
				
			System.out.println();
		 
		}}catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}
	}
	public void printStatistics() {
		String noemplys="select edept, count(eid) from employeemanagement group by edept";
		try {
			Class.forName(this.jdbcDriver);
		conn = DriverManager.getConnection(this.url, this.user, this.password);
		
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(noemplys);
			System.out.println("no of employees in each department " );
			while(rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				
			}}catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			} catch (Exception e) {
				// Handle errors for Class.forName
				e.printStackTrace();
			}
	//employees whose salary is greater than 50000
		String empg="select * from employeemanagement where esalary>50000";
		try {
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(empg);
			System.out.println("no of employees having salary greater than 50000" );
			while(rs.next()) {
				String name = rs.getString("ename");
				Double salary=rs.getDouble("esalary");
				
				System.out.print(" Name: " + name);
				System.out.println(",Salary:"+salary);
				
				
				
			}}catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			} catch (Exception e) {
				// Handle errors for Class.forName
				e.printStackTrace();
			}
//employees whose name start with v
		String sname="select * from employeemanagement where ename LIKE 'v%'";
		try {
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(sname);
			System.out.println("employees whose name start with v" );
			while(rs.next()) {
				String name = rs.getString("ename");
		System.out.print(" Name: " + name);
		System.out.println();
		}}catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			} catch (Exception e) {
				// Handle errors for Class.forName
				e.printStackTrace();
			}
//highest salary
		String maxsal="select ename,max(esalary)  as esalary from employeemanagement";
		try {
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(maxsal);
			System.out.println("employee having the highest salary" );
			while(rs.next()) {
				
				Double salary=rs.getDouble("esalary");
				System.out.println("name"+":"+rs.getString("ename")+":");
		
		System.out.println(salary);
		System.out.println();
		}}catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			} catch (Exception e) {
				// Handle errors for Class.forName
				e.printStackTrace();
			}
//lowest salary
		String lowestsal="select ename,min(esalary) as esalary from employeemanagement";
		try {
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(lowestsal);
			System.out.println("employee having the lowest salary" );
			while(rs.next()) {
				
				Double salary=rs.getDouble("esalary");
				System.out.println("name"+":"+rs.getString("ename"));
		
		System.out.println(salary);
		System.out.println();
		}}catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			} catch (Exception e) {
				// Handle errors for Class.forName
				e.printStackTrace();
			}
		//employees having age greater than 30
		String empage="select ename,eage,count(eid) from employeemanagement where eage>30 group by edept";
		try {
			stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(empage);
			System.out.println("employee having the age greater than 30" );
			while(rs.next()) {
				
				
				System.out.println("name"+":"+rs.getString("ename"));
		System.out.println("age"+":"+rs.getInt("eage"));
		System.out.println(rs.getString(3));
		
		System.out.println();
		}}catch (SQLException se) {
				// Handle errors for JDBC
				se.printStackTrace();
			} catch (Exception e) {
				// Handle errors for Class.forName
				e.printStackTrace();
			}
		

	}
	public void importdata() {
		 String O;int ctr=0;
	       try {
	    	   Class.forName(this.jdbcDriver);
			conn = DriverManager.getConnection(this.url, this.user, this.password);
			
	       BufferedReader br=new BufferedReader(new FileReader("D:\\\\files\\\\empdbimport.txt"));
	       while((O=br.readLine())!=null) {
	           ctr++;
	           String[] array=O.split(",");

	           String insertQuery="insert into employeemanagement values(?,?,?,?,?,?)";
	           try
	           {
	           PreparedStatement pstmt = conn.prepareStatement(insertQuery);
	            pstmt.setString(1, array[0]);
	            pstmt.setInt(2, Integer.parseInt(array[1]));
	            pstmt.setInt(3, Integer.parseInt(array[2]));
	            pstmt.setString(4, array[3]);
	            pstmt.setString(5, array[4]);
	            pstmt.setDouble(6, Double.parseDouble(array[5]));
	            pstmt.execute();
	       }catch (SQLException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	       System.out.println(ctr+" Employees Imported Successfully");

	   }
	       br.close();
	       }
	       catch(FileNotFoundException e) {
	           e.printStackTrace();
	       }
	       catch(Exception e) {
	           e.printStackTrace();
	       }


	}
	public void exportData() {
		 try {
			 Class.forName(this.jdbcDriver);
			conn = DriverManager.getConnection(this.url, this.user, this.password);
			
	            List<employee> empList=new ArrayList();

	            String fetchQuery="select * from employeemanagement";
	            try {
	                Statement stmt= conn.createStatement();
	                ResultSet rs=stmt.executeQuery(fetchQuery);
	                while(rs.next())
	                {
	                    String name=rs.getString(1);
	                    int id=rs.getInt(2);
	                    int age=rs.getInt(3);
	                    String designation=rs.getString(4);
	                    String dept=rs.getString(5);
	                    double sal=rs.getDouble(6);
	                    empList.add(new employee(name, id, age,  designation, dept, sal));
	                }
	            } catch (SQLException e) {
	                // TODO Auto-generated catch block
	                e.printStackTrace();
	            }
	           BufferedWriter br=new BufferedWriter(new FileWriter("D:\\files\\empdbexport.txt"));
	           br.write("\t\t    #######################################################################################################\n");

	           br.write("\t\tName: \t\t Id: \t\t Age: \t\t Designation: \t\t  Department: \t\t  Salary:\n");
	           br.write("\t\t    #######################################################################################################\n");
	           for(employee el:empList) {
	               br.write("\t\t\t"+el.getEname()+"\t\t\t"+el.getEid()+"\t\t\t"+el.getEage()+"\t\t\t"+el.getEdes()+"\t\t\t"+el.getEdept()+"\t\t\t"+el.getEsalary()+"\n");
	               br.write("\t\t    --------------------------------------------------------------------------------------------------------\n");

	       }
	       br.close();

	   }
	       catch(FileNotFoundException e) {
	           e.printStackTrace();
	       }
	       catch(Exception e) {
	           e.printStackTrace();
	       }
	       System.out.println("Export Successful");
	}
		  

		
	
}
