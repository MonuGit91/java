package com.webSearchEngine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class ObjectCreator extends com.webSearchEngine.services.fileInput.FileInput {
    CrawlerApplication crawlerApplication;

    public static void createrObject(String quarry) {
        fileInput();
        IndexerApplication.words = quarry.trim().split("[',','.','-','_',' ']");
        for(int i = 0; i < IndexerApplication.words.length; i++) {
            IndexerApplication.words[i] = IndexerApplication.words[i].toLowerCase();
        }
        List<CrawlerApplication> bots = new ArrayList<>();
        for(int i = 0; i < 40; i++) {
            bots.add(new CrawlerApplication(scan.nextLine(), 1, i));
        }
        System.out.println(bots.size());
        for(CrawlerApplication bot : bots) {
            try {
                bot.getThread().join();
            } catch (Exception e) {}
        }

    }
}
