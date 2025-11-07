package com.tnsif.employeeservice.Service;
//package com.tnsif.EmployeeService.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.employeeservice.Entities.Employee;
import com.tnsif.employeeservice.Repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repo;

    // Get all employees
    public List<Employee> listAll() {
        return repo.findAll();
    }

    // Get by ID
    public Employee getById(int id) {
        Optional<Employee> emp = repo.findById(id);
        return emp.orElse(null);
    }

    // Add new employee
    public Employee addEmployee(Employee emp) {
        return repo.save(emp);
    }

    // Update existing employee
    public Employee updateEmployee(Employee emp) {
        return repo.save(emp);
    }

    // Delete by ID
    public void deleteEmployee(int id) {
        repo.deleteById(id);
    }
}
