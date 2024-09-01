package com.employee.demo.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.dao.EmployeeRepo;
import com.employee.demo.model.Employee;
import com.questions.quiz.entity.Quiz;
import com.questions.quiz.service.QuizService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
		@GetMapping("/allemployees")
		@ResponseBody
		public  List<Employee> getAllEmployees() {
			
			return employeeRepo.findAll();
		}
		
		@PostMapping("/addemployee")
		@ResponseBody
		public Employee addEmployee(@RequestBody Employee employee) {
			 
			return employeeRepo.save(employee);
		}

		@GetMapping("/getEmployee/{id}")
		public  Optional<Employee> getQuestion(@PathVariable Integer id) {
	
			Optional<Employee> e=employeeRepo.findById(id);
			
			return e;
		}
		
		@SuppressWarnings("deprecation")
		@PutMapping("/updateemployee/{id}")
		@ResponseBody
		public Employee updateEmployee(@PathVariable Integer id,@RequestBody Employee employee) {
			Employee e=employeeRepo.getById(id);
			e.setFirstName(employee.getFirstName());
			e.setLastName(employee.getLastName());
			e.setEmailId(employee.getEmailId());

			return employeeRepo.save(e);
		}
		
		}
		
