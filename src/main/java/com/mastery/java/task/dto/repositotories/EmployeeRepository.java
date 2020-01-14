package com.mastery.java.task.dto.repositotories;

import com.mastery.java.task.dto.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, Long>
{
    List<Employee> findByDepartmentId(String departmentId);
}
