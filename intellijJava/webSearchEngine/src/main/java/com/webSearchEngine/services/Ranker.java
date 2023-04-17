package com.webSearchEngine.services;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ranker {
    public static List<URL> urls= new ArrayList<>();
    public static List<Pair> finalList;
    public static void ranking(List<Pair> list, String keys[]) {
        if(list == null) {
            list = new ArrayList<>();
            return;
        }
        Collections.sort(list, new Descending(keys[0]));

//        for(int i = list.size()-1; i > 40; i--) {
//            list.remove(i);
//        }
        System.out.println(list.size());
        finalList = list;
//        for(Pair pair : list) {
//            if(urls.size() < 50 && !urls.contains(pair.url)) {
//                try {
//                    urls.add(new URL(pair.url));
//                }
//                catch (Exception e) {}
//
//            }
//            else break;
//            System.out.println(pair.url);
//        }
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