package com.employee.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.app.entities.Employee;
import com.employee.app.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	 // list of employee 
	@GetMapping("/employee")
	public List<Employee>  getEmployee(){
		
		return employeeservice.getEmployee();
	}
	
	// find one employee by id 
	@GetMapping("/employee{id}")
	public Employee getEmployee(@PathVariable long id) {
		
		return employeeservice.getEmployee(id);
		
	}
	
	// add employee
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee emp) {
		
		return employeeservice.addEmployee(emp);
				
	}
	
	
	// update the employee 
	
	@PutMapping("/employee")
	 public  Employee updateEmployee (@RequestBody Employee emp) {
		 
		return employeeservice.updateEmployee(emp);
		
	 }

	// delete employee 
	
	@DeleteMapping("/employee{id}")
	 public void deleteEmployee (@PathVariable long id) {
		 
		employeeservice.deleteEmployee(id);
		
	 }
	
	
	
}
