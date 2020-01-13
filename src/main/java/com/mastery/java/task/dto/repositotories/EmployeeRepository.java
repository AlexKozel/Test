package com.mastery.java.task.dto.repositotories;

import com.mastery.java.task.dto.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long>
{

}
