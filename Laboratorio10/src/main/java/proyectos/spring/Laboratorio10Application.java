package proyectos.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Laboratorio10Application implements CommandLineRunner{
	@Autowired
	public Servicio1 serv;
	public static void main(String[] args) {
		
		SpringApplication x=new SpringApplication(Laboratorio10Application.class);
		x.run();
	}
//	con esto mostramos producto
//	@SpringBootApplication
//	public class Laboratorio10Application {
//	    public static void main(String[] args) {
//	        SpringApplication.run(Laboratorio10Application.class, args);
//	    }
//	}
	
	@Override
	public void run(String... args) throws Exception {
//		con esto mostramos un mensaje con condicionales mediante interfaz
//		if(args.length>0) {
//			System.out.println(serv.mensaje(args[0]));
//		}else {
//			System.out.println(serv.mensaje());
//		}
		
		System.out.println("Datos personales:");
        System.out.println("Nombre: " + serv.getNombres());
        System.out.println("Apellidos: " + serv.getApellidos());
        System.out.println("Dirección: " + serv.getDireccion());
        System.out.println("Teléfono: " + serv.getTelefono());
	}
}