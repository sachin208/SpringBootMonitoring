package com.crudspringbootmongodb2.service;

import com.crudspringbootmongodb2.Employee;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface Employeeservice {
    void createEmployee(List<Employee> emp);

    Collection<Employee> getAllEmployees();

    Optional<Employee> findEmployeeById(int id);

    void deleteEmployeeById(int id);

    void updateEmployee(Employee emp);

    void deleteAllEmployees();
}
