package com.mastery.java.task.rest;

import com.mastery.java.task.dto.Role;
import com.mastery.java.task.dto.User;
import com.mastery.java.task.dto.repositotories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Slf4j
@Controller
public class RegistrationController
{

    @Autowired
    private UserRepository userRepository;


    private Logger logger;

    @GetMapping( "/registration" )
    public String registration()
    {
        logger.debug("start");
        return "registration";
    }


    @PostMapping( "/registration" )
    public String addUser( User user, Map<String, Object> model )
    {

        User userFromDb = userRepository.findByUsername( user.getUsername() );

        if(userFromDb != null) {
            model.put( "message", "User exist!" );
            return "registration";
        }

        user.setActive( true );
        user.setRoles( Collections.singleton( Role.USER ) );
        userRepository.save( user );

        return "redirect:/login";
    }

}


