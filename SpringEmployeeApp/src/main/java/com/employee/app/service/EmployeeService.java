package com.employee.app.service;

import java.util.List;

import com.employee.app.entities.Employee;


public interface EmployeeService {
	
	// list of employee
	public List<Employee> getEmployee();
	
	// find employee by id 
	public Employee getEmployee(long empid);
	
	// add employee
	public Employee addEmployee(Employee emp);
	
	// update employee
	public Employee updateEmployee(Employee emp);
	
	// delete employee 
	public void deleteEmployee(long empid);
	
	
	
	

}
