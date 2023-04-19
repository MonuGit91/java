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
import java.util.List;

import static com.webSearchEngine.services.IndexerApplication.indexed;
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
        System.out.println("user is searching: " + quarry);
        String userQuarry = quarry;
        quarry = Others.filterQuarry(quarry);
        try{
            objectCreator.createrObject(quarry);
        }
        finally {
            Ranker.ranking(indexed, quarry.split("[^a-zA-Z]+"));
            ResponseEntity<List<Pair>> responseEntity = new ResponseEntity<>(finalList, HttpStatus.OK);
            List<Pair> resultList = responseEntity.getBody();
            fillWebPage(model, userQuarry, resultList);
            System.out.println(resultList.size() + " Links found and it is sent to Front-End");
            Clear.cleanMemory();
            return "webpage";
        }
    }
}
