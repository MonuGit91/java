package com.applicationRunner;
import com.crawler.crawler.CrawlerApplication;
//import com.crawler.crawler.MultithreadedCrawle;
import com.fileInput.FileInput;
import com.indexer.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

import java.net.URI;

import java.util.ArrayList;
import java.util.List;
import static com.fileInput.FileInput.*;

public class ApplicationRunner{
    public static void objectCreater() {
        List<CrawlerApplication> bots = new ArrayList<>();
        for(int i = 0; i < 50; i++) {
            bots.add(new CrawlerApplication(scan.nextLine(), 1, i));
        }
        for(CrawlerApplication bot : bots) {
            try {
                bot.getThread().join();
            } catch (Exception e) {}
        }
    }
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRunner.class, args);
        fileInput();
//		String url = "https://www.google.com/";//seed url
//		Crawle.crawl(1, url, new ArrayList<String>());

        //------------------------------------------------------------
//        String arr[] = "Java_Programming".;
//        System.out.println(arr[0]);
        objectCreater();

    }
}
