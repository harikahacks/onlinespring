package com.google.demospring.department.services;

import com.google.demospring.department.dao.DepartmentDAO;
import com.google.demospring.department.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    public DepartmentService() {
        System.out.println("Department Service");
    }

    @Autowired
    DepartmentDAO ddao;
    public void  save(Department d)
    {
        ddao.save(d);
    }

    public void deleteDepartment(int depId)
    {
       ddao.deleteDepartment(depId);
    }

    public Department getById(int id)
    {

        return ddao.getById(id);
    }

}
