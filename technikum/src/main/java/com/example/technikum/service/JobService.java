package com.example.technikum.service;

import com.example.technikum.controller.Controller;
import com.example.technikum.model.Job;
import com.example.technikum.repository.JobRepository;
import com.example.technikum.utility.JobHelper;
import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.example.technikum.utility.Helper.randomBigDecimal;
import static com.example.technikum.utility.Helper.randomDate;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;

    @Autowired
    JobHelper jobHelper;
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    public List<Job> getJobs() {
        return jobRepository.findAll();
    }

    public Optional<Job> getJob(Long id) {
        return jobRepository.findById(id);
    }

    public void deleteJob(Long jobId) {
        jobRepository.deleteById(jobId);
    }
    public Job createJob(Job job) {
        return jobRepository.save(job);
    }

    public Job insertRandomJobs() {
        Faker faker = new Faker();

        for (int i = 0; i <= 100; i++) {
            logger.info("Last id: " + jobHelper.findLastId());

            jobRepository.save(
                    Job.builder()
                            .id(jobHelper.findLastId())
                            .title(faker.job().title())
                            .position(faker.job().position())
                            .field(faker.job().field())
                            .keySkills(faker.job().keySkills())
                            .applicationTime(randomDate())
                            .seniority(faker.job().seniority())
                            .salary(randomBigDecimal(6000))
                            .build()
            );
        }

        return null;
    }
}
