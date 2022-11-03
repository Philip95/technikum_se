package com.example.technikum.controller;

import com.example.technikum.model.Job;
import com.example.technikum.service.JobService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    @Autowired
    private JobService service;

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping("/jobs")
    public List<Job> getAllJobs() {
        return service.getJobs();
    }

    @GetMapping("/randomJobs")
    public Job insertRandomJobs() {
        return service.insertRandomJobs();
    }


    @RequestMapping(value="/hello", method= RequestMethod.GET)
    public String hello() {
        return "Hello";
    }

}
