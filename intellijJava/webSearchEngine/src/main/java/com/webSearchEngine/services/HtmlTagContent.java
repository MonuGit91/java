package com.webSearchEngine.services;

import org.jsoup.nodes.Document;

public class HtmlTagContent {
    public static String getByTag(Document doc, String tag) {
        if(doc == null) {
            System.out.println("Document is Empty");
            return null;
        }

        switch (tag) {
            case "p": {
                return doc.select(tag).text();
            }
            case "title": {
                return doc.title();
            }
            default: {
                return "is not defined in HtmlTagContent class!";
            }
        }
    }
}
