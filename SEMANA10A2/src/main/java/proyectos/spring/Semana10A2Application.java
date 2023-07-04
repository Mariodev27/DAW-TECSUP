package proyectos.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Semana10A2Application implements CommandLineRunner{
	@Autowired
	public Servicio serv;
	public static void main(String[] args) {
		
		SpringApplication x=new SpringApplication(Semana10A2Application.class);
		x.run();
	}

	@Override
	public void run(String... args) throws Exception {
		if(args.length>0) {
			System.out.println(serv.mensaje(args[0]));
		}else {
			System.out.println(serv.mensaje());
		}
		
	}
}
