package com.training.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.training.spring.di.IHello;

@SpringBootApplication()
public class SpringProjectApplication implements ApplicationRunner {

    // 2. Injection
    @Autowired
    private CustomerDirector      customerDirector;

    private CustomerManager       cm;

    private final CustomerManager cm2;

    @Autowired
    @Qualifier("hdyn")
    private IHello                he;

    // 1. Injection
    public SpringProjectApplication(final CustomerManager cm2Param) {
        super();
        this.cm2 = cm2Param;
    }


    //    @Autowired
    //    private CustomerManager  cm;

    // 3. Injection
    @Autowired
    public void xyz(final CustomerManager cm) {
        this.cm = cm;
    }

    @PostConstruct
    public void initXyz() {
        System.out.println("Post Construct");
    }

    @PreDestroy
    public void destroyXyz() {
        System.out.println("Pre Destroy");
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
