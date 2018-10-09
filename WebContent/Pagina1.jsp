<!DOCTYPE html>
<%!
private int valor1 = 1 ;
private int valor2 = 2 ;
private int valor3 = 3 ;
private int sumaTotal = 0 ;
%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>la suma de <%=valor1 %> + <%=valor2 %> + <%=valor3 %> es de: </title>
</head>
<body>

<%sumaTotal = valor1+ valor2+ valor3; %>
<h1>la suma total es de <%=sumaTotal %></h1>

<a href="Pagina2.jsp?parametro=<%=sumaTotal %>">Link</a>
</body>
</html>