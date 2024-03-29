package proyectos.spring.modelo;

import java.io.Serializable;

public class Empleado implements Serializable{
	private static final long serialVersionUID = -1895891798799202530L;
    private int codigo;
    private String nombre;
    private String apellido;
    private String puesto;
 
    // Getters y Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
    
}