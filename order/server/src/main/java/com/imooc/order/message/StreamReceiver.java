package com.imooc.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * @author: jbwang0106
 * @description: 消息接收者
 * @create: 2018-06-02 13:19
 **/
@Component
@Slf4j
@EnableBinding(StreamClient.class)
public class StreamReceiver {

    @StreamListener(StreamClient.OUTPUT)
    public void process(Object message) {
        log.info("Stream Receiver: {}", message);
    }
}
