<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>

<style>
table {
  margin-left: 430px;
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 250px;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
.button {
  display: inline-block;
  padding: 8px 8px;
  font-size: 15px;
  cursor: pointer;
  text-align: center;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: #4CAF50;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color: #3e8e41}

.button:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}
</style>
<meta charset="ISO-8859-1">
<title>Employee Selection</title>
</head>
<body>
<form action="" method="post">
<h1 align="center">Employee List</h1><br>
<hr>
<button><a href="EmployeeCrud.jsp">Add New Employee</a></button>
<table border="1">
<tr>
<th>Emp_Id</th>
<th>Emp_Name</th>
<th>Emp_Dept</th>
<th>Emp_Salary</th>
<th>Delete</th>
<th>Update</th>
</tr>
	<c:forEach var = "temp" items = "${EmployeeListfromServlet}">
		<tr>
			<td>${temp.empId }</td>
			<td>${temp.empName }</td>
			<td>${temp.empDept }</td>
			<td>${temp.empSalary }</td>
			<td><button type="button" class="button"><a href="DeleteEmployee.jsp">Delete</a></button></td>
			<td><button type="button" class="button"><a href="UpdateEmployee.jsp">Update</a></button></td>
			
		</tr>
	</c:forEach>

</table>
</form>
</body>
</html>