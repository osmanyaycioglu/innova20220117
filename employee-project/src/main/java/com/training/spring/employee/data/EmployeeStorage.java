package com.training.spring.employee.data;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Service;

import com.training.spring.employee.models.Employee;
import com.training.spring.employee.poperties.AppProperties;

@Service
public class EmployeeStorage {

    private final Map<String, Employee> employeeMap = new ConcurrentHashMap<>();


    public EmployeeStorage(final AppProperties appPropertiesParam) {
        Map<String, Employee> employeesLoc = appPropertiesParam.getEmployees();
        Set<Entry<String, Employee>> entrySetLoc = employeesLoc.entrySet();
        for (Entry<String, Employee> entryLoc : entrySetLoc) {
            this.employeeMap.put(entryLoc.getKey(),
                                 entryLoc.getValue());
        }
    }

    public Employee getEmployee(final String username) {
        return this.employeeMap.get(username);
    }

}
