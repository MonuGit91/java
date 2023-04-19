package com.webSearchEngine.services;

import java.net.URL;
import java.util.*;

import static com.webSearchEngine.services.StaticVariables.*;

public class Ranker {
    public static List<URL> urls= new ArrayList<>();
    public static void ranking(List<Pair> list, String keys[]) {
        Set<String> urlSet = new HashSet<>();
        if(list == null) {
            list = new ArrayList<>();
            return;
        }
        if(!list.isEmpty()) Collections.sort(list, new Descending(keys));

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


class Descending implements Comparator<Pair> {
    String key[];
    public Descending(){}
    public Descending(String key[]) {
        this.key = key;
    }
    @Override
    public int compare(Pair o1, Pair o2) {
        int matchedKeys1 = 0;
        int matchedKeys2 = 0;
        for(String word : key) {
            word = word.toLowerCase();
            if(o1.map.containsKey(word)) matchedKeys1++;
            if(o2.map.containsKey(word)) matchedKeys2++;
        }
        if(matchedKeys1 != matchedKeys2) {
            return matchedKeys1-matchedKeys2;
        }

        matchedKeys1 = 0;
        matchedKeys2 = 0;
        for(String word : key) {
            word = word.toLowerCase();
            if(o1.map.containsKey(word)) {
                matchedKeys1 += o1.map.get(word);
            }
            if(o2.map.containsKey(word)) {
                matchedKeys2 += o2.map.get(word);
            }
        }
        return matchedKeys1-matchedKeys2;
    }

}