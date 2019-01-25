package com.imooc.netty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.imooc.netty"})
@SpringBootApplication
public class ImoocMuxinNettyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImoocMuxinNettyApplication.class, args);
    }

}

