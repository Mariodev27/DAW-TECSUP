package com.empresa.proyecto;

import java.math.BigDecimal;


public class Empleado {
    private int codigo;
    private String apellidos;
    private String nombres;
    private BigDecimal sueldo;
    private String cargo;

    public Empleado(int codigo, String apellidos, String nombres, BigDecimal sueldo, String cargo) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    // getters y setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
