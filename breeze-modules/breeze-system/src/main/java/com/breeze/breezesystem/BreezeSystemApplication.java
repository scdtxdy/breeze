package com.breeze.breezesystem;

import com.breeze.common.core.constant.Contanttest;
import com.breeze.common.core.utils.Testutil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BreezeSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BreezeSystemApplication.class, args);
    }

    @Autowired
    private Testutil testutil;
    @GetMapping("/test/a")
    public String test() {
        String a = Contanttest.a;
        return testutil.utilstest(a);
    }

}
