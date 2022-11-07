package com.integracion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class IntegracionApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegracionApplication.class, args);
    }

    @GetMapping(path = "/")
    public String sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
        return "Hello " + name;
    }
}
