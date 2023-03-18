package com.webSearchEngine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.webSearchEngine.services.fileInput.FileInput.*;

public class ObjectCreator {
    CrawlerApplication crawlerApplication;
    public static void createrObject() {
        List<CrawlerApplication> bots = new ArrayList<>();
        for(int i = 0; i < 100; i++) {
            bots.add(new CrawlerApplication(scan.nextLine(), 1, i));
        }
        for(CrawlerApplication bot : bots) {
            try {
                bot.getThread().join();
            } catch (Exception e) {}
        }
    }
}
