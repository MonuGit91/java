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
        String demoPara = "";
        String title = document.title();
//        String domain = Others.domainExtract(url);
        if (wiki(url, document, title, indexed, words, demoPara)) return true;

        boolean isIndexed = pars(url, document, demoPara, title, title);
        if (isIndexed) return true;

        for (int i = 1; i < 7; i++) {
            String heading = "h" + i;
            for (Element headingElement : document.select(heading)) {
                String text = headingElement.text();
                System.out.println(heading + ": " + text);
                isIndexed = pars(url, document, demoPara, title, text);
                if (isIndexed) return true;
            }
        }
        return false;
    }

    public boolean pars(String url, Document document, String demoPara, String title, String text) {
        String arr[] = text.trim().split("[^a-zA-Z]+");
        for (String s : arr) {
            s = s.toLowerCase();
            for (String word : words) {
                if (s.contains(word.toLowerCase())) {
                    System.out.println(word);
                    if (text.length() > 160) demoPara = text.substring(0, 150) + "...";
                    demoPara = demoParaExtract(document);
                    indexed.add(new Pair(url, demoPara, title));
                    return true;
                }
            }
        }

//

//        }
        return false;
    }

    private String demoParaExtract(Document document) {
        String demoPara = "";
        for(Element para : document.select("p")) {
            String text = para.text();
            if (text.length() >= 150 && demoPara.length() < 110) {
                demoPara = text;
                if(text.length() > 100) {
                    demoPara = text.substring(0, 100) + "...";
                    return demoPara;
                }
            }
        }
        return "";
    }
    private boolean wiki(String url, Document document, String title, List<Pair> indexed, String[] words, String demoPara) {
        if (!url.contains("wiki")) return false;
        int matchedWords = 0;
        for (Element pe : document.select("p")) {
            String text = pe.text();
            String textArr[] = text.split("[^a-zA-Z]+");

            for (String quarryWord : words) {
                for (String textWord : textArr) {
                    if (textWord.contains(quarryWord)) {
                        matchedWords++;
                        if (matchedWords >= 5) {
                            indexed.add(new Pair(url, demoPara, title));

                            if (text.length() >= 200) {
                                if (demoPara.length() == 0) demoPara = text;
                                if (wikiList.size() < 2) {
                                    fillWiki(url, document, text, title);
                                }
                            }


                            return true;
                        }
                    }
                }
            }
        }
        return true;
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
