package com.djun.tyt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@MapperScan("com.djun.tyt.mapper")
@SpringBootApplication(scanBasePackages = "com.djun")
public class TytApplication {

    public static void main(String[] args) {
        SpringApplication.run(TytApplication.class, args);
    }

}
