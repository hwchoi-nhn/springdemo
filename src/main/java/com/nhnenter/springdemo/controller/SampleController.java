package com.nhnenter.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/hello/{name}")
    public String hello_name(@PathVariable("name") String name) {
        return "Hello " + name + "!";
    }
}
