package com.webSearchEngine.services;

import java.net.URL;
import java.util.*;

import static com.webSearchEngine.services.StaticVariables.*;

public class Ranker {
    public static List<URL> urls= new ArrayList<>();
    public static void ranking(List<Pair> list, String keys[]) {
        System.out.println("Now Ranking web pages please wait!!");
        Set<String> urlSet = new HashSet<>();
        if(list == null) {
            list = new ArrayList<>();
            return;
        }

        for(Pair p : list) {
            urlSet.add(p.url);
        }
        for(Pair p : list) {
            if(urlSet.contains(p.url)) {
                finalList.add(p);
                urlSet.remove(p.url);
            }
        }
        if(finalList == null) finalList = list;
    }

}