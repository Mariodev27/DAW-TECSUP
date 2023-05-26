<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo 2 de JSTL</title>
</head>
<body>
	<h2>Uso de la etiqueta c:if</h2> 
	<h3> Declare variables, evalúe y muestre resultados </h3>
	
	<%-- Declaración de variables --%>
	<%-- Impresión de variables utilizando c:out --%>
	<c:set var="mensaje" value="Ejemplo de JSTL"></c:set>
	<c:out value="${mensaje}"></c:out>
	<hr>
	<c:out value="Evaluación de variables"></c:out>
	<hr>
	<c:set var="x" value="${5+5}"></c:set>
	<c:set var="y" value="${5*5}"></c:set>
	<c:if test="${x>y}">X es mayor a Y</c:if>
	<c:if test="${x<y}">X es menor a Y</c:if>
	<c:if test="${x==y}">X es menor a Y</c:if>
	<hr>
</body>
</html>