package com.imooc.order.controller;

import com.imooc.order.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author: jbwang0106
 * @description: 消息发送controller
 * @create: 2018-06-02 13:26
 **/
@RestController
public class SendController {

    @Autowired
    private StreamClient streamClient;

    @GetMapping("/send/message")
    public void process() {
        String message = "now: " + new Date();
        streamClient.output().send(MessageBuilder.withPayload(message).build());

    }
}
