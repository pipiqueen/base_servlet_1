<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>La suma total</title>
</head>
<body>
<% String valor = (String)request.getParameter("parametro"); %>

<h1>La suma total es de <%=valor %></h1>

<a href= "index0.jsp"> al login de nuevo</a>
</body>

</html>