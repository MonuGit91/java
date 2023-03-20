package com.webSearchEngine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import static com.webSearchEngine.services.fileInput.FileInput.fileInput;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "com.webSearchEngine.*")
public class ApplicationRunner{
    public static void main(String[] args){
        fileInput();
        SpringApplication.run(ApplicationRunner.class, args);

    }
}
