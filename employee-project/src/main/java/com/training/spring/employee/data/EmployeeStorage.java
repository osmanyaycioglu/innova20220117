package com.training.spring.employee.data;

import java.util.ArrayList;
import java.util.List;
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
            this.getEmployeeMap()
                .put(entryLoc.getKey(),
                     entryLoc.getValue());
        }
    }

    public Employee getEmployee(final String username) {
        return this.getEmployeeMap()
                   .get(username);
    }

    public Map<String, Employee> getEmployeeMap() {
        return this.employeeMap;
    }

    public void add(final Employee employeeParam) {
        this.employeeMap.put(employeeParam.getUsername(),
                             employeeParam);
    }

    public List<Employee> getAll() {
        return new ArrayList<>(this.employeeMap.values());
    }

}
