<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplo 5</title>
</head>
<body>
<h3>Registro de empleados</h3>
<form action="proceso.jsp">
	<table>
		<tr>
			<td>Nombres</td>
			<td><input type="text" name="nombres" value=""></td>
		</tr>
		<tr>
			<td>Ocupación</td>
			<td><input type="text" name="ocupacion" value=""></td>
		</tr>
		<tr>
			<td>Sueldo</td>
			<td><input type="number" name="sueldo" value=""></td>
		</tr>
		<tr>
			<td><input type="submit" value="Aceptar"></td>
			<td></td>
		</tr>
	</table>
</form>
</body>
</html>