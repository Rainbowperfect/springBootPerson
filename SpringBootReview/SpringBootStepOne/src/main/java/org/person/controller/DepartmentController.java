package org.person.controller;

import org.person.mapper.DepartmentMapper;
import org.person.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentMapper departmentMapper;

    @RequestMapping("/query/{id}")
    public Department getId(){
        Department department= departmentMapper.getDepartmentId(1);
        return department;
    }
}
