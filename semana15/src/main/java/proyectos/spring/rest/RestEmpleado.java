package proyectos.spring.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import proyectos.spring.modelo.Empleado;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path = "api/empleado")
public class RestEmpleado {
	@GetMapping(path = "/obtener",
			produces = MediaType.APPLICATION_JSON_VALUE)
	 public @ResponseBody Empleado obtenerEmpleado(@RequestParam(name = "codigo")
	 String codigo) {
		Empleado emp = new Empleado();
		if (codigo.equalsIgnoreCase("TI")) {
		    emp.setCodigo(1);
		    emp.setNombre("Juan");
		    emp.setApellido("Pérez");
		    emp.setPuesto("Gerente");
		} else if (codigo.equalsIgnoreCase("RRHH")) {
		    emp.setCodigo(2);
		    emp.setNombre("María");
		    emp.setApellido("López");
		    emp.setPuesto("Analista");
		} else if (codigo.equalsIgnoreCase("VENTAS")) {
		    emp.setCodigo(3);
		    emp.setNombre("Pedro");
		    emp.setApellido("Gómez");
		    emp.setPuesto("Vendedor");
		} else {
		    emp.setCodigo(4);
		    emp.setNombre("Ana");
		    emp.setApellido("Martínez");
		    emp.setPuesto("Asistente");
		}

		return emp;
	 }
}
