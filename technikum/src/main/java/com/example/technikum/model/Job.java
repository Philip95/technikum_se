package com.example.technikum.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long job_id;

    @NonNull
    @Column(name = "title")
    private String job_title;

    @NonNull
    @Column(name = "position")
    private String job_position;

    @NonNull
    @Column(name = "field")
    private String job_field;

    @NonNull
    @Column(name = "keySkills")
    private String job_keySkills;

    @NonNull
    @Column(name = "applicationTime")
    private Date job_applicationTime;

    @Column(name = "seniority")
    private String job_seniority;

    @Column(name = "salary")
    private BigDecimal job_salary;

}
