package proyectos.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Servicio {
	@Value("${nombre:desconocido}")
	public String nombre;
	
	public String mensaje() {
		return mensaje(this.nombre);
	}
	
	public String mensaje(String nombre) {
		return "Bienvenido: "+nombre;
	}
}