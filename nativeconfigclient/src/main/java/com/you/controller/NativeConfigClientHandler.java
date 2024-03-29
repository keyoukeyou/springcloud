package com.you.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 72943
 * @Date: 2019/11/6 16:32
 * @Description:
 */

@RestController
@RequestMapping("/native")
public class NativeConfigClientHandler {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;


    @GetMapping("/index")
    public String index(){

        return this.port+this.foo;
    }
}
