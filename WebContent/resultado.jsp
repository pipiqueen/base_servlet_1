<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultado</title>
</head>
<body>
	<c:if test="${not empty magio}">

		<c:set var="das">Hay datos</c:set>

		<table>

			<c:forEach var="varLocal" items="${magio}">

				<tr>

					<td>nombre: ${varLocal.nombre}</td>

					<td>dni: ${varLocal.dni}</td>

				</tr>

			</c:forEach>

		</table>

	</c:if>

	<p>${das}</p>
	<c:choose>
		<c:when test="${not empty magio}">
			<jsp:include page="Menu.jsp">
				<jsp:param value="esto es un menu. array tiene datos" name="texto" />
			</jsp:include>
		</c:when>
		<c:otherwise>
			<jsp:include page="Menu.jsp">
				<jsp:param value="HOla, esto es un menu" name="texto" />

			</jsp:include>
		</c:otherwise>
	</c:choose>
	<c:out value="${param.texto}" default="no hay texto"/>
</body>
</html>


