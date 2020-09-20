package com.kjbin0420.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class OauthApplication {
    private final String PROPERTIES = "spring.config.location=classpath:/google.yml";

    public static void main(String[] args) {
        new SpringApplicationBuilder(OauthApplication.class)
                .properties()
                .run(args);
    }

}
