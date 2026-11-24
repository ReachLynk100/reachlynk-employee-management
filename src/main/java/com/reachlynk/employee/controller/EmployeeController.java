package com.reachlynk.employee.controller;

import com.reachlynk.employee.model.Employee;
import com.reachlynk.employee.service.EmployeeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {

        this.employeeService = employeeService;
    }

    // Display employee dashboard
    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute(
            "employees",
            employeeService.getAllEmployees()
        );

        model.addAttribute(
            "employee",
            new Employee()
        );

        return "employees";
    }

    // Add employee
    @PostMapping("/employees")
    public String addEmployee(
            @ModelAttribute Employee employee) {

        employeeService.addEmployee(employee);

        return "redirect:/";
    }

    // Delete employee
    @PostMapping("/employees/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {

        employeeService.deleteEmployee(id);

        return "redirect:/";
    }
}