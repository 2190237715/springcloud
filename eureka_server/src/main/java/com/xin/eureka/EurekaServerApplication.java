package com.xin.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description:
 * @author: fuqiangxin
 * @time: 2020-09-15 16:03
 */
@SpringBootApplication
//激活eureka
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class);
    }
}
