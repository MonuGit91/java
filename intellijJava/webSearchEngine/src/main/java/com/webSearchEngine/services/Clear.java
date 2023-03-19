package com.webSearchEngine.services;

import java.util.ArrayList;


public class Clear {
    public static void cleanMemory() {
        Ranker.urls = new ArrayList<>();
        IndexerApplication.indexed = new ArrayList<>();
        CrawlerApplication.visited = new ArrayList<>();
    }
}
