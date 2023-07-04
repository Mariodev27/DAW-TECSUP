package proyectos.spring.db;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class AccesoDB {
	public JdbcTemplate conn;
	public String driver="com.mysql.cj.jdbc.Driver";
	public String cadena="jdbc:mysql://localhost:3306/inventario1";
	public String usuario="root";
	public String clave="";
	public JdbcTemplate obtenerConexion() {
		DriverManagerDataSource dm=new DriverManagerDataSource();
		dm.setDriverClassName(driver);
		dm.setUrl(cadena);
		dm.setUsername(usuario);
		dm.setPassword(clave);
		conn = new JdbcTemplate(dm);
		return conn;
	}
}

