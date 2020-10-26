package com.xiaoxin.stream.producer;

import com.xiaoxin.stream.channel.Myprocessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: fuqiangxin
 * @time: 2020-10-24 14:53
 */
@Component
@EnableBinding(Myprocessor.class)
public class MessageSender {

    @Autowired
    @Qualifier(value = "myoutput")
    private MessageChannel myoutput;

    public void send(String message) {
        //发送消息
        //MessageBuilder   工具类创建消息
        myoutput.send(MessageBuilder.withPayload(message).build());
    }

}
