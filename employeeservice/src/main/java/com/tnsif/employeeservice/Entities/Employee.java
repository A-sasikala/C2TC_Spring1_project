package com.tnsif.employeeservice.Entities;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "emp_id")
    private int empId;

    @Column(name = "emp_name")
    private String empName;

    @Column(name = "emp_email")
    private String empEmail;

    @Column(name = "emp_department")
    private String empDepartment;

    @Column(name = "emp_salary")
    private double empSalary;

    @Column(name = "emp_designation")
    private String empDesignation;
    
    @Column(name = "emp_age")
    private int empAge;

    public Employee() {}

    public Employee(int empId, String empName, String empEmail, String empDepartment,
                    double empSalary, String empDesignation, int empAge) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
        this.empDesignation = empDesignation;
        this.empAge = empAge;
    }

    // Getters & Setters
    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }

    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }

    public String getEmpEmail() { return empEmail; }
    public void setEmpEmail(String empEmail) { this.empEmail = empEmail; }

    public String getEmpDepartment() { return empDepartment; }
    public void setEmpDepartment(String empDepartment) { this.empDepartment = empDepartment; }

    public double getEmpSalary() { return empSalary; }
    public void setEmpSalary(double empSalary) { this.empSalary = empSalary; }

    public String getEmpDesignation() { return empDesignation; }
    public void setEmpDesignation(String empDesignation) { this.empDesignation = empDesignation; }
    
    public int getEmpAge() { return empAge; }
    public void setEmpAge(int empAge) { this.empAge = empAge; }

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empDepartment="
				+ empDepartment + ", empSalary=" + empSalary + ", empDesignation=" + empDesignation + ", empAge="
				+ empAge + "]";
	}
	
}