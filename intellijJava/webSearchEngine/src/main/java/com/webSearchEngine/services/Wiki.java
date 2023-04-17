package com.webSearchEngine.services;

import org.jsoup.nodes.Document;

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
}
