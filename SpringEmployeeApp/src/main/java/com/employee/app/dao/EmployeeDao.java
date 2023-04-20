package com.employee.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.app.entities.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

}
