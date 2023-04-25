package com.webSearchEngine.services;

import java.sql.DataTruncation;
import java.util.HashSet;
import java.util.Map;

public class Pair {
    public String url;
    public String title;
    public String demoParagraph;
    public String domain;
    public HashSet<String> words;
    public Map<String, Integer> map;

    public Pair() {
    }

    public Pair(String url, String demoPara, String title) {
        this.url = url;
        this.demoParagraph = demoPara;
        this.title = title;
    }
    public Pair(String url, String title, HashSet<String> words) {
        this.url = url;
        this.title = title;
        this.words = words;
    }

}
