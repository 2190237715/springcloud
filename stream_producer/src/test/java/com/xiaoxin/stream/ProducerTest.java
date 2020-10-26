package com.xiaoxin.stream;

import com.xiaoxin.stream.channel.Myprocessor;
import com.xiaoxin.stream.producer.MessageSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: fuqiangxin
 * @time: 2020-10-24 14:57
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ProducerTest {

    @Autowired
    private MessageSender messageSender;

    @Autowired
    private Myprocessor myprocessor;

    @Test
    public void testSend() {
        messageSender.send("hello 我要访问工具类");
    }
}
