<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultados de Busqueda</title>
<jsp:useBean id="info" type="modelo.Cliente" scope="request">
</jsp:useBean>
</head>
<body>
	<h3>Busqueda exitosa</h3>
	Codigo: <jsp:getProperty property="codigo" name="info"/><br><br>
	Nombre: <jsp:getProperty property="nombre" name="info"/><br><br>
	Sueldo: <jsp:getProperty property="sueldo" name="info"/><br><br>
	Número de hijos: <jsp:getProperty property="numhijos" name="info"/><br><br>
	<a href="busqueda.jsp">Nueva búsqueda</a>
</body>
</html>
