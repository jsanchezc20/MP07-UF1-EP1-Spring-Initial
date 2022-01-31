package cat.ilg.daw.m7.uf1;

import cat.ilg.daw.m7.uf1.controller.HelloWorldController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ep1Application {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldController.class, args);
    }

}
