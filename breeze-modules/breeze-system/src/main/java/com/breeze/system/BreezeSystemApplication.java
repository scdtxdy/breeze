package com.breeze.system;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableAutoDataSourceProxy
@EnableFeignClients("com.breeze")
@SpringBootApplication
public class BreezeSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BreezeSystemApplication.class, args);
    }

}
