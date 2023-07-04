package proyectos.spring.rest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import proyectos.spring.modelo.Producto;

@RestController
@RequestMapping(path = "rest/procesos")
public class RestProducto {
	@GetMapping(path = "/lectura",
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Producto leer(@RequestParam(name= "tipo") 
				String dato) {
		Producto p=new Producto();
		if(dato.equalsIgnoreCase("TI")) {
			p.setCodigo(1);
			p.setNombre("Laptop HP");
			p.setCantidad(20);
			p.setPrecio(4500);
			p.setSuspendido(true);
		}else {
			p.setCodigo(20);
			p.setNombre("Impresora HP");
			p.setCantidad(50);
			p.setPrecio(1500);
			p.setSuspendido(false);
		}
		return p;
	}
}
