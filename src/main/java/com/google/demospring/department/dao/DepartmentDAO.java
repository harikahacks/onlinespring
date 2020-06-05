package com.google.demospring.department.dao;

import com.google.demospring.department.model.Department;
import org.springframework.stereotype.Repository;

@Repository
public class DepartmentDAO {

    public DepartmentDAO() {
        System.out.println("Department DAO");
    }

    public void save(Department d){
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
