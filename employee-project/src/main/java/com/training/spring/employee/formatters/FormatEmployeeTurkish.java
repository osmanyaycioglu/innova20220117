package com.training.spring.employee.formatters;

import com.training.spring.employee.models.Employee;

public class FormatEmployeeTurkish implements IEmployeeFormatter {

    @Override
    public String formatEmployee(final Employee employeeParam) {
        return "Çalışan datası " + employeeParam;
    }

}
