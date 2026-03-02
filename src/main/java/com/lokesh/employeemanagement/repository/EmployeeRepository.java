package com.lokesh.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lokesh.employeemanagement.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
