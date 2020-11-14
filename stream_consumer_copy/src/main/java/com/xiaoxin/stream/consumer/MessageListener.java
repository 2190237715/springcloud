package com.xiaoxin.stream.consumer;

import com.xiaoxin.stream.channel.Myprocessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: fuqiangxin
 * @time: 2020-10-24 15:03
 */
@Component
@EnableBinding(Myprocessor.class)
public class MessageListener {
    //监听binding中的消息
    @StreamListener(Myprocessor.MYINPUT)
    public void myInput(String message) {
        System.out.println("获取的消息为：" + message);
    }
}
