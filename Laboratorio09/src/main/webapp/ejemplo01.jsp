<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo 1 de JSTL</title>
</head>
<body>
	<h2>Uso de la etiqueta c:out</h2> 
	<h3> Declare variables e imprima </h3>
	
	<%-- Declaración de variables --%>
	<c:set var="nombre" value="Mario Santisteban" />
	<c:set var="edad" value="19" />

	<%-- Impresión de variables utilizando c:out --%>
	<p>Nombre: <c:out value="${nombre}" /></p>
	<p>Edad: <c:out value="${edad}" /></p>
</body>
</html>