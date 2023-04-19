package com.webSearchEngine.services;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class StaticVariables {
    public static List<String> visited = new ArrayList<>();
    public static List<String> domains = new ArrayList<>();
    public static Queue<String> q = new LinkedList<>();
    public static List<Wiki> wikiList = new ArrayList<>();
    public static List<Pair> finalList = new ArrayList<>();
    static ExecutorService executorService = Executors.newFixedThreadPool(500);
}
