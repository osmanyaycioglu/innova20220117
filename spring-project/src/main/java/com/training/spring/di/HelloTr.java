package com.training.spring.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("htr")
@Qualifier("htrwert3e")
public class HelloTr implements IHello {

    @Override
    public String hello(final String nameParam) {
        return "Merhaba " + nameParam;
    }

}
