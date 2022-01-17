package com.training.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.training.spring.configuration.AppProperties;

// @Controller
// @Repository
// @Service
@Configuration
@Profile("all-two")
public class HelloConfiguration {

    @Value("${app.language}")
    String                abc2;

    @Autowired
    private Environment   env;

    @Autowired
    private AppProperties appP;


    @Profile("lang-tr")
    @Bean("hdyn")
    public IHello helloDynTr() {
        return new HelloTr();
    }

    @Profile("lang-eng")
    @Bean("hdyn")
    public IHello helloDynEng() {
        return new HelloEng();
    }

    @Profile("lang-esp")
    @Bean("hdyn")
    public IHello helloDynEsp() {
        return new HelloEsp();
    }

    @Profile("lang-jp")
    @Bean("hdyn")
    public IHello helloDynJp() {
        return new HelloJp();
    }

    @Bean
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

    @Bean
    public IHello helloDyn2() {
        String abc = this.env.getProperty("app.language");
        switch (abc) {
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

    @Bean
    public IHello helloDyn(@Value("${app.language}") final String abc) {
        switch (abc) {
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

    @Bean("hello")
    public IHello hello() {
        return new HelloEsp();
    }

    @Bean("hello")
    public IHello hello1() {
        return new HelloEng();
    }

    @Bean("hello2")
    public IHello hello2() {
        return new HelloTr();
    }

    @Bean("h3")
    public IHello hello3() {
        return new HelloJp();
    }

}
