package com.mastery.java.task.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Map;

@Controller()
public class EmployeeController
{

    @GetMapping( "/app" )
    public String greeting(
        @RequestParam( name = "name", required = false, defaultValue = "Master" ) String name, Map<String, Object> model )
    {
        model.put( "name", name );
        return "greeting";
    }

    @GetMapping
    public String main(Map<String, Object> model){
        model.put( "some", "Let's code"  );
        return "main";
    }

}
