package com.reachlynk.employee.service;

import com.reachlynk.employee.model.Employee;
import com.reachlynk.employee.repository.EmployeeRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;
    }

    // Retrieve all employees
    public List<Employee> getAllEmployees() {

        return employeeRepository.findAll();
    }

    // Add a new employee
    public Employee addEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

    // Delete employee by ID
    public void deleteEmployee(Long id) {

        employeeRepository.deleteById(id);
    }
}