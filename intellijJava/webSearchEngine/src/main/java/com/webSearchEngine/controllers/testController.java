package com.webSearchEngine.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class testController {
    @GetMapping("/about") // localhost:8080/thymeleafe/about
    public String about(Model model) {
        System.out.println("Inside about html page");
        model.addAttribute("name", "Monu");
        model.addAttribute("currentDate", new Date());
        model.addAttribute("b", 9);
        return "about";
//        about.html
    }
    @GetMapping("/test")
    public String test(Model model) {
        System.out.println("This is testing method");
        model.addAttribute("name", "Jems");
        return "respons";
    }
}
