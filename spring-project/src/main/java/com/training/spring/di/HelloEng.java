package com.training.spring.di;

import org.springframework.stereotype.Component;

@Component
// @Primary
public class HelloEng implements IHello {

    @Override
    public String hello(final String nameParam) {
        return "Hello " + nameParam;
    }

}
