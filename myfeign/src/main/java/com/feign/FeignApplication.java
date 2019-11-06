package com.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: 72943
 * @Date: 2019/11/6 14:24
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
public class FeignApplication {

    /*
    feign与ribbon一样，也是由Netflix提供的，是一个声明式的、模块化的web server客户端，简化了开发者编写Web服务客户端的操作，开发者可以通过简单的接口和注解来调用HTTP API。
    spring cloud feign整合了Ribbon和Hystrix，具有可插拔、基于注解、负载均衡、服务熔断等一系列便捷功能。

    相较于Ribbon + RestTemplate的方式，feign大大简化了代码的开发，feign支持多种注解，包括Feign注解、JAX-RS注解、spring mvc注解等
    Spring Cloud对Feign进行了优化、整合了Ribbon和Eureka，从而让feign的使用更加便捷
     */

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class,args);
    }
}
