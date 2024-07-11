package com.faken.apifox_test.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class test {

    @GetMapping("/test")
    public String test(String name) {return "Hello,world" + name;}
}
