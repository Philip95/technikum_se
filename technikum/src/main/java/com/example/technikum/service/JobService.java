package com.example.technikum.service;

import com.example.technikum.model.Job;
import com.example.technikum.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;

    public List<Job> getJobs() {
        return jobRepository.findAll();
    }

    public void deleteJob(Long jobId) {
        jobRepository.deleteById(jobId);
    }
    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    public Job updateEmployee(Long jobId, Job employeeDetails) {
        Job emp = jobRepository.findById(jobId).get();

        return jobRepository.save(emp);
    }

}
