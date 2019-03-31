<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Update Employee Form</h1>
   <div align="center">
       <form action="update">
<div>
               <input type="text" name="employeeName"
                   placeholder="Enter Name" value="<%=request.getParameter("name")%>" />
           </div>
           <br>
           <div>
               <input type="text" name="id" placeholder="enter id" value="<%=request.getParameter("id")%>" />
           </div>
           <br>
           <div>
               <input type="text" name="age" placeholder="enter age" value="<%=request.getParameter("age")%>" />
           
           </div>
           <br>
           <div>
               <input type="text" name="department" placeholder="Enter Department" value="<%=request.getParameter("department")%>" />
           </div>
           <br>
           <div>
               <input type="text" name="designation"
                   placeholder="Enter Designation" value="<%=request.getParameter("designation")%>"/>
           </div>
           <br>
           <div>
               <input type="number" name="salary" placeholder="Enter salary" value="<%=request.getParameter("salary")%>"/>
           </div>
           <br>
           <br> <input type="submit" value="update" class="button" />
           <button type="reset" class="button">RESET</button>

       </form>
   </div>
</body>
</html>