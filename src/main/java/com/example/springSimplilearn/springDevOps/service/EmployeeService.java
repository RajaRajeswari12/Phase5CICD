package com.example.springSimplilearn.springDevOps.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springSimplilearn.springDevOps.Entity.Employee;
import com.example.springSimplilearn.springDevOps.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;

	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}
	
	public List<Employee> loadAllEmployee(){
		return (List<Employee>) employeeRepo.findAll();
	}
	
}
