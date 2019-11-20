package org.person.controller;

import org.person.jpa.DepartmentRepository;
import org.person.jpa.EmployeeRepository;
import org.person.jpa.XuserRepository;
import org.person.pojo.Department;
import org.person.pojo.Employee;
import org.person.pojo.Xuser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JpaController {

   public static Logger log=LoggerFactory.getLogger(JpaController.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private XuserRepository xuserRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @RequestMapping("/employee")
    public List<Employee> getEmployee() {

        List<Employee> list = employeeRepository.findAll();
        if (list.isEmpty()) {
            log.error("没有查询到任何结果");
        }
        return list;
    }

    @GetMapping("/user/{id}")
    public Xuser getUser(@PathVariable("id") Integer id) {
        return  xuserRepository.findOne(id);
    }

    @GetMapping("/department")
    public Department getDepartment(@PathVariable ("id") Integer id){
        Department department = departmentRepository.findOne(1);
        return  department;
    }
}
