package com.mastery.java.task.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@RequiredArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long employeeId;

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private String departmentId;

    @NonNull
    private String job_title;

    @NonNull
    private String gender;

    @NonNull
    private String date_of_birth;

    @NonNull
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;

    public String getAuthorName(){
        return author != null ? author.getUsername() : "No user";
    }
}
