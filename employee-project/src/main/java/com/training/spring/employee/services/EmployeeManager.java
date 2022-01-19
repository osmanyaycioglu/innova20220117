package com.training.spring.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.spring.employee.data.EmployeeStorage;
import com.training.spring.employee.formatters.IEmployeeFormatter;
import com.training.spring.employee.models.Employee;

@Service
public class EmployeeManager {

    @Autowired
    private EmployeeStorage    es;

    @Autowired
    private IEmployeeFormatter employeeFormatter;

    public void printEmployeeInfo(final String username) {
        Employee employeeLoc = this.es.getEmployee(username);
        if (employeeLoc != null) {
            System.out.println(this.employeeFormatter.formatEmployee(employeeLoc));
        } else {
            System.out.println("Böyle bit çalışan yok");
        }
    }

    public Employee getOneEmployeeByUsername(final String usernameParam) {
        return this.es.getEmployee(usernameParam);
    }

    public void add(final Employee employeeParam) {
        this.es.add(employeeParam);
    }

    public List<Employee> getAll() {
        return this.es.getAll();
    }

}
