package com.training.spring.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first/rest")
public class MyFirstRest {

    @GetMapping("/hello2/{abc}/user/{xyz}")
    public String hello2(@PathVariable("abc") final String name,
                         @PathVariable("xyz") final Integer age) {
        return "Hello world 2 " + name + " " + age;
    }

    @GetMapping("/hello3")
    public String hello3(@RequestParam("abc") final String name,
                         @RequestParam("xyz") final Integer age) {
        return "Hello world 3 " + name + " " + age;
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
