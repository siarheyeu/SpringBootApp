package ru.siarheyeu.springcourse.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.SQLOutput;

@Controller
public class HelloController {
    @Value("${Hello}")
    private String hello;

    @GetMapping("/hello")
    public String hello(){
        System.out.println(this.hello);

        return "hello";
    }
}
