package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author iisheng
 * @date 2019/08/21 15:42:36
 */
@SpringBootApplication(scanBasePackages = "com.example")
@MapperScan("com.example.mapper")
public class FreemarkerStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreemarkerStudyApplication.class, args);
    }
}
