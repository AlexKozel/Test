package com.mastery.java.task.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.*;

@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;

    @NonNull
    @NotNull
    private String firstName;

    @NonNull
    @NotNull
    private String lastName;

    @NonNull
    private String departmentId;

    @NonNull
    private String job_title;

    @NonNull
    private String gender;

    @NonNull
    private String date_of_birth;
}
