package com.google.demospring.employee.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.demospring.employee.dao.EmployeeDAO;
import com.google.demospring.employee.helper.EmployeeHelper;
import com.google.demospring.employee.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Autowired
	private EmployeeHelper employeeHelper;
	
	
	public EmployeeService() {
		System.out.println("EmployeeService");
	}
	
	public Employee saveEmployee(Employee employee) {
		System.out.println(employeeDAO);
		System.out.println(employeeHelper);
		return employee;
	}
	public Employee getEmployeeById(int id) {
//		System.out.println(employeeDAO);
//		System.out.println(employeeHelper);
		
		return employeeDAO.getEmployeeById(id);
	}

}
