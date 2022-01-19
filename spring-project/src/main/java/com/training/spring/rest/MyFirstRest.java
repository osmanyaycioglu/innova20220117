package com.training.spring.rest;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.Customer;
import com.training.spring.data.ICustomerDao;

@RestController
@RequestMapping("/first/rest")
@Validated
public class MyFirstRest {

    @GetMapping("/hello2/{abc}/user/{xyz}")
    public String hello2(@PathVariable("abc") final String name,
                         @PathVariable("xyz") final Integer age) {
        return "Hello world 2 " + name + " " + age;
    }

    @GetMapping("/hello3")
    public String hello3(@NotEmpty @RequestParam("abc") final String name,
                         @Max(150) @RequestParam("xyz") final Integer age) {
        return "Hello world 3 " + name + " " + age;
    }

    @GetMapping("/hello35/{abc}")
    public String hello35(@RequestParam("abc") final String name,
                          @RequestParam("xyz") final Integer age) {
        return "Hello world 35 " + name + " " + age;
    }

    @PostMapping("/hello4")
    public String hello4(@RequestBody final Customer customer) {
        return "Hello world 4 " + customer;
    }

    @Autowired
    private ICustomerDao custDao;

    @PostMapping("/hello5")
    public CustomerResult hello5(@Validated @RequestBody final Customer customer) {
        customer.getPhone()
                .setCustomer(customer);

        if (customer.getName()
                    .startsWith("xyz")) {
            throw new IllegalArgumentException("xyz ile başlayamaz");
        }
        CustomerResult resultLoc = new CustomerResult();
        resultLoc.setCustomer(customer);
        resultLoc.setDescription("My description");
        resultLoc.setTest(1002);
        this.custDao.save(customer);
        return resultLoc;
    }

    @PostMapping("/hello6")
    public ResponseEntity<CustomerResult> hello6(@Validated @RequestBody final Customer customer,
                                                 final HttpServletRequest hsr) {
        String parameterLoc = hsr.getParameter("name");
        System.out.println("Name : " + parameterLoc);
        CustomerResult resultLoc = new CustomerResult();
        resultLoc.setCustomer(customer);
        resultLoc.setDescription("My description");
        resultLoc.setTest(1002);
        return ResponseEntity.status(201)
                             .header("x-test",
                                     "my header test")
                             .body(resultLoc);
    }

    @PostMapping("/hello7/{operation}")
    public ResponseEntity<?> hello7(@PathVariable("operation") final String op,
                                    final HttpServletRequest hsr) {
        switch (op) {
            case "add":
                String parameterLoc = hsr.getParameter("name");
                System.out.println("Name : " + parameterLoc);
                CustomerResult resultLoc = new CustomerResult();
                resultLoc.setCustomer(null);
                resultLoc.setDescription("My description");
                resultLoc.setTest(1002);
                return ResponseEntity.status(201)
                                     .header("x-test",
                                             "my header test")
                                     .body(resultLoc);


            default:
                return ResponseEntity.status(202)
                                     .header("x-test",
                                             "my header test")
                                     .body("boş");
        }
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello world GET";
    }

    @PostMapping("/hello")
    public String hello2() {
        return "Hello world POST";
    }

    @PutMapping("/hello")
    public String hello3() {
        return "Hello world PUT";
    }


}
