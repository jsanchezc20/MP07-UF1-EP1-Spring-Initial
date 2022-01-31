package cat.ilg.daw.m7.uf1.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    @RequestMapping("/")
    String helloWorld() {
        return "HELLO WORLD";
    }

    @RequestMapping("/{userName}")
    String helloWorld(
            @PathVariable(name="userName") String userName) throws Exception {
        return "Hello, " + userName;
    }

}