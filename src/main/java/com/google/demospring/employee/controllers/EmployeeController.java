package com.google.demospring.employee.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.demospring.employee.model.Employee;
import com.google.demospring.employee.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	
	@GetMapping(value = "/employee/all")
	public List<Employee> getAllEmployee() {
		return new ArrayList<Employee>();
	}
	
	
	@PostMapping(value="/employee/save")
	public Employee saveEmployee(@RequestBody Employee employee ) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping(value = "/employee/{id}")
	public String getEmployeeById(@PathVariable Integer id) {
		return "Bhagya with id" + id;
	}
		
}
