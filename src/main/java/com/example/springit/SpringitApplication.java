package com.example.springit;

import com.example.springit.domain.Comment;
import com.example.springit.domain.Link;
import com.example.springit.repository.CommentRepository;
import com.example.springit.repository.LinkRepository;
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
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {

            Link link = new Link("Getting Started with Spring Boot 2","Test");
            linkRepository.save(link);

            Comment comment = new Comment("This Spring Boot 2 link is awesome!", link);
            commentRepository.save(comment);
            link.addCommment(comment);

            System.out.println("We just inserted a link and a comment");
            System.out.println("===========================================");


        };
    }

}
















