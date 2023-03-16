package com.Ranker;
import com.others.Pair;

import java.util.*;
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

public class Ranker {
    public static void ranking(List<Pair> list, String key) {
//        System.out.println("hii1");
//        System.out.println(list.size());
        Collections.sort(list, new Descending(key));
//        System.out.println("hii2");
        for(Pair pair : list) {

            System.out.println("java " + pair.map.get(key)+ " " + pair.url);
        }
        list.clear();
    }
}
