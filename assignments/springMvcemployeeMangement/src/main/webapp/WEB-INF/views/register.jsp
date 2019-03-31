<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
	<title>Register</title>
</head>

<body>
<p> ${exception.errorMsg}</p>
<br>
<h2>Register</h2>


<form:form action="register" modelAttribute="user">
   <table>
    <tr>
        <td><form:label path="userName">UserName:</form:label></td>
        <td><form:input path="userName" /></td>
        <td><form:errors path="userName" cssClass="error" /><td>
    </tr>
    <tr>
        <td><form:label path="password">Password:</form:label></td>
        <td><form:password path="password" /></td>
        <td><form:errors path="password" cssClass="error" /><td>
    </tr>
    
    <tr>
        <td colspan="2">
            <input type="submit" value="Register"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>