package com.webSearchEngine.services;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.*;

import static com.webSearchEngine.services.Others.fillWiki;
import static com.webSearchEngine.services.StaticVariables.*;

public class IndexerApplication {

    public static List <Pair> indexed = new ArrayList<>();
    public static String words[];

    public boolean indexer(String url, Document document) {
//        System.out.println("indecer");
        Map<String, Integer> map = new HashMap<>();
        String demoPara = "";
        String title = document.title();
        String domain = Others.domainExtract(url);

        if(wiki(url, document, map, domain, title, indexed, words, demoPara)) return true;

        for (Element paragraph : document.select("p")) {
            String text = paragraph.text();
            if(text.length() >= 150 && demoPara.length() == 0) demoPara = text;

            String arr[] = text.trim().split("[' ', '-', ,',']");
            for (String s : arr) {
                s = s.toLowerCase();
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }

            if(text.length() > 160) demoPara = text.substring(0, 150)+"...";
            for (String word : words) {
                if (map.containsKey(word.toLowerCase())) {
                    indexed.add(new Pair(url, map, demoPara, title, domain));
                    return true;
                }
            }
        }
        return false;
    }

    private boolean wiki(String url, Document document, Map<String, Integer> map, String domain, String title, List<Pair> indexed, String[] words, String demoPara) {
        if(!domain.contains("wiki")) return false;

        for(Element pe : document.select("p")) {
            String text = pe.text();

            if(text.contains("fever")) {
//                System.out.println("wikipedia page contains fever words");
//                System.out.println("domain is : " + domain);
//                System.out.println("Url is : " + url);

                String arr[] = text.split("[^a-zA-Z]+");
                for(String s : arr) {
                    if(s.contains("fever")) {
//                        System.out.println("--------words contains fever word_____");
//                        System.out.println("word is: " + s);
//                        System.out.println();

                        addToMap(url, document, map,  domain,  title,  indexed,  words, demoPara);
                    }
                }

                break;
            }

        }

        return true;
    }

    private void addToMap(String url, Document document, Map<String, Integer> map, String domain, String title, List<Pair> indexed, String[] words, String demoPara) {
        for(Element paraEle : document.select("p")) {
            String text = paraEle.text();
            String arr[] = text.split("[^a-zA-Z]+");

            if(text.length() >= 200) {
                if(demoPara.length() == 0) demoPara = text;
                if(wikiList.size() < 2) {
                    fillWiki(url, document, text, domain, title);
                }
//                else if (wikiPara1.length() == 0) wikiPara1 = text;
            }

            if(text.length() >= 160)demoPara = text.substring(0, 150)+"...";
//            if(text.contains("fever")) System.out.println(url+" 8888888Fever88888");
            for (String s : arr) {
               if(s.equals("fever")) System.out.println(url+" 8888888Fever88888");
                if(map.containsKey("fever")) { map.put("fever", map.get("fever") + 1);}
                else { map.put("fever", 1); }
            }
        }


//        for(String)
        if(map.containsKey("fever")) {
            indexed.add(new Pair(url, map, demoPara, title, domain));
            System.out.println("----map has key fever-------");
        }
    }


    public boolean indexer(String url, Document document, String domain) {
//        System.out.println("IndexerApplication");
//        if(domains.contains(domain)) {
//            return true;
//        }
//        String title = document.title();
//        for(String word : words) {
//            if(title.contains(word) && !isPresent(indexed, title)) {
//                System.out.println(title);
//                indexed.add(new Pair(url, title, words(document)));
//                break;
//            }
//        }

        int count = 0;
        Map<String, Integer> map = new HashMap<>();

        for (Element paragraph : document.select("title")) {
            String arr[] = paragraph.text().trim().split("[^a-zA-Z]+");
            for (String s : arr) {
                s = s.toLowerCase();
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                } else {
                    map.put(s, 1);
                }
            }

            for (String word : words) {
                if (map.containsKey(word)) {
                    System.out.println("IndexerApplication: "+word);
//                    indexed.add(new Pair(url, map));
//                    domains.add(domain);
                    return true;
                }
            }
        }
        return false;
//    public HashSet<String> words(Document document) {
//        HashSet hashSet = new HashSet<>();
//        Elements elements = document.select("p");
//        for (Element element : elements) {
//            String paragraph = element.text();
//            String words[] = paragraph.trim().split("[' ']");
//            for (String word : words) hashSet.add(word);
//        }
//        return hashSet;
//    }
//    public boolean isPresent(List<Pair> indexed, String title) {
//        for(Pair pair : indexed) {
//            if(pair.title.equals(title)) return true;
//        }
//        return false;
//        }
    }
}
