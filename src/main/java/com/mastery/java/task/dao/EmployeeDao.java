package com.mastery.java.task.dao;

import com.mastery.java.task.dto.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDao implements EmployeeDaoInterface {
    @Override
    public List<Employee> findAll()
    {
        return null;
    }

    @Override
    public Optional<Employee> findById( Integer id )
    {
        return Optional.empty();
    }

    @Override
    public void update( Employee employee )
    { }

    @Override

    public void delete( Integer id )
    {
    }

    @Override
    public Employee create( Employee employee )
    {
        return null;
    }

}


