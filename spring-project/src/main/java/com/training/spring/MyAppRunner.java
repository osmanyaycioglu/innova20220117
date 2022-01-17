package com.training.spring;

import org.springframework.boot.SpringApplication;

public class MyAppRunner {

    public static void main(final String[] args) {
        SpringApplication.run(SpringProjectApplication.class,
                              args);


        //        CustomerDirector cdBeanLoc = contextLoc.getBean(CustomerDirector.class);
        //        cdBeanLoc.orginizeAdd(customerLoc);

        //        CustomerManager customerManagerLoc = new CustomerManager();
        //        CustomerDirector cd = new CustomerDirector(customerManagerLoc);
        //        cd.orginizeAdd(customerLoc);

    }
}
