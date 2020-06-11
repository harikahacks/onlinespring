package com.google.demospring.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.google.demospring.employee.model.Employee;

@Repository
public class EmployeeDAO {
	
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	Employee e;
	public EmployeeDAO() {
		e=new Employee();
		System.out.println("Employee DAO");
		
		
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return e;
	}
	
	public Employee saveEmployee(Employee employee) {
		return this.mongoTemplate.save(employee);
	}

}
