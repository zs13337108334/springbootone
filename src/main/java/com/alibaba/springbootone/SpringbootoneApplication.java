package com.alibaba.springbootone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootoneApplication.class, args);
    }

}
