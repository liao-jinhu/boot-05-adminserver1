package com.liao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@MapperScan("com.liao.mapper") //扫描Mapper包
@SpringBootApplication
public class Boot05Adminserver1Application {

    public static void main(String[] args) {

        SpringApplication.run(Boot05Adminserver1Application.class, args);
    }

}
