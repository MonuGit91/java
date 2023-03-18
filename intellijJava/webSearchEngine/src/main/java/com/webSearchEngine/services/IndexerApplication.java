package com.webSearchEngine.services;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndexerApplication {

    public static List <Pair> indexed = new ArrayList<>();
    public void indexer(String url, Document document) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();

        for(Element paragraph : document.select("p")) {
            String arr[] = paragraph.text().trim().split("[',','.','-','_',' ']");
            for(String s : arr) {
                s = s.toLowerCase();
                if(map.containsKey(s)) { map.put(s, map.get(s)+1); }
                else { map.put(s, 1); }

                if(s.length() == 4 && s.toLowerCase().contains("java")) { count++; }
            }
        }
        if(count > 0 && indexed.size() < 50) {
            indexed.add(new Pair(url, map));
        }
        if(indexed.size() >= 50) {
            Ranker ranker = new Ranker();
            ranker.ranking(indexed, "java");
        }
    }
}
