package com.basicCrudOperation.controllers;

import com.basicCrudOperation.dao.models.Url;
import com.basicCrudOperation.services.CrudService;
//import com.basicCrudOperation.services.FillDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sql") // localhost:8080/sql
public class CrudController {
    @Autowired
    CrudService crudServices;

    @GetMapping("/geturls")
    List<Url> getUrls() {
        return crudServices.getUrls();
    }
    @GetMapping("/deleteurls")
    List<Url> deleteUrls() {
        return crudServices.deleteUrls();
    }
    @GetMapping("/seturls")
    List<Url> setUrls() {
        return crudServices.setUrls();
    }
}
