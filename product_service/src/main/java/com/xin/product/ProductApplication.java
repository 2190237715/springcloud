package com.xin.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: 启动类
 * @author: fuqiangxin
 * @time: 2020-09-14 16:27
 */
@SpringBootApplication
@EnableEurekaClient
@EntityScan("com.xin.product.entity")
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class);
    }
}
