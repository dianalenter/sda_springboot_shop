package com.sda.dianalenter.webshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication

public class RestWebShopeApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestWebShopeApplication.class, args);
    }





}
