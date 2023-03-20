package com.basicCrudOperation.services;

import com.basicCrudOperation.dao.models.Url;
import com.basicCrudOperation.dao.repositories.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {
    @Autowired
    UrlRepository urlRepository;

    public List<Url> getUrls() {
//        urlRepository.deleteAll();
        List<Url> urls =  urlRepository.findAll();
        return urls;
    }

}
