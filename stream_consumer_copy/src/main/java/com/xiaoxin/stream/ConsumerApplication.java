package com.xiaoxin.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: 1.引入依赖
 * 2.配置application.xml文件
 * 3.配置通道接口（内置）
 * 4.绑定对应通道 @EnableBinding
 * 5.配置监听
 * @author: fuqiangxin
 * @time: 2020-10-24 14:41
 */
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class);
    }
}
