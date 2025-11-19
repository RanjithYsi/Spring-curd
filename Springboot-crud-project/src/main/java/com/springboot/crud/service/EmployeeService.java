package com.springboot.crud.service;

import java.util.List;

import com.springboot.crud.Entity.Employee;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Long id, Employee employee);

    Employee getEmployee(Long id);

    List<Employee> getAllEmployees();

    void deleteEmployee(Long id);
}
