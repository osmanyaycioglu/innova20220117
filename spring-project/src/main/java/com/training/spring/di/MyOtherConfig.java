package com.training.spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.training.spring.conditional.MyCondition;

@Configuration
@Profile("all-three")
public class MyOtherConfig {

    @Bean("hdyn")
    @MyCondition(prop = "test.conditional.hello", propValue = "tr")
    //@ConditionalOnProperty(name = "test.conditional.hello",havingValue = "tr")
    public IHello helloDyn1() {
        return new HelloTr();
    }

    @Bean("hdyn")
    @MyCondition(prop = "test.conditional.hello", propValue = "eng")
    public IHello helloDyn2() {
        return new HelloEng();
    }

    @Bean("hdyn")
    @MyCondition(prop = "test.conditional.hello", propValue = "esp")
    public IHello helloDyn3() {
        return new HelloEsp();
    }

}
