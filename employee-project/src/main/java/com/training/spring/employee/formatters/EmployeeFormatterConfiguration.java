package com.training.spring.employee.formatters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.spring.employee.poperties.AppProperties;
import com.training.spring.employee.poperties.ELanguage;

@Configuration
public class EmployeeFormatterConfiguration {

    private final AppProperties appProperties;

    public EmployeeFormatterConfiguration(final AppProperties appPropertiesParam) {
        this.appProperties = appPropertiesParam;
    }

    @Bean
    public IEmployeeFormatter employeeFormatter() {
        ELanguage languageLoc = this.appProperties.getLanguage();
        switch (languageLoc) {
            case TURKISH:
                return new FormatEmployeeTurkish();
            case ENGLISH:
                return new FormatEmployeeEnglish();
            default:
                return new FormatEmployeeEnglish();
        }
    }

}
