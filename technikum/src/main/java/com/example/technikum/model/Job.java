package com.example.technikum.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
@Entity
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NonNull
    @Column(name = "title")
    private String title;

    @NonNull
    @Column(name = "position")
    private String position;

    @NonNull
    @Column(name = "field")
    private String field;

    @NonNull
    @Column(name = "keySkills")
    private String keySkills;

    @NonNull
    @Column(name = "applicationTime")
    private LocalDate applicationTime;

    @Column(name = "seniority")
    private String seniority;

    @Column(name = "salary")
    private BigDecimal salary;

}
