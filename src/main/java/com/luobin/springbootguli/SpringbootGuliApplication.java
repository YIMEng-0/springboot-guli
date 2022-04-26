package com.luobin.springbootguli;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.luobin.springbootguli.mapper") // 找到 mapper
public class SpringbootGuliApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootGuliApplication.class, args);
    }
}
