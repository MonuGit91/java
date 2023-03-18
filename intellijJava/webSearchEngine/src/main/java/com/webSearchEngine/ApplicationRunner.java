package com.webSearchEngine;

import com.webSearchEngine.services.CrawlerApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

import static com.webSearchEngine.services.fileInput.FileInput.fileInput;
import static com.webSearchEngine.services.fileInput.FileInput.scan;

@SpringBootApplication
public class ApplicationRunner{
    public static void main(String[] args){
        fileInput();
        SpringApplication.run(ApplicationRunner.class, args);

    }
}
