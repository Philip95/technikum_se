package com.example.technikum.controller;

import com.example.technikum.service.Services;
import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private Services services;
    private static final Logger logger
            = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/helloPokemon")
    public String fakcer() {
        Faker faker = new Faker();
        String name = faker.pokemon().name();
        logger.info("Name des Pokemon:" + name);
        return "Hallo," + name;
    }

}
