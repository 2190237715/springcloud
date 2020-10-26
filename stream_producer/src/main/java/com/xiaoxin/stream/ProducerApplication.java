package com.xiaoxin.stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
/**
 * @description: 1.引入依赖
 * 2.配置application.xml文件
 * 3.定义通道接口（内置）
 * 4.绑定对应通道 @EnableBinding
 * 5.发送消息通过MessageChannel发送
 * @author: fuqiangxin
 * @time: 2020-10-24 10:35
 */
@SpringBootApplication
@EnableBinding(Source.class)
public class ProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class);
    }
}
