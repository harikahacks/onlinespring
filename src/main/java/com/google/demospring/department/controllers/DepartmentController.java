package com.google.demospring.department.controllers;

import com.google.demospring.department.model.Department;
import com.google.demospring.department.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService ds;

    @PostMapping(value = "/department")
    public void save(@RequestBody Department department){
        ds.save(department);
    }
    @DeleteMapping(value="/department/{depId}")
    public void deleteDepartment(@PathVariable Integer depId)
    {
       ds.deleteDepartment(depId);
    }
    @GetMapping(value="/department/{depId}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Integer depId)
    {

        return ResponseEntity
                .accepted()
                .allow(HttpMethod.GET)
                .body(ds.getById(depId));
    }


}
