package com.huan.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherControllers {
    @GetMapping("/hello")
    public String ALL(){
        return "hello";
    }
    @GetMapping("/hieu")
    public String Test (){
        return "hieu";
    }
}
