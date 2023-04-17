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
import static com.webSearchEngine.services.Others.*;
import static com.webSearchEngine.services.StaticVariables.*;

//@RestController
@RequestMapping("/www.ayudika.com")
@Controller
public class RequestController {
    @Autowired
    ObjectCreator objectCreator;

    @GetMapping("/{value}")
    public String  getUrls(@PathVariable("value") String quarry, Model model) {
        objectCreator.createrObject(quarry);
        System.out.println("RequestController");
        Ranker.ranking(indexed, quarry.split("[' ']"));

        ResponseEntity<List<Pair>> responseEntity = new ResponseEntity<>(Ranker.finalList, HttpStatus.OK);
        Clear.cleanMemory();
        List<Pair> l = responseEntity.getBody();

        fillWebPage(model, quarry, l);
        System.out.println(l.size() + " Links sent");
        return "webpage";
    }

}
