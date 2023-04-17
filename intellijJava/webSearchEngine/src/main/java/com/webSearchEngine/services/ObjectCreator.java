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
        List<Url> urls = urlRepository.findAll();
        if (urls.size() <= 0) System.out.println("Data base is empty");

        IndexerApplication.words = quarry.trim().split("[^a-zA-Z]+");
        List<CrawlerApplication> bots = new ArrayList<>();
        for (int i = 0; i < urls.size(); i++) {
            bots.add(new CrawlerApplication(urls.get(i).getUrl(), 1, i));
        }


//        for(CrawlerApplication cr : bots) {
//            cr.crawlLinkBfs(cr.first_link);
//        }

        System.out.println(bots.size());
        for (CrawlerApplication bot : bots) {
            try {
                bot.getThread().join();
            } catch (Exception e) {
            }
        }

    }
}
