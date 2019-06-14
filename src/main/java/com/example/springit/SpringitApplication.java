package com.example.springit;

import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringitApplication {

//    private static final Logger log = (Logger) LoggerFactory.getLogger(SpringitApplication.class);
//    private static final org.slf4j.Logger log = (org.slf4j.Logger) LoggerFactory.getLogger(SpringitApplication.class);
    private static final org.slf4j.Logger log =  LoggerFactory.getLogger(SpringitApplication.class);


    public static void main(String[] args) {
         SpringApplication.run(SpringitApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {
        return args -> {
            log.error("CommandLineRunner.run();");
            log.warn("CommandLineRunner.run();");
            log.info("CommandLineRunner.run();");
            log.debug("CommandLineRunner.run();");
            log.trace("CommandLineRunner.run();");
        };
    }
}
















