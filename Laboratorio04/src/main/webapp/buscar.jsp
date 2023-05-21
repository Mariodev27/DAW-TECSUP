<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Buscar Empleados por Apellidos</title>
</head>
<body>
	<%@ page import="com.empresa.proyecto.Empleado, com.empresa.proyecto.Libreria" %>
	<%@ page import="java.util.List" %>
	
	<h1>Buscar Empleados por Apellidos</h1>

<%-- Formulario para ingresar el apellido --%>
<form action="buscar.jsp" method="get">
	<label>Ingrese apellido: </label>
	<input type="text" name="apellido">
	<input type="submit" value="Buscar">
</form>

<%-- Si se ha realizado una búsqueda, mostrar resultados --%>
<% if (request.getParameter("apellido") != null) { %>
	<%
		// Obtener el apellido buscado
		String apellido = request.getParameter("apellido");
		
		// Importar la clase Libreria y crear un objeto
		// de dicha clase para realizar la búsqueda
		Libreria libreria = new Libreria();
		List<Empleado> empleados = libreria.buscarEmpleadosPorApellido(apellido);
	%>
	
	<%-- Mostrar resultados --%>
	<% if (!empleados.isEmpty()) { %>
		<table>
			<thead>
				<tr>
					<th>Código</th>
					<th>Apellidos</th>
					<th>Nombres</th>
					<th>Sueldo</th>
					<th>Cargo</th>
				</tr>
			</thead>
			<tbody>
				<% for (Empleado empleado : empleados) { %>
					<tr>
						<td><%= empleado.getCodigo() %></td>
						<td><%= empleado.getApellidos() %></td>
						<td><%= empleado.getNombres() %></td>
						<td><%= empleado.getSueldo() %></td>
						<td><%= empleado.getCargo() %></td>
					</tr>
				<% } %>
			</tbody>
		</table>
	<% } else { %>
		<p>No se encontraron resultados para el apellido ingresado.</p>
	<% } %>
<% } %>

<%-- Link para volver al menú principal --%>
<a href="menu.jsp">Volver al Menú Principal</a>
	
</body>
</html>