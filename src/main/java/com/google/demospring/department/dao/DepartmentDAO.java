package com.google.demospring.department.dao;

import com.google.demospring.department.model.Department;
import com.google.demospring.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    public DepartmentDAO() {
        System.out.println("Department DAO");
    }

    public void save(Department d){

        this.mongoTemplate.save(d);
        System.out.println("Department Saved");

    }
    public void deleteDepartment(int depId)
    {
        System.out.println("Department Deleted");
    }

    public Department getById(int id)
    {
         Department d=new Department();
         return d;
    }

}
