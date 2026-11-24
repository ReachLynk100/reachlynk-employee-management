package com.reachlynk.employee.repository;

import com.reachlynk.employee.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {

}