package com.webSearchEngine.services;

import com.webSearchEngine.dao.models.Url;
import com.webSearchEngine.dao.repositories.UrlRepository;
import com.webSearchEngine.services.fileInput.FileInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ObjectCreator extends FileInput {
    @Autowired
    UrlRepository urlRepository;

    public void createrObject(String quarry) {
        fileInput();
        List<Url> urls =  urlRepository.findAll();

        IndexerApplication.words = quarry.trim().split("[',','.','-','_',' ']");
        for (int i = 0; i < IndexerApplication.words.length; i++) {
            IndexerApplication.words[i] = IndexerApplication.words[i].toLowerCase();
        }
        List<CrawlerApplication> bots = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            bots.add(new CrawlerApplication(urls.get(i).getUrl(), 1, i));
        }
        System.out.println(bots.size());
        for (CrawlerApplication bot : bots) {
            try {
                bot.getThread().join();
            } catch (Exception e) {
            }
        }

    }
}
