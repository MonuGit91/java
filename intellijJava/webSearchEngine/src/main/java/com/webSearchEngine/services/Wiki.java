package com.webSearchEngine.services;

import org.jsoup.nodes.Document;

import static com.webSearchEngine.services.StaticVariables.wikiList;

public class Wiki {
    public String url;
    public Document document;
    public String demoParagraph;
    public String domain;
    public String title;

    public Wiki(String url, Document document, String paragraph, String domain, String title) {
        this.url = url;
        this.document = document;
        this.demoParagraph = paragraph;
        this.domain = domain;
        this.title = title;
    }
    public static void fillWiki(String url, Document document, String text, String domain, String title) {
        if(wikiList.size() >= 2) return;
        wikiList.add(new Wiki(url, document, text, domain, title));
    }
}
