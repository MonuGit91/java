package com.webSearchEngine.services;

import com.webSearchEngine.services.fileInput.FileInput;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.ui.Model;
import java.net.URI;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//import static com.webSearchEngine.services.CrawlerApplication.request;
import static com.webSearchEngine.services.StaticVariables.*;

public class Others extends FileInput {

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
            return domainName;
        } catch (Exception e) {
//            System.out.println("Exception in domainExtract in CrawlerApplication");
        }
        return null;
    }

    public static void fillWebPage(Model model, String quarry, List<Pair> list) {
        if(list.size() == 0) {
            list.add(new Pair("", null, "", "", ""));
        }
        checkResultList(list);
        try {
            model.addAttribute("quarry", quarry);
            model.addAttribute("finalList", list);
            model.addAttribute("wikiPara", wikiList.get(0).demoParagraph);
            model.addAttribute("wikiPara1", wikiList.get(1).demoParagraph);
            model.addAttribute("wikiUrl", wikiList.get(0).url);
            model.addAttribute("wikiTitle", wikiList.get(0).title);
        } catch (Exception e) {
            if(wikiList.size() == 0) {
                wikiList.add(new Wiki("", null, "Wikipedia result not found!!", "", ""));
                model.addAttribute("wikiPara", wikiList.get(0).demoParagraph);
            }
        }
    }

    private static void checkResultList(List<Pair> list) {
        try {
            for(Pair pair : list) {
                if(pair.map != null) {
                    if(pair.demoParagraph.length() < 100) {
                        Document document = IndexerApplication.request(pair.url);
                        for(Element paraElement : document.select("p")) {
                            String text = paraElement.text();
                            if(text.length() > 100) {
                                pair.demoParagraph = text.substring(0, 100)+"...";
                                break;
                            }
                        }
                    }
                }
            }
            for(Pair pair : list) if(pair.demoParagraph.length() < 100) list.remove(pair);
        }
        catch (Exception e) {}

    }

    public static String filterQuarry(String quarry) {
        String arr[] = quarry.trim().split("[^a-zA-Z]+");
        fileInput();
        Set<String> removable = new HashSet<>();
        while (scan.hasNext()) {
            removable.add(scan.next());
        }
        for (String str : removable) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(str)) arr[i] = "";
            }
        }
        quarry = "";
        for (int i = 0; i < arr.length; i++) {
            quarry += (arr[i] + " ");
        }
        return quarry.trim();
    }

}
