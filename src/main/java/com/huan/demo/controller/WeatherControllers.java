package com.huan.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherControllers {
    @GetMapping("/hello")
    public String ALL(){
        return "hellllooo aaaa";
    }
}
