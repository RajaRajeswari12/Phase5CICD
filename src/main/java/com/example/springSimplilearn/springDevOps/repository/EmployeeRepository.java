package com.example.springSimplilearn.springDevOps.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springSimplilearn.springDevOps.Entity.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
