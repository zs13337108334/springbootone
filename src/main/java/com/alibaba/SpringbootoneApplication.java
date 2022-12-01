package com.alibaba;


import com.sun.javafx.tools.ant.Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.awt.*;

@Slf4j
@SpringBootApplication
//@EnableDiscoveryClient
@EnableAspectJAutoProxy
public class SpringbootoneApplication {

    public static void main(String[] args) throws InterruptedException, AWTException {
//        SpringApplication.run(SpringbootoneApplication.class);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringbootoneApplication.class);
        builder.headless(false).run(args);
        log.info("容器启动成功");
    }
}
