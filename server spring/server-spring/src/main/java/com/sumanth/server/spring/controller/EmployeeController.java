package com.sumanth.server.spring.controller;

import com.sumanth.server.spring.model.employee.Employee;
import com.sumanth.server.spring.model.employee.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/employee/get-all")
    public List<Employee> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }
    @PostMapping("/employee/save")
    public Employee save(@RequestBody Employee employee){
         return employeeDao.save(employee);
    }

}
