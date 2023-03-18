package com.crawler.crawler;
import com.indexer.*;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CrawlerApplication{
	private static final int MAX_DEPTH = 3;
	private Thread thread;
	public String first_link;
	private static List<String> visited = new ArrayList<>();
	private int ID;
	int threadno;
	static IndexerApplication indexerApplication = new IndexerApplication();
	public CrawlerApplication(String link, int num, int no) {


		first_link = link;
		ID = num;
		thread = new Thread(this::run);
		thread.start();
		threadno = no;
	}

	public void run() {

		try {
//			System.out.println("Thread started");
			crawl(first_link);
		}
		catch (Exception e) {}
	}

	public void crawl(String url) throws Exception {

		crawl(0, url);
	}
	public void crawl(int level, String url) {
		if(level > 2 || (visited.contains(url) && !url.equals(first_link))) {
			return;
		}

		visited.add(url);
		Document document = request(url);

		if(document != null) {
			indexerApplication.indexer(url, document);

			for(Element link : document.select("a[href]")) {
				String next_link = link.absUrl("href");
				crawl(level+1, next_link);
			}
		}
	}

	public Thread getThread() {
		return thread;
	}

	public static Document request(String url){
		try {
			Connection connection = Jsoup.connect(url);
			Document document = connection.get();

			if(connection.response().statusCode() == 200) {
//				System.out.println("Link: " + url);
//				System.out.println(document.title());
				return document;
			}

		}
		catch (Exception E) {}

		return null;
	}
}



//class Crawle {
//	public static void crawl(int level, String url, List<String> visited) throws Exception{
//		if(level > 5 || visited.contains(url)) return;
//		Document document = request(url, visited);
//
//		if(document != null) {
//			for(Element link : document.select("a[href]")) {
//				String next_link = link.absUrl("href");
//				crawl(level++, next_link, visited);
//			}
//		}
//	}
//
//	public static Document request(String url, List<String> visited) throws Exception{
//		try {
//			Connection connection = Jsoup.connect(url);
//			Document document = connection.get();
//
//			if(connection.response().statusCode() == 200) {
//				System.out.println("Link: " + url);
//				System.out.println(document.title());
//				visited.add(url);
//			}
//			return document;
//		}
//		catch (Exception E) {}
//
//		return null;
//	}
//}