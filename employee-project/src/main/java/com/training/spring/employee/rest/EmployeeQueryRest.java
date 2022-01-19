package com.training.spring.employee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.employee.mappings.EmployeeMappings;
import com.training.spring.employee.rest.models.EmployeeRest;
import com.training.spring.employee.services.EmployeeManager;

@RestController
@RequestMapping("/api/v1/employee/query")
public class EmployeeQueryRest {

    @Autowired
    private EmployeeManager em;

    @GetMapping("/get/one/{username}")
    public EmployeeRest getEmployeeone(@PathVariable("username") final String username) {
        return EmployeeMappings.toEmployeeRest(this.em.getOneEmployeeByUsername(username));
    }

    @GetMapping("/get/single")
    public EmployeeRest getEmployeeSingle(@RequestParam("username") final String username) {
        return EmployeeMappings.toEmployeeRest(this.em.getOneEmployeeByUsername(username));
    }

    @GetMapping("/get/all")
    public List<EmployeeRest> getAll() {
        return EmployeeMappings.toEmployeesRest(this.em.getAll());
    }

}
