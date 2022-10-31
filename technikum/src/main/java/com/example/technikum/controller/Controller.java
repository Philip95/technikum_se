package com.example.technikum.controller;

import com.example.technikum.service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Controller {

    @Autowired
    private Services services;

}
