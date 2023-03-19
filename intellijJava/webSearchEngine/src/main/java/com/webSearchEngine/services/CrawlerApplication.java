package com.webSearchEngine.services;

import lombok.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;

//@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CrawlerApplication {
    private static final int MAX_DEPTH = 3;
    private Thread thread;
    public String first_link;
    public static List<String> visited = new ArrayList<>();
    int ID;
    int threadno;
    static IndexerApplication indexerApplication = new IndexerApplication();

    public CrawlerApplication(String first_link, int num, int no) {
        this.first_link = first_link;
        thread = new Thread(this::run);
        thread.start();
		ID = num;
        threadno = no;
    }

    public void run() {

        try {
            crawl(first_link);
        } catch (Exception e) {
        }
    }

    public void crawl(String url) {
        crawl(0, url);
    }

    public void crawl(int level, String url) {
        if (level > MAX_DEPTH || (visited.contains(url) && !url.equals(first_link))) { return; }

        visited.add(url);
        Document document = request(url);
        if (document == null) { return; }
		indexerApplication.indexer(url, document);
        for (Element link : document.select("a[href]")) {
            if (indexerApplication.indexed.size() < 50) {
                String next_link = link.absUrl("href");
                crawl(level + 1, next_link);
            } else {
                break;
            }
        }

    }

    public Thread getThread() {
        return thread;
    }

    public static Document request(String url) {
        try {
            Connection connection = Jsoup.connect(url);
            Document document = connection.get();

            if (connection.response().statusCode() == 200) {
                return document;
            }

        } catch (Exception E) {
        }

        return null;
    }
}