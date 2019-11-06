package com.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 72943
 * @Date: 2019/11/6 17:29
 * @Description:
 */

@RestController
@RequestMapping("/client")
public class ConfigClientHandler {

    @Value("${server.port}")
    private String port;


    @GetMapping("/index")
    public String index(){

        return this.port;
    }
}
