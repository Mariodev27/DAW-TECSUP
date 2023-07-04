package proyectos.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatosPersonalesController {

    @GetMapping("/")
    public String obtenerDatosPersonales() {
    	String titulo = "Mostrando los datos por web";
    	String nombre = "Mario";
        String apellidos = "Santisteban Alcántara";
        String direccion = "TECSUP -LIMA";
        String telefono = "999-999-999";
        
//        Aqui se muestra mediante interfaz
//        return "Titulo: " + titulo + "<br>" + "<br>" +
//        		 "Nombre: " + nombre + "<br>" + "<br>" +
//        	     "Apellidos: " + apellidos + "<br>" + "<br>" +
//               "Dirección: " + direccion + "<br>" + "<br>" +
//               "Teléfono: " + telefono;
        
//      Aqui se muestra mediante consola
        System.out.println("Titulo: " + titulo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);

        return "Datos mostrados por consola";
    }
}

