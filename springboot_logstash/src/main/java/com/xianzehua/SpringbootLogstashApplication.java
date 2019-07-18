package com.xianzehua;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 欢迎访问博客
 * http://xianzehua.com
 */
@SpringBootApplication
@RestController
public class SpringbootLogstashApplication {

    Logger logger = LoggerFactory.getLogger(SpringbootLogstashApplication.class);

    @GetMapping("test")
    public void test(){
        logger.info("Spring Boot, ELK日志收集测试");
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootLogstashApplication.class, args);
    }

}

