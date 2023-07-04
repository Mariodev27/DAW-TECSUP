package com.empresa.proyecto;

import com.empresa.proyecto.Empleado;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Libreria {
    private Connection conexion;

    public Libreria() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/empresa";
            String user = "root";
            String password = "";
            conexion = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public void agregarEmpleado(Empleado empleado) {
        try {
			String query = "INSERT INTO empleado (emp_codigo, emp_apellidos, emp_nombres, emp_sueldo, emp_cargo) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setInt(1, empleado.getCodigo());
            statement.setString(2, empleado.getApellidos());
            statement.setString(3, empleado.getNombres());
            statement.setBigDecimal(4, empleado.getSueldo());
            statement.setString(5, empleado.getCargo());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Empleado> obtenerEmpleados() {
        List<Empleado> empleados = new ArrayList<>();
        try {
            String query = "SELECT * FROM empleado";
            PreparedStatement statement = conexion.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int codigo = resultSet.getInt("emp_codigo");
                String apellidos = resultSet.getString("emp_apellidos");
                String nombres = resultSet.getString("emp_nombres");
                BigDecimal sueldo = resultSet.getBigDecimal("emp_sueldo");
                String cargo = resultSet.getString("emp_cargo");
                Empleado empleado = new Empleado(codigo, apellidos, nombres, sueldo, cargo);
                empleados.add(empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleados;
    }

    public List<Empleado> buscarEmpleadosPorApellido(String apellido) {
        List<Empleado> empleados = new ArrayList<>();
        try {
            String query = "SELECT * FROM empleado WHERE emp_apellidos LIKE ?";
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, "%" + apellido + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int codigo = resultSet.getInt("emp_codigo");
                String apellidos = resultSet.getString("emp_apellidos");
                String nombres = resultSet.getString("emp_nombres");
                BigDecimal sueldo = resultSet.getBigDecimal("emp_sueldo");
                String cargo = resultSet.getString("emp_cargo");
                Empleado empleado = new Empleado(codigo, apellidos, nombres, sueldo, cargo);
                empleados.add(empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empleados;
    }

    public void cerrarConexion() {
        try {
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
