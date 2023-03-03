package com.crawler.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExploreJsoup {
    public static void jsoupOperationsHtml() {
        try {
            File file = new File("demo.html");
            Document doc = Jsoup.parse(file, "utf-8");

            Element tagMetaCharSet = new Element(Tag.valueOf("meta"), "");
            tagMetaCharSet.attr("charset", "utf-8");
            doc.head().appendChild(tagMetaCharSet);


            FileWriter fileWriter = new FileWriter("demoUpdated.html");
            fileWriter.write(doc.html());
            fileWriter.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        jsoupOperationsHtml();
    }
}
