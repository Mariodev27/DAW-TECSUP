<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Reporte de datos</title>
</head>
<body>
<%-- Conexión --%>
<sql:setDataSource driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost/prueba"
	user="root" password="" var="conn" />
<%-- Consulta --%>
<sql:query var="data" sql="select * from empleados" 
	dataSource="${conn}"></sql:query>
<table>
	<tr>
		<th>Codigo</th>
		<th>Nombre</th>
		<th>Ocupación</th>
		<th>Sueldo</th>
		<th>Descuento</th>
	</tr>
	<c:forEach items="${data.rows}" var="x">
		<tr>
			<td><c:out value="${x.id}"></c:out></td>
			<td><c:out value="${x.nombres}"></c:out></td>
			<td><c:out value="${x.ocupacion}"></c:out></td>
			<td><c:out value="${x.sueldo}"></c:out></td>
			<td><c:out value="${x.descuento}"></c:out></td>
		</tr>
	</c:forEach>
</table>
</body>
</html>
