package com.mastery.java.task.dto.repositotories;

import com.mastery.java.task.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String userName);

}

