package com.djpt.qj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.djpt"})
@MapperScan(basePackages = {"com.djpt.qj.mapper"})
public class QjApplication {
    public static void main(String[] args) {
            SpringApplication.run(QjApplication.class, args);
    }
}
