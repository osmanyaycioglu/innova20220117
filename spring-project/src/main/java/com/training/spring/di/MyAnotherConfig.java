package com.training.spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.training.spring.configuration.AppProperties;

@Configuration
@Profile("all-one")
public class MyAnotherConfig {

    @Bean("hdyn")
    public IHello helloDyn3(final AppProperties appPropertiesParam) {
        System.out.println(appPropertiesParam);
        switch (appPropertiesParam.getLanguage()) {
            case "tr":
                return new HelloTr();
            case "eng":
                return new HelloEng();
            case "jp":
                return new HelloJp();
            case "esp":
                return new HelloEsp();
            default:
                return new HelloEng();
        }
    }
}
