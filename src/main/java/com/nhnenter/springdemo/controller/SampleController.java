package com.nhnenter.springdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/")
    public String root() {
        return "Spring Project";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
