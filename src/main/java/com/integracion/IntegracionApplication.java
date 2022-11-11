package com.integracion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class IntegracionApplication {

    @Autowired
    private UserRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(IntegracionApplication.class, args);
    }

    @GetMapping(path = "/")
    public String listAll(Model model) {
        List<User> listUsers = repo.findAll();
        model.addAttribute("listUsers", listUsers);
        return "users" + listUsers;
    }

}
