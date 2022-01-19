package com.training.spring.employee.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.employee.mappings.EmployeeMappings;
import com.training.spring.employee.rest.models.EmployeeRest;
import com.training.spring.employee.services.EmployeeManager;

@RestController
@RequestMapping("/api/v1/employee/provision")
public class EmployeeProvisionRest {

    @Autowired
    private EmployeeManager em;

    @PostMapping("/add")
    public String add(@RequestBody final EmployeeRest employeeParam) {
        this.em.add(EmployeeMappings.toEmployee(employeeParam));
        return "OK";
    }

}
