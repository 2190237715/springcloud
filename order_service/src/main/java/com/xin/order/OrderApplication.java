package com.xin.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 启动类
 * @author: fuqiangxin
 * @time: 2020-09-14 16:27
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
//@EnableCircuitBreaker
//@EnableHystrixDashboard
@EntityScan("com.xin.order.entity")
public class OrderApplication {

//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class);
    }
}
