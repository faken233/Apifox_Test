package com.faken.apifox_test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EmpController {

    @GetMapping("/app")
    public String app(String text) {
        return "Hello World " + text ;
    }

}
