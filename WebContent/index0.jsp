<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "LoginServlet" method="POST">
<label for = "usuario" >usuario </label> <input type = "text" name = "usuario"><br>

<label for = "contrasenia">contrasenia</label> <input type = "text" name = "contrasenia"><br>

<input type = "submit">
<a href = "Logout.jsp"> Logout</a>
</form>

</body>
</html>