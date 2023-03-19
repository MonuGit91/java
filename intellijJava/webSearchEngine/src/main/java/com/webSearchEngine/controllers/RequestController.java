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

import java.util.ArrayList;
import java.util.List;

import static com.webSearchEngine.services.IndexerApplication.indexed;
import static com.webSearchEngine.services.IndexerApplication.words;

@RestController
@RequestMapping("/www.ayudika.com")
public class RequestController {
//    @Autowired
//    ObjectCreator objectCreator;

    @GetMapping("/{value}")
    ResponseEntity<List<String>> getUrls(@PathVariable("value") String quarry) {
//        System.out.println(name);
        ObjectCreator objectCreator = new ObjectCreator();
        objectCreator.createrObject(quarry);
        System.out.println("RequestController");
        Ranker.ranking(indexed, words);
        ResponseEntity<List<String>> responseEntity = new ResponseEntity<>(Ranker.urls, HttpStatus.OK);
        Clear.cleanMemory();
        return responseEntity;
    }
}
