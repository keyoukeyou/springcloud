package com.zuul;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Auther: 72943
 * @Date: 2019/11/5 14:42
 * @Description:
 */
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {

    /*
    Zuul是Netflix提供的开源的API网关服务器，是客户端和网站后端所有请求的中间层，对外开放一个API，将所有请求导入统一的入口，屏蔽了服务端的具体实现逻辑，
    Zuul可以实现反向代理的功能，在网关内部实现动态路由、身份认证、IP过滤、数据监控等
    Zuul自带了负载均衡的功能

    @EnableZuulProxy  包含了@EnableZuulServer，设置该类是网关的启动类
    @EnableAutoConfiguration  可以帮助springboot应用将所有符合条件的@Configuration配置加载到当前的IOC容器中
    */

    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class, args);
    }
}
