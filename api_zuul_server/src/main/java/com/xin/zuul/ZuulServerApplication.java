package com.xin.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @description:
 * @author: fuqiangxin
 * @time: 2020-09-23 16:30
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class);
    }
}
