package com.xin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @description:
 * @author: fuqiangxin
 * @time: 2020-09-22 10:29
 */
@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
public class TurbineApplication {
    public static void main(String[] args) {
        SpringApplication.run(TurbineApplication.class);
    }
}
