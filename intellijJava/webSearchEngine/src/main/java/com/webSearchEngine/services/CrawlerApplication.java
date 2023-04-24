package com.webSearchEngine.services;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.lang.String;
import static com.webSearchEngine.services.StaticVariables.*;

public class CrawlerApplication implements Runnable{
    private static final int MAX_DEPTH = 3;
    private Thread thread;
    public String first_link;
    int ID;
    int threadno;
    private String domain;
    static IndexerApplication indexerApplication = new IndexerApplication();

    public CrawlerApplication(String first_link, int num, int no) {
        this.domain = Others.domainExtract(first_link);
        this.first_link = first_link;
        thread = new Thread(this::run);
        thread.start();
        ID = num;
        threadno = no;
    }

    public void run() {
        try {
            crawlLinkBfs(first_link);
        } catch (Exception e) {
        }
    }

    public void crawlLinkBfs(String first_link) {
        int level = 0;
        q.add(first_link);
        visited.add(first_link);
        while(!q.isEmpty() && indexerApplication.indexed.size() < 40 && level < MAX_DEPTH) {
            level++;
            String qurl = q.poll();
            Document document = IndexerApplication.request(qurl);
            if (document == null || qurl == null || !Others.domainExtract(qurl).equals(domain)) {
                return; }
//            System.out.println(qurl);
            boolean isIndexed = indexerApplication.indexer(qurl, document);
            if(isIndexed) { return; }

            for(Element link : document.select("a[href]")) {
                String nextLink = link.absUrl("href");
                if(visited.contains(nextLink)) { continue; }
                q.add(nextLink);
                visited.add(nextLink);
            }
        }
    }

    public Thread getThread() {
        return thread;
    }

}
