package com.webSearchEngine.controllers;

import com.webSearchEngine.ApplicationRunner;
import com.webSearchEngine.dao.repositories.UrlRepository;
import com.webSearchEngine.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static com.webSearchEngine.services.IndexerApplication.indexed;
import static com.webSearchEngine.services.IndexerApplication.words;

//@RestController
@RequestMapping("/www.ayudika.com")
@Controller
public class RequestController {
    @Autowired
    ObjectCreator objectCreator;
    @GetMapping("/{value}")
    /*ResponseEntity<List<URL>>*/ public String  getUrls(@PathVariable("value") String quarry, Model model) {
        objectCreator.createrObject(quarry);
        System.out.println("RequestController");
        Ranker.ranking(indexed, words);

        ResponseEntity<List<URL>> responseEntity = new ResponseEntity<>(Ranker.urls, HttpStatus.OK);
        Clear.cleanMemory();
//        return responseEntity;
        List<URL> l = responseEntity.getBody();
//        System.out.println(l.toString());
//        System.out.println("string: "+responseEntity.toString());
//        System.out.println("This is testing method");
        model.addAttribute("name", "Jems");
        model.addAttribute("urls", l);
        return "respons";
    }

    @GetMapping("/test")
    public String test(Model model) {
        System.out.println("This is testing method");
        model.addAttribute("name", "Jems");
        return "respons";
    }
}
