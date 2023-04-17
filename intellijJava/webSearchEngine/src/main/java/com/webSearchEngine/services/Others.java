package com.webSearchEngine.services;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.ui.Model;

import java.net.URI;
import java.util.List;

import static com.webSearchEngine.services.StaticVariables.*;

public class Others {
    public static void checkQuary(Document doc) {
        if(doc.title().contains("java")) {
            System.out.println("title: " + doc.title());
        }

        for(Element element : doc.select("p")) {
            String para = element.text();
            if(para.contains("java")) {
                System.out.println("P: " + para);
            }
        }
    }

    public static String domainExtract(String url) {
        try {
            URI uri = new URI(url);
            String domainName = uri.getHost();
            if (domainName == null) {
                String authority = uri.getAuthority();
                if (authority != null) {
                    int index = authority.indexOf(":");
                    if (index != -1) {
                        domainName = authority.substring(0, index);
                    } else {
                        domainName = authority;
                    }
                }
            }
//            System.out.println("Domain name: " + domainName);
            return domainName;
        } catch (Exception e) {
            System.out.println("Exception in domainExtract in CrawlerApplication");
        }
        return null;
    }
    public static void fillWiki(String url, Document document, String text, String domain, String title) {
        if(wikiList.size() >= 2) return;

        if(text.length() > 200) text = text.substring(0, 190)+"...";
        wikiList.add(new Wiki(url, document, text, domain, title));
    }

    public static void fillWebPage(Model model, String quarry, List<Pair> l) {
        model.addAttribute("quarry", quarry);
        model.addAttribute("finalList", l);
        model.addAttribute("wikiPara", wikiList.get(0).demoParagraph);
        model.addAttribute("wikiPara1", wikiList.get(1).demoParagraph);
        model.addAttribute("wikiUrl", wikiList.get(0).url);
        model.addAttribute("wikiTitle", wikiList.get(0).title);
    }
}
