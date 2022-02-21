package com.breeze.storage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.breeze")
@SpringBootApplication
public class BreezeStorageApplication {

    public static void main(String[] args) {
        SpringApplication.run(BreezeStorageApplication.class, args);
    }

}
