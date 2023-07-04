<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrar Empleado</title>
</head>
<body>
	<h1>Registrar Empleado</h1>
	<form method="post" action="registrarEmpleadoController.jsp">
		<label>Código:</label>
		<input type="text" name="codigo"><br>
		<label>Apellidos:</label>
		<input type="text" name="apellidos"><br>
		<label>Nombres:</label>
		<input type="text" name="nombres"><br>
		<label>Sueldo:</label>
		<input type="text" name="sueldo"><br>
		<label>Cargo:</label>
		<input type="text" name="cargo"><br>
		//Registrar
		<input type="submit" value="Registrar">
	</form>
</body>
</html>