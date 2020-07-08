package com.huan.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WeatherControllers {
    @GetMapping("/hello")
    public String ALL(){
        return "/hello";
    }
    // phần này để test git
    @GetMapping("")
    public String test(){
        return "/test";
    }
}
