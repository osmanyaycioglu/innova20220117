package com.training.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.spring.Customer;
import com.training.spring.data.ICustomerDao;

@RestController
@RequestMapping("/customer/query")
public class CustomerQuery {

    @Autowired
    private ICustomerDao cdao;

    @GetMapping("/get/all")
    public Iterable<Customer> getAll() {
        return this.cdao.findAll();
    }

    @GetMapping("/get/one")
    public Customer getOne(@RequestParam("cid") final Long customerId) {
        return this.cdao.findById(customerId)
                        .orElse(null);
    }

    @GetMapping("/get/by/name")
    public List<Customer> getByName(@RequestParam("name") final String name) {
        return this.cdao.findByName(name);
    }

}
