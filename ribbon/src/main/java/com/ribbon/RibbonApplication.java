package com.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Auther: 72943
 * @Date: 2019/11/5 16:46
 * @Description:
 */

@SpringBootApplication
public class RibbonApplication {


    /*
    spring cloud ribbon是一个负载均衡的解决方案，是Netflix发布的负载均衡器，基于Netflix Ribbon实现的，是一个对于HTTP请求进行控制的负载均衡客户端。

    在注册中心对Ribbon进行注册之后。Ribbon可以基于某种负载均衡算法，如：轮询、随机、加权轮询、加权随机等自动帮助服务消费者调用接口。开发者也可根据具体需求自定义Ribbon负载均衡的算法
    实际开发中，Spring Cloud Ribbon需要结合Spring Cloud Eureka来使用，Eureka Server提供所有可以调用的服务提供者列表，Ribbon基于特定的负载均衡算法从这些服务提供者中选择要调用的具体实例
     */

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

    /**
     * @LoadBalanced 声明一个基于Ribbon的负载均衡。加上注解之后RestTemplate的对象就可以实现负载均衡
     *
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
