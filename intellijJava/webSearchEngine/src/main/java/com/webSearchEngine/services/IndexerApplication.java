package com.webSearchEngine.services;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.*;

import static com.webSearchEngine.services.StaticVariables.*;
import static com.webSearchEngine.services.Wiki.*;

public class IndexerApplication {

    public static List<Pair> indexed = new ArrayList<>();
    public static String words[];

    public boolean indexer(String url, Document document) {
        Map<String, Integer> map = new HashMap<>();
        String demoPara = "";
        String title = document.title();
        String domain = Others.domainExtract(url);
        if (wiki(url, document, map, domain, title, indexed, words, demoPara)) return true;
        for (Element paragraph : document.select("p")) {
            String text = paragraph.text();
            if (text.length() >= 150 && demoPara.length() < 110) demoPara = text;

            String arr[] = text.trim().split("[' ', '-', ,',']");
            for (String s : arr) {
                s = s.toLowerCase();
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }

            if (text.length() > 160) demoPara = text.substring(0, 150) + "...";
//            else if(text.length() > 100) demoPara = text.substring(0, 100) + "...";
            for (String word : words) {
                if (map.containsKey(word.toLowerCase())) {
                    System.out.println(word);
                    indexed.add(new Pair(url, map, demoPara, title, domain));
                    domains.add(domain);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean wiki(String url, Document document, Map<String, Integer> map, String domain, String title, List<Pair> indexed, String[] words, String demoPara) {
        if (!domain.contains("wiki")) return false;
        int matchedWords = 0;
        for (Element pe : document.select("p")) {
            String text = pe.text();
            String textArr[] = text.split("[^a-zA-Z]+");

            for (String quarryWord : words) {
                for(String textWord : textArr) {
                    if (textWord.contains(quarryWord)) {
                        matchedWords++;
                        if(matchedWords >= 5) {
                            addToMap(url, document, map, domain, title, indexed, words, demoPara);
                            return true;
                        }
                    }
                }
            }
        }
        return true;
    }

    private void addToMap(String url, Document document, Map<String, Integer> map, String domain, String title, List<Pair> indexed, String[] words, String demoPara) {
        for (Element paraEle : document.select("p")) {
            String text = paraEle.text();
            String arr[] = text.split("[^a-zA-Z]+");

            if (text.length() >= 200) {
                if (demoPara.length() == 0) demoPara = text;
                if (wikiList.size() < 2) {
                    fillWiki(url, document, text, domain, title);
                }
            }

            if (text.length() >= 160) demoPara = text.substring(0, 150) + "...";
            for (String s : arr) {
                for (String w : words) {
                    if (map.containsKey(w)) {
                        map.put(w, map.get(w) + 1);
                    } else {
                        map.put(w, 1);
                    }
                }
            }
        }
        indexed.add(new Pair(url, map, demoPara, title, domain));
        domains.add(domain);
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
