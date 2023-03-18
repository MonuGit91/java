package com.webSearchEngine.controllers;

import com.webSearchEngine.ApplicationRunner;
import com.webSearchEngine.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/www.ayudika.com")
public class RequestController {
//    @Autowired
//    ObjectCreator objectCreator;

    @GetMapping("/{value}")//")
    ResponseEntity<List<String>> getUrls(@PathVariable("value") String name) {
//        System.out.println(name);
        ObjectCreator objectCreator = new ObjectCreator();
        objectCreator.createrObject();
//        System.out.println(Ranker.urls.size());
        return new ResponseEntity<>(Ranker.urls, HttpStatus.OK);
    }
}
