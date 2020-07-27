<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="getEmployees">
	<input type="submit" value="List Employees">
</form>
<br> 
<form action="findEmployeejsp">
	<input type="submit" value="Find Employee">
</form>
<br> 
<form action="addEmployeejsp">
	<input type="submit" value="Add Employee">
</form>
<br> 
<form action="updateEmployeejsp">
	<input type="submit" value="Update Employee">
</form>
<br> 
<form action="deleteEmployeejsp">
	<input type="submit" value="Delete Employee">
</form>

<br><br><br><br>
<form action="addEmployee">
	<input type="text" name="name"><br>
	<input type="text" name="designation"><br>
	<input type="text" name="expertise"><br>
	<input type="submit"><br>
</form>
<form action="getEmployees">
	<input type="number" name="id"><br>
	<input type="submit"><br>
</form>
</body>
</html>