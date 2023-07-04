package aplicaciones.spring.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;
@Entity
@Table(name="CLIENTES")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		
	private Long id;
	@NotNull
	private String nombres;
	@NotNull
	private String apellidos;
	@NotNull
	private Integer ruc;
	@NotNull
	private Integer dni;
	@NotNull
	private String direccion;
		
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getNombres() {
			return nombres;
		}

		public void setNombres(String nombres) {
			this.nombres = nombres;
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		public Integer getRuc() {
			return ruc;
		}
		public void setRuc(Integer ruc) {
			this.ruc = ruc;
		}
		public Integer getDni() {
			return dni;
		}
		public void setDni(Integer dni) {
			this.dni = dni;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		@Override
		public String toString() {
			return "Cliente [id=" + id + ", nombres=" + nombres + ", apellidos=" + apellidos + ", ruc=" + ruc + ", dni=" + dni + ", direccion=" + direccion + "]";		}
}
