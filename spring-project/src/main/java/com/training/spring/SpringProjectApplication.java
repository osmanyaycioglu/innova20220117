package com.training.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.spring.di.IHello;

@SpringBootApplication
public class SpringProjectApplication implements ApplicationRunner {

    @Autowired
    private CustomerDirector customerDirector;

    private CustomerManager  cm;

    @Autowired
    @Qualifier("hdyn")
    private IHello           he;

    //    @Autowired
    //    private CustomerManager  cm;

    @Autowired
    public void xyz(final CustomerManager cm) {
        this.cm = cm;
    }

    @Override
    public void run(final ApplicationArguments argsParam) throws Exception {
        System.out.println(this.he.hello("osman"));

        Customer customerLoc = new Customer();
        customerLoc.setName("osman");
        customerLoc.setSurname("yaycıoğlu");
        customerLoc.setHeight(200);
        customerLoc.setWeight(95);

        // this.cm.add(customerLoc);
        for (int iLoc = 0; iLoc < 10; iLoc++) {
            this.customerDirector.orginizeAdd(customerLoc);
        }
    }


}
