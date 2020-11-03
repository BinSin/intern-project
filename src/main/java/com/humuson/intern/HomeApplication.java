package com.humuson.intern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
//@SpringBootApplication
public class HomeApplication {

    public static void main(String[] args) {

        SpringApplication.run(HomeApplication.class, args);
    }

}
