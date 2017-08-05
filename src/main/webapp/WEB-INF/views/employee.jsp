<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee</title>
</head>
<body>
	<h2>Employee List</h2>
	 <h2>List of Employees</h2>  
    <table border="1">
        <tr>
            <td>ID</td><td>NAME</td><td>SSN</td>
        </tr>
        <c:forEach items="${employees}" var="employee">
            <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.ssn}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>