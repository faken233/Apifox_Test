package com.faken.apifox_test.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class test2 {

    @GetMapping("/test2")
    public String test_2(String name) {return "Hello,world" + name;}
}
