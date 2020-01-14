package com.mastery.java.task.rest;

import com.mastery.java.task.dto.Employee;
import com.mastery.java.task.dto.User;
import com.mastery.java.task.dto.repositotories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class EmployeeController
{
    @Autowired
    private EmployeeRepository repository;

    @GetMapping( "/" )
    public String greeting( String name, Map<String, Object> model )
    {
        return "greeting";
    }

    @GetMapping("/main")
    public String main( Map<String, Object> model )
    {
        Iterable<Employee> employees = repository.findAll();
        model.put( "employees", employees );
        return "main";
    }

    @PostMapping("/main")
    public String add(
            @AuthenticationPrincipal User user,
        @RequestParam String firstName,
        @RequestParam String lastName,
        @RequestParam String departmentId,
        @RequestParam String job_title,
        @RequestParam String gender,
        @RequestParam String date_of_birth, Map<String, Object> model )
    {
        Employee employee = new Employee( firstName, lastName, departmentId, job_title, gender, date_of_birth, user );
        repository.save( employee );

        Iterable<Employee> employees = repository.findAll();
        model.put( "employees", employees );
        return "main";
    }

    @PostMapping( "filter" )
    public String filter( @RequestParam String filter, Map<String, Object> model )
    {
        Iterable<Employee> employees;
        if( filter != null && !filter.isEmpty() )
        {
            employees = repository.findByDepartmentId( filter );
        }
        else
        {
            employees = repository.findAll();
        }
        model.put( "employees", employees );
        return "main";
    }

    @PostMapping("delete")
    public String delete(@RequestParam Long id, Map<String, Object> model){
        repository.deleteById( id );
        model.put( "employees", repository.findAll() );
        return "main";
    }
}
