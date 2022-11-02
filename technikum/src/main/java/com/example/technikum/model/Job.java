package com.example.technikum.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@RequiredArgsConstructor
@ToString
@Getter
@Entity
@Table(name = "job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private Long id;

    @NonNull
    @Column(name = "job_title")
    private String title;

    @NonNull
    @Column(name = "job_position")
    private String position;

    @NonNull
    @Column(name = "job_field")
    private String field;

    @NonNull
    @Column(name = "job_keySkills")
    private String keySkills;

    @NonNull
    @Column(name = "job_applicationTime")
    private Date applicationTime;

    @Column(name = "job_seniority")
    private String seniority;

    @Column(name = "job_salary")
    private BigDecimal salary;

}
