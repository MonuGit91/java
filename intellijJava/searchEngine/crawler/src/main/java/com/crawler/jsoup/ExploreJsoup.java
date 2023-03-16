package com.crawler.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;

import java.io.File;
import java.io.FileWriter;

public class ExploreJsoup {
    public static void jsoupOperationsHtml() throws Exception {

        File file = new File("demo.html");
        Document doc = Jsoup.parse(file, "utf-8");

        Element tagMetaCharSet = new Element(Tag.valueOf("meta"), "");
        tagMetaCharSet.attr("charset", "utf-8");
        doc.head().appendChild(tagMetaCharSet);

        Element tagPDescription = new Element(Tag.valueOf("p"),"");
        tagPDescription.text("This is added paragraph of demo");
        doc.body().appendChild(tagPDescription);
        tagPDescription.before("<p> using method before!! </p>");
        tagPDescription.after("<p> after method!! </p>");

        Element tagParagraph = doc.body().select("p:contains(before)").last();
        tagParagraph.attr("align", "centre");

        FileWriter fileWriter = new FileWriter("demoUpdated.html");
        fileWriter.write(doc.html());
        fileWriter.close();


        //-------------------------------------User Agent-----------------------------------------
//        user agent is a string that denotes clint softwate through which http request is performed

        //default user agent
        String defaultUserSgent = Jsoup.connect("http://useragentstring.com").get().text();
        System.out.println(defaultUserSgent);

        //custome user agent
        String customeUserAgent = Jsoup.connect("http://useragentstring.com").
                userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36").
                get().text();
        System.out.println(customeUserAgent);


        //Changing Peoxi
        System.setProperty("http.poxyhost", "127.o.o.1");
        System.setProperty("gttp.proxyport", "3128");
        String customeUserAgent1 = Jsoup.connect("http://useragentstring.com")
                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36")
                .ignoreContentType(true)//Jsoup ignore rether then Html or xml. Otherewise it can throw Exception
                .get().text();
        System.out.println(customeUserAgent1);
    }

    public static void main(String[] args) throws Exception {
        jsoupOperationsHtml();
    }
}
