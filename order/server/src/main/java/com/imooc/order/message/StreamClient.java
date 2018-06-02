package com.imooc.order.message;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author: jbwang0106
 * @description: stream client
 * @create: 2018-06-02 12:45
 **/
public interface StreamClient {

    //String INPUT = "inStream";
    String OUTPUT = "outStream";

//    @Input(StreamClient.INPUT)
//    SubscribableChannel input();

    @Output(StreamClient.OUTPUT)
    MessageChannel output();

}
