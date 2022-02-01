package cat.daw.uf1.m7.ep1Maven;

import cat.daw.uf1.m7.ep1Maven.controller.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ep1MavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldController.class, args);
	}

}
