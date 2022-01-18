package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.spring.employee.services.EmployeeManager;

@SpringBootApplication
public class EmployeeProjectApplication implements ApplicationRunner {

    @Autowired
    private EmployeeManager em;

    public static void main(final String[] args) {
        SpringApplication.run(EmployeeProjectApplication.class,
                              args);
    }

    @Override
    public void run(final ApplicationArguments argsParam) throws Exception {
        this.em.printEmployeeInfo("osmanyay");
    }

}
