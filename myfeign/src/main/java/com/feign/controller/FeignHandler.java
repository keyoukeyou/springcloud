package com.feign.controller;

import com.feign.entity.Student;
import com.feign.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Auther: 72943
 * @Date: 2019/11/6 14:26
 * @Description:
 */

@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Autowired
    private FeignProviderClient feignProviderClient;


    @GetMapping("/hello")
    public String test(){

        return "hello feign";
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll(){

        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
