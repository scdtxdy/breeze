package com.breeze.commom.datasource.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.breeze.**.mapper")
public class MyBatisPlusConfig {

}
