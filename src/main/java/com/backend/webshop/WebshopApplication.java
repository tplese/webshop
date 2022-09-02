package com.backend.webshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class WebshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebshopApplication.class, args);
    }

}
