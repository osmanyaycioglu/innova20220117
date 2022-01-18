package com.training.spring.employee.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.employee.models.Employee;
import com.training.spring.employee.services.EmployeeManager;

@RestController
@RequestMapping("/api/v1/employee/query")
public class EmployeeQueryRest {

    @Autowired
    private EmployeeManager em;

    @GetMapping("/get/one/{username}")
    public Employee getEmployeeone(@PathVariable("username") final String username) {
        return this.em.getOneEmployeeByUsername(username);
    }

    @GetMapping("/get/single")
    public Employee getEmployeeSingle(@RequestParam("username") final String username) {
        return this.em.getOneEmployeeByUsername(username);
    }


}
