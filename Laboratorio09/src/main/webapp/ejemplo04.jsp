<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo 4 de JSTL</title>
</head>
<body>
	<h2> Uso de la etiqueta c:foreach </h2> 
	<h3> Realice un proceso cíclico </h3>
	
	<%-- Declaración de variables --%>
	<%-- Impresión de variables utilizando c:out --%>
	
	<hr>
	<c:out value="Manejo de bcules"></c:out>
	<hr>
	<c:forEach var="i" begin="1" end="20">
		Contador i: <c:out value="${ i }"></c:out><br>
	</c:forEach>
	<hr>
	
</body>
</html>