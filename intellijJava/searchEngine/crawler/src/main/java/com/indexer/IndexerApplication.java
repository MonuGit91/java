package com.indexer;
//import com.crawler.*;
import com.Ranker.*;
import com.others.Pair;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.boot.SpringApplication;

import java.io.BufferedReader;
import java.util.*;
public class IndexerApplication {

    static List <Pair> indexed = new ArrayList<>();
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
        if(count > 0) {
//            System.out.println("url " + url);
            indexed.add(new Pair(url, map));
        }
        if(indexed.size() >= 10) {
//            System.out.println("hii");
            Ranker ranker = new Ranker();
            ranker.ranking(indexed, "java");
        }
    }
}
