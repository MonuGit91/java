package com.webSearchEngine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "com.webSearchEngine.*")
public class ApplicationRunner{
    public static void main(String[] args){
        SpringApplication.run(ApplicationRunner.class, args);

    }
}
