package com.tnsif.employeeservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.employeeservice.Entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // JPA provides all CRUD methods automatically
}
