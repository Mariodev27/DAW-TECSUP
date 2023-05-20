<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="com.empresa.proyecto.Empleado, com.empresa.proyecto.Libreria" %>
	<%@ page import="java.math.BigDecimal" %>
	
	
<%
	// Obtener los datos del formulario
	int codigo = Integer.parseInt(request.getParameter("codigo"));
	String apellidos = request.getParameter("apellidos");
	String nombres = request.getParameter("nombres");
	BigDecimal sueldo = BigDecimal.valueOf(Double.parseDouble(request.getParameter("sueldo")));
	String cargo = request.getParameter("cargo");

	// Crear el objeto Empleado
	Empleado empleado = new Empleado(codigo, apellidos, nombres, sueldo, cargo);

	// Llamar al método agregarEmpleado de la clase Libreria
	Libreria libreria = new Libreria();
	libreria.agregarEmpleado(empleado);

	// Mostrar mensaje de confirmación
	out.println("El empleado ha sido registrado correctamente.");
%>
	
</body>
</html>