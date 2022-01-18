package com.training.spring.employee.poperties;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.training.spring.employee.models.Employee;

@Component
@ConfigurationProperties(prefix = "employee.project")
public class AppProperties {

    private Map<String, Employee> employees;
    private ELanguage             language = ELanguage.ENGLISH;


    public Map<String, Employee> getEmployees() {
        return this.employees;
    }


    public void setEmployees(final Map<String, Employee> employeesParam) {
        this.employees = employeesParam;
    }


    public ELanguage getLanguage() {
        return this.language;
    }


    public void setLanguage(final ELanguage languageParam) {
        this.language = languageParam;
    }


}
