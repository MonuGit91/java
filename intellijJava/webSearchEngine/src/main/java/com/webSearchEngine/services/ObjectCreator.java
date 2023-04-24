package com.webSearchEngine.services;

import com.webSearchEngine.dao.models.Url;
import com.webSearchEngine.dao.repositories.UrlRepository;
import org.jboss.jandex.Indexer;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static com.webSearchEngine.services.Others.*;
import static com.webSearchEngine.services.StaticVariables.*;

@Service
public class ObjectCreator{
    @Autowired
    UrlRepository urlRepository;

    public void createrObject(String quarry) {
        List<Url> urls = urlRepository.findAll();
        if (urls.size() <= 0) System.out.println("Data base is empty");

        IndexerApplication.words = quarry.trim().split("[^a-zA-Z]+");
        multiThreading(urls);
//        multiThreadingWithThreadPool(urls);
    }

    public void multiThreading(List<Url> urls) {
        List<CrawlerApplication> bots = new ArrayList<>();
        for (int i = 0; i < urls.size(); i++) {
            for(int j = 0; j < 1; j++) {
                    bots.add(new CrawlerApplication(urls.get(i).getUrl(), 1, i));
                }
        }
        for (CrawlerApplication bot : bots) {
            try {
                bot.getThread().join();
            } catch (Exception e) {}
        }
    }

    public void multiThreadingWithThreadPool(List<Url> urls) {
        try{
            executorService = Executors.newFixedThreadPool(500);
            for (int i = 0; i < urls.size(); i++) {
                executorService.submit(new CrawlerApplication(urls.get(i).getUrl(), 1, i));
            }
            executorService.shutdown();
        }
        catch (Exception e) {

        }

    }
}
