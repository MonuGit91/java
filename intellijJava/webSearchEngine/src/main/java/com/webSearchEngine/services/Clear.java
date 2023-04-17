package com.webSearchEngine.services;

import java.util.ArrayList;
import java.util.LinkedList;

import static com.webSearchEngine.services.StaticVariables.*;

public class Clear {
    public static void cleanMemory() {
        Ranker.urls = new ArrayList<>();
        IndexerApplication.indexed = new ArrayList<>();
        visited = new ArrayList<>();
        q = new LinkedList<>();
        domains = new ArrayList<>();
    }
}
