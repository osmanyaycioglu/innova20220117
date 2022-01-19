package com.training.spring.employee.mappings;

import java.util.ArrayList;
import java.util.List;

import com.training.spring.employee.models.Employee;
import com.training.spring.employee.rest.models.EmployeeRest;

public class EmployeeMappings {

    public static Employee toEmployee(final EmployeeRest employeeParam) {
        Employee employeeLoc = new Employee();
        employeeLoc.setName(employeeParam.getName());
        employeeLoc.setSurname(employeeParam.getSurname());
        employeeLoc.setAmount(employeeParam.getAmount());
        employeeLoc.setUsername(employeeParam.getUsername());
        return employeeLoc;
    }

    public static EmployeeRest toEmployeeRest(final Employee employeeParam) {
        EmployeeRest employeeLoc = new EmployeeRest();
        employeeLoc.setName(employeeParam.getName());
        employeeLoc.setSurname(employeeParam.getSurname());
        employeeLoc.setAmount(employeeParam.getAmount());
        employeeLoc.setUsername(employeeParam.getUsername());
        return employeeLoc;
    }

    public static List<EmployeeRest> toEmployeesRest(final List<Employee> allParam) {
        List<EmployeeRest> employeeRestsLoc = new ArrayList<>();
        for (Employee employeeLoc : allParam) {
            employeeRestsLoc.add(toEmployeeRest(employeeLoc));
        }
        return employeeRestsLoc;
    }


}
