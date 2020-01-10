package com.mastery.java.task.service;

import com.mastery.java.task.dao.EmployeeDao;
import com.mastery.java.task.dto.Employee;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface{

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);

    private EmployeeDao employeeDao;

    public EmployeeService( EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> findAll()
    {
        LOGGER.debug("find all employees");
        return employeeDao.findAll();
    }

    @Override
    public Employee findById( Integer id )
    {
        LOGGER.debug("Find by id({})", id);
        return employeeDao.findById( id ).orElseThrow( () -> new RuntimeException( "There are no employee with this id") );
    }

    @Override
    public void update( Employee employee )
    {
        LOGGER.debug("update ({})", employee);
        employeeDao.update( employee );
    }

    @Override
    public void delete( Integer id )
    {
        LOGGER.debug("delete({})", id);
        employeeDao.delete( id );
    }

    @Override
    public Employee create( Employee employee )
    {
        LOGGER.debug("create employee");
        return employeeDao.create( employee );
    }
}
