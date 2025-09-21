package com.example.demo.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.demo.springboot")
public class Application {

    static private Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        Todo todo1 = new Todo(1, "Vineeth", "Chittoor");
        Todo todo2 = new Todo(2, "Vineeth", "Chittoor");
        logger.info("equal or not>>{}", todo1.equals(todo2));
        logger.info("hs1->{} and hs2->{}", todo1.hashCode(), todo2.hashCode());
    }

}
