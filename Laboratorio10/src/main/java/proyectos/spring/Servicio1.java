package proyectos.spring;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Servicio1 {
	@Value("${nombres:Mario}")
    public String nombre;
    
    @Value("${apellidos:Santisteban Alcántara}")
    public String apellidos;
    
    @Value("${direccion:TECSUP -LIMA}")
    public String direccion;
    
    @Value("${telefono:999-999-999}")
    public String telefono;

    public String getNombres() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public String getTelefono() {
        return telefono;
    }
}
