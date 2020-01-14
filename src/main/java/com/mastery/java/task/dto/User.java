package com.mastery.java.task.dto;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "usr")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long Id;
    private String username;
    private String password;
    private boolean active;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.EAGER)
    @CollectionTable(name="user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;
}