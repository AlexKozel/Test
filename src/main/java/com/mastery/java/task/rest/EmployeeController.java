package com.mastery.java.task.rest;

import com.mastery.java.task.dto.Employee;
import com.mastery.java.task.dto.repositotories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller()
public class EmployeeController
{

    @Autowired
    private EmployeeRepository repository;

    @GetMapping( "/app" )
    public String greeting(
        @RequestParam( name = "name", required = false, defaultValue = "Master" ) String name, Map<String, Object> model )
    {
        model.put( "name", name );
        return "greeting";
    }

    @GetMapping
    public String main( Map<String, Object> model )
    {
        Iterable<Employee> employees = repository.findAll();
        model.put( "employees", employees );
        return "main";
    }

    @PostMapping
    public String add(
        @RequestParam String firstName,
        @RequestParam String lastName,
        @RequestParam String departmentId,
        @RequestParam String job_title,
        @RequestParam String gender,
        @RequestParam String date_of_birth, Map<String, Object> model ){
        Employee employee = new Employee( firstName, lastName, departmentId, job_title, gender, date_of_birth);
        repository.save( employee );

        Iterable<Employee> employees = repository.findAll();
        model.put( "employees", employees );
        return "main";
    }

}
