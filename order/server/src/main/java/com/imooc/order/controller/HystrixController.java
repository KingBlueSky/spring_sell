package com.imooc.order.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: jbwang0106
 * @description: hystrix controller
 * @create: 2018-06-02 21:21
 **/

@RestController
@RequestMapping("hystrix")
@DefaultProperties(defaultFallback = "defaultFallback")
public class HystrixController {

//    @HystrixCommand(commandProperties = {
//           // @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000"), //超时时间
//            @HystrixProperty(name = "circuitBreaker.enabled", value = "true"), //允许开启熔断器模式
//            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "10"), //调用多少次以后会开启熔断
//            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000"), //多少时间后开启半熔断
//            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "60") //失败达到多少百分比就开启熔断
//        }
//    )
    @HystrixCommand
    @GetMapping("list")
    public String orderForList(@RequestParam Integer number) {
        if (number % 2 == 0) {
            return "success";
        }
        RestTemplate restTemplate = new RestTemplate();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return restTemplate.getForObject("http://localhost:8081/product/list", String.class);
    }

    private String fallback() {
        return "太拥挤了，请稍后再试~~~";
    }

    private String defaultFallback() {
        return "默认提示：太拥挤了，请稍后再试~~~";
    }
}
