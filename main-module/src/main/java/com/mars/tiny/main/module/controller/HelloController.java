package com.mars.tiny.main.module.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by geyan on 2025/3/26 23:07
 */
@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello, Spring World!";
    }

}
