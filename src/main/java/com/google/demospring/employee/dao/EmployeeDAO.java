package com.google.demospring.employee.dao;

import org.springframework.stereotype.Repository;

import com.google.demospring.employee.model.Employee;

@Repository
public class EmployeeDAO {
	Employee e;
	public EmployeeDAO() {
		e=new Employee();
		System.out.println("Employee DAO");
		
		
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return e;
	}

}
