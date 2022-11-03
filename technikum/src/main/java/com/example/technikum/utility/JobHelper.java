package com.example.technikum.utility;

import com.example.technikum.model.Job;
import com.example.technikum.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobHelper {
    @Autowired
    JobRepository jobRepository;

    public Long findLastId() {
        List<Job> jobs = jobRepository.findAll();
        Long id = 0L;

        for (Job job : jobs) {
            decideCurrentId(job, id);
        }

        return jobs.size() == 0 ? 1L : id;
    }

    public static Long decideCurrentId(Job job, Long id) {
        if(job.getId() > id) {
            id = job.getId();
        }
        return id;
    }

}
