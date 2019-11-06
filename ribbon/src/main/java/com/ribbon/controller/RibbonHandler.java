package com.ribbon.controller;

import com.ribbon.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @Auther: 72943
 * @Date: 2019/11/5 16:51
 * @Description:
 */
@RestController
@RequestMapping("/ribbon")
public class RibbonHandler {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://provider/student/findAll",Collection.class).getBody();
    }

    @GetMapping("/index")
    public String index(){

        return restTemplate.getForObject("http://provider/student/index",String.class);
    }
}
