package com;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@Slf4j
@SpringBootApplication
public class SpringBootExampleApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootExampleApplication.class, args);
    }
}
