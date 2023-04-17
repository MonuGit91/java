package com.webSearchEngine.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @GetMapping("/loop")
    public String looping(Model model) {
        System.out.println("Aji Gana Sunbaa.... loop wala");
        List<String> names = new ArrayList<>();
        names.add("kaha jaite ha ho");
        names.add("Kahi na ho");
        names.add("ta jaa kon mana kaile hawa");
        names.add("too aur kon");
        names.add("Na batam");
        names.add("kahe na bataiba");
        names.add("kaha jaite ha ho");
        names.add("Kahi na ho");
        names.add("ta jaa kon mana kaile hawa");
        names.add("too aur kon");
        names.add("Na batam");
        names.add("kahe na bataiba");
        model.addAttribute("names", names);
        return "webpage";
    }
}
