<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>Procesando datos</title>
</head>
<body>
	<c:set var="nom" value="${param.nombres}"></c:set>
	<c:set var="ocu" value="${param.ocupacion}"></c:set>
	<c:set var="sue" value="${param.sueldo}"></c:set>
	<c:set var="dcto" value="${sue*0.10}"></c:set>
	<h3>Reporte de empleado</h3>
	Nombres: ${nom} <br>
	Ocupación: ${ocu} <br>
	Sueldo: ${sue} <br>
	Descuento: ${dcto} <br>
</body>
</html>