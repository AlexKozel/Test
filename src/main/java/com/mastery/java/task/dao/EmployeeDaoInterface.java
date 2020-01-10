package com.mastery.java.task.dao;

import com.mastery.java.task.dto.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDaoInterface
{
    /**
     * Find all
     * @return list
     */
    List<Employee> findAll();

    /**
     * Find by employee id
     * @param id
     * @return employee
     */
    Optional<Employee> findById(Integer id);

    /**
     * Update employee
     * @param employee
     */
    void update(Employee employee);

    /**
     * delete employee by id
     * @param id
     */
    void delete(Integer id);

    /**
     * create employee
     * @param employee
     * @return
     */
    Employee create(Employee employee);
}
