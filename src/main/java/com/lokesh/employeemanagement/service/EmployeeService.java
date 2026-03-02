package com.lokesh.employeemanagement.service;

import java.util.List;
import com.lokesh.employeemanagement.model.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    List<Employee> getAllEmployees();
    
    Employee getEmployeeById(Long id);
    
    Employee updateEmployee(Long id, Employee employee);
    
    void deleteEmployee(Long id);
}
