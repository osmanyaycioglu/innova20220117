package com.training.spring.employee.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee/query")
public class EmployeeRest {


    @GetMapping("/get/one/{username}")
    public String getEmployeeone(@PathVariable("username") final String username) {
        return "username : " + username;
    }

    @GetMapping("/get/single")
    public String getEmployeeSingle(@RequestParam("username") final String username) {
        return "username : " + username;
    }


}
