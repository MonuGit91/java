package com.thymeleaf.thymeleafeExplore.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@RestController
//@RequestMapping("/thymeleafe") // localhost:8080/thymeleafe
@Controller
public class ThymleafController {

    @GetMapping("/about") // localhost:8080/thymeleafe/about
    public String about(Model model) {
        System.out.println("Inside about html page");
        model.addAttribute("name", "Monu");
        model.addAttribute("currentDate", new Date());
        model.addAttribute("b", 9);
        return "about";
//        about.html
    }

    @GetMapping("/loop")
    public String looping(Model model) {
        System.out.println("Aji Gana Sunbaa.... loop wala");
        List<String> names = List.of("kaha jaite ha ho", "Kahi na ho", "ta jaa kon mana kaile hawa", "too aur kon");
        model.addAttribute("names", names);
        return "loop";
    }

    @GetMapping("/conditional")
    public String conditional(Model model) {
        System.out.println("Conditional handeler executed");
        model.addAttribute("name", "conditional statements");
        model.addAttribute("isActive", "true");
        model.addAttribute("gender", 'F');
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(222);
        list.add(3);
        model.addAttribute("myList", list);
        return "condition";
    }

    @GetMapping("/service")
    public String insertVariation(Model model) {
        model.addAttribute("name", "insert, replace, include");
        return "service";
    }

    @GetMapping("/dynamic")
    public String insertDynamically(Model model) {
        model.addAttribute("title", "Dynamic");
        model.addAttribute("subtitle", "content");
        return "dynamic";
    }

    @GetMapping("/newabout")
    public String newabout(Model model) {
        return "aboutnew";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        return "contact";
    }
}
