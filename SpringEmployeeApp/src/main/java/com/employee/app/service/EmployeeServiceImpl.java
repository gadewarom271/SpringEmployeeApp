package com.employee.app.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.app.dao.EmployeeDao;
import com.employee.app.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeedao;
	
	// list of employee
	@Override
	public List<Employee> getEmployee() {
		
		return employeedao.findAll();
	}

	// find employee by id 
	@Override
	public Employee getEmployee(long empid) {
		
		return employeedao.getOne(empid);
		
	}

	// add employee 
	@Override
	public Employee addEmployee(Employee emp) {
		
		return employeedao.save(emp);
	}

	// update employee by id 
	@Override
	public Employee updateEmployee(Employee emp) {
		
		return employeedao.save(emp);
	}

	// delete employee 
	
	@Override
	public void deleteEmployee(long empid) {
		
		  Employee e = employeedao.getOne(empid);
		  
		  employeedao.delete(e);
		
	}

}
