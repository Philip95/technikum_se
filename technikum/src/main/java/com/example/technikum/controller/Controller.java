package com.example.technikum.controller;

import com.example.technikum.model.Job;
import com.example.technikum.service.JobService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/job/{jobId}")
    public Optional<Job> getJobById(@PathVariable(value = "jobId") Long id) {
        return service.getJob(id);
    }

    @RequestMapping(value="/jobs/{jobId}", method=RequestMethod.DELETE)
    public void deleteEmployees(@PathVariable(value = "jobId") Long id) {
        service.deleteJob(id);
    }

}
