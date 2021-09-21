package com.example.springSimplilearn.springDevOps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.example.springSimplilearn.springDevOps.Entity.Employee;
import com.example.springSimplilearn.springDevOps.service.EmployeeService;

@RestController
@RequestMapping("/springbootapp")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	 @PostMapping(value = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	   public Employee addEmployee(@RequestBody Employee employee) {		
		
		return employeeService.addEmployee(employee);
	}
	
	  @GetMapping(value = "/employee", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> loadEmployee(){
		return employeeService.loadAllEmployee();
	}

}
