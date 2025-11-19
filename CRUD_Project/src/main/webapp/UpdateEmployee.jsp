<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: gray;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 450px;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 450px;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 0.5;
}


a {
  color: dodgerblue;
}


.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="EmpUpdateControll" method="post" align="center">
<h1>Update Employee</h1>

<input type="text" placeholder="EmpId" name="a">
<br>
<br>

<input type="text" placeholder="EmpName" name="b">
<br>
<br>

<input type="text" placeholder="EmpDept" name="c">
<br>
<br>

<input type="text" placeholder="EmpSalary" name="d">
<br>
<br>
<input class="registerbtn" type="submit" value="Update">
</form>
</body>
</html>