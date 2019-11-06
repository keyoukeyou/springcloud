package com.hystrix.controller;

import com.hystrix.entity.Student;
import com.hystrix.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Auther: 72943
 * @Date: 2019/11/6 15:39
 * @Description:
 */
@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {


    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){

        return feignProviderClient.findAll();
    }


    @GetMapping("/index")
    public String index(){

        return feignProviderClient.index();
    }
}
