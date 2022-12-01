package com.alibaba;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
//@EnableDiscoveryClient
public class SpringbootoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootoneApplication.class);
        log.info("容器启动成功");
    }
}
