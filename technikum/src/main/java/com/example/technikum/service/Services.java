package com.example.technikum.service;

import com.example.technikum.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {

    @Autowired
    private Repo repo;

}
