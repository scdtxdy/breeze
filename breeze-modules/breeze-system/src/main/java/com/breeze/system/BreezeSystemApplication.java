package com.breeze.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients("com.breeze")
@SpringBootApplication
public class BreezeSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BreezeSystemApplication.class, args);
    }

}
