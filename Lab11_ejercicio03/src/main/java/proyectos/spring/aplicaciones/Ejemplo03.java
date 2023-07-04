package proyectos.spring.aplicaciones;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import proyectos.spring.db.AccesoDB;

@RestController
@RequestMapping(value = "/semana11/base")
public class Ejemplo03 {
	@RequestMapping(value = "/consulta1",
					method = RequestMethod.GET)
	
	public List consulta1() {
		AccesoDB a=new AccesoDB();
		JdbcTemplate jdbc=a.obtenerConexion();
		String sql="select * from producto";
		List data=jdbc.queryForList(sql);
		return data;
	}
	@RequestMapping(value = "/consulta2",
					method = RequestMethod.GET)
	public String consulta2() {
		AccesoDB a=new AccesoDB();
		JdbcTemplate jdbc=a.obtenerConexion();
		String sql="select count(codigo) from producto";
		int numero = jdbc.queryForObject(sql, Integer.class);
		return "Numero de productos: " + numero;
	}
}
