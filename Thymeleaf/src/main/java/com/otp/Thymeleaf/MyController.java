package com.otp.Thymeleaf;


import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/")
    public String home() {
        return "index.html";
    }

    @GetMapping("/otp")
    public String otp(ModelMap map) {
        map.put("otp", new Random().nextInt(1000, 10000));
        return "index.html";
    }

    @PostMapping("/print")
    public String print(@RequestParam String color, @RequestParam int width, @RequestParam int height, ModelMap map) {
        map.put("height", height);
        map.put("width", width);
        map.put("color", color);
        return "index.html";
    }
}