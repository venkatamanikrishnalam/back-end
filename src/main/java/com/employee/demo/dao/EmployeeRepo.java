package com.employee.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.demo.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee , Integer>{
	
	

}
