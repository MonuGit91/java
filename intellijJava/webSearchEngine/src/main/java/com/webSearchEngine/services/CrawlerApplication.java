package com.webSearchEngine.services;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.net.URI;
//import java.net.URL;
import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;
import java.lang.String;
import java.util.Queue;

import static com.webSearchEngine.services.StaticVariables.*;


public class CrawlerApplication {
    private static final int MAX_DEPTH = 3;
    private Thread thread;
    public String first_link;
    //    public static List<String> visited = new ArrayList<>();
    int ID;
    int threadno;
    static IndexerApplication indexerApplication = new IndexerApplication();

    public CrawlerApplication(String first_link, int num, int no) {
        this.first_link = first_link;
        thread = new Thread(this::run);
        thread.start();
        ID = num;
        threadno = no;
    }

    public void run() {

        try {
//            crawl(first_link);
//            crawlBFS(first_link);
            crawlLinkBfs(first_link);
        } catch (Exception e) {
        }
    }

    public void crawl(String url) {
        crawl(0, url);
    }

    public void crawlLinkBfs(String first_link) {
        int level = 0;
        q.add(first_link);
        visited.add(first_link);

        while(!q.isEmpty() && indexerApplication.indexed.size() < 40 && level < MAX_DEPTH) {
            level++;
            String qurl = q.poll();
            Document document = request(qurl);
            if (document == null) {
                System.out.println(level+" Empty doc "+qurl);
                return; }
            boolean isIndexed = indexerApplication.indexer(qurl, document);
            if(isIndexed) { return; }

//            for(Element link : document.select("a[href]")) {
//                String nextLink = link.absUrl("href");
//                if(visited.contains(nextLink)) { continue; }
//                q.add(nextLink);
//                visited.add(nextLink);
//            }
        }
    }


    public void crawlBFS(String url) {
        int level = 0;
        q.add(url);
        visited.add(url);

        boolean flag = false;
        while (!q.isEmpty() && indexerApplication.indexed.size() < 40) {
            level++;
            String qurl = q.poll();
            Document document = request(qurl);
            if (document == null) { return; }

            String domain = Others.domainExtract(qurl);
            if (domain == null) continue;

//            printRequirments(document);
//            boolean domainExist = indexerApplication.indexer(url, document, domain);
//            if(domainExist) return;

//            Others.checkQuary(document);
//            System.out.println(qurl);
//            System.out.println(domain);
            System.out.println(qurl);
            for (Element link : document.select("a[href]")) {
                if (indexerApplication.indexed.size() < 40) {
                    String next_link = link.absUrl("href");
                    if (!visited.contains(next_link)) {
//                        if(level >= 1 && next_link.equals(first_link)) continue;
//                        System.out.println("next link in crawler Application: "+next_link);
                        if (next_link != first_link && domain.equals(Others.domainExtract(next_link))) {
                            System.out.println(next_link);
//                            q.add(next_link);
//                            visited.add(next_link);
                        }
                    }
                } else {
//                    flag = true;
//                    break;
                }
            }
//            if (flag) break;
//            if(q.isEmpty()) System.out.println("Q is empty");
        }
//        System.out.println("Q is empty");
    }

    public void crawl(int level, String url) {
        if (level > MAX_DEPTH || (visited.contains(url) && !url.equals(first_link))) {
            return;
        }

        visited.add(url);
        Document document = request(url);
        if (document == null) {
            return;
        }
        Others.checkQuary(document);
        String domain = Others.domainExtract(url);
//        indexerApplication.indexer(url, document, domain);
        for (Element link : document.select("a[href]")) {
            if (indexerApplication.indexed.size() < 40) {
                String next_link = link.absUrl("href");
                crawl(level + 1, next_link);
            } else {
                break;
            }
        }

    }

    public Thread getThread() {
        return thread;
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
