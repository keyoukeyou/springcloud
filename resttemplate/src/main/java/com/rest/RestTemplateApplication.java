package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: 72943
 * @Date: 2019/11/5 11:14
 * @Description:
 */
@SpringBootApplication
public class RestTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class,args);
    }

    /**
     *  restTemplate是spring框架提供的基于REST服务的组件，底层是对HTTP请求及响应进行了封装，提供了很多访问REST服务的方法，可以简化代码的开发
     * @return
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
