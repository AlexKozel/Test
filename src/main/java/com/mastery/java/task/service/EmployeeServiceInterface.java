package com.mastery.java.task.service;

import com.mastery.java.task.dto.Employee;

import java.util.List;

public interface EmployeeServiceInterface
{

    List <Employee> findAll();

    Employee findById(Integer id);

    void update(Employee employee);

    void delete(Integer id);

    Employee create(Employee employee);



}


