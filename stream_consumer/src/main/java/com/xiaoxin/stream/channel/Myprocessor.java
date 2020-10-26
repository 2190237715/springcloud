package com.xiaoxin.stream.channel;


import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @description: 自定义消息通道
 * @author: fuqiangxin
 * @time: 2020-10-24 15:19
 */
public interface Myprocessor {

    String MYOUTPUT = "myoutput";
    String MYINPUT = "myinput";

    /**
     * 消息生产者配置
     */
    @Output("myoutput")
    MessageChannel myoutput();

    /**
     * 消息消费者配置
     */
    @Input("myinput")
    SubscribableChannel myinput();
}
