package com.webSearchEngine.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ranker {
    public static List<String> urls = new ArrayList<>();
    public static void ranking(List<Pair> list, String key) {
        Collections.sort(list, new Descending(key));

        for(Pair pair : list) {
            if(urls.size() <= 50) urls.add(pair.url);
            else break;
            System.out.println(urls.size());
        }
    }
}


class Descending implements Comparator<Pair> {
    String key;
    public Descending(){}
    public Descending(String key) {
        this.key = key;
    }
    @Override
    public int compare(Pair o1, Pair o2) {
        // TODO Auto-generated method stub
        return -o1.map.get(key).compareTo(o2.map.get(key));
    }
}