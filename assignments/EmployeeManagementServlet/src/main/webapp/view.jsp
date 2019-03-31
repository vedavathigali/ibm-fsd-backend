<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1" import="com.empmang.servlet.employee, com.empmang.servlet.EmployeeService,  java.util.List, java.util.ArrayList"%>


<html>
<head>
<title>Employees List</title>
</head>



<body>
    <h2>Employees List</h2>

    <table border="2" width="70%" cellpadding="2">
        <tr>
            <th>Name</th>
            <th>Id</th>
            <th>Age</th>
            <th>Designation</th>
            <th>Department</th>
            <th>Salary</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
    <% EmployeeService es=new EmployeeService();
    List<employee> empList=new ArrayList();
    empList=es.viewEmployees();
    for(employee emp:empList){
        %>
        

            <tr>
                <c:forEach var="emp" items="${empList}">
            
                <td><%out.print(emp.getEname());%></td>
                <td><%out.print(emp.getEid()); %></td>
                <td><%out.print(emp.getEage()); %></td>
                <td><%out.print(emp.getEdes()); %></td>
                <td><%out.print(emp.getEdept()); %></td>
                <td><%out.print(emp.getEsalary()); %></td>                
                <td><a href="update.jsp?name=<%=emp.getEname()%>&id=<%=emp.getEid()%>&age=<%=emp.getEage()%>&designation=<%=emp.getEdes()%>&department=<%=emp.getEdept()%>&salary=<%=emp.getEsalary()%>">Update</a></td>
                <td><a href="delete?id=<%=emp.getEid()%>">delete</a></td>
                        </c:forEach>
                
            </tr>
            <%} %>
    </table>
    <br />


    
</body>
</html>