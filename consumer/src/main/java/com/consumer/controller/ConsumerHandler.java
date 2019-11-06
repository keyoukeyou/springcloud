package com.consumer.controller;

import com.consumer.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @Auther: 72943
 * @Date: 2019/11/5 14:05
 * @Description:
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerHandler {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll1")
    public Collection<Student> findAll1(){
        return restTemplate.getForEntity("http://localhost:8010/student/findAll", Collection.class).getBody();
    }
    @GetMapping("/findAll2")
    public Collection<Student> findAll2(){
        return restTemplate.getForObject("http://localhost:8010/student/findAll",Collection.class);
    }


    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}",Student.class,id).getBody();
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForEntity("http://localhost:8010/student/save",student,Student.class).getBody();
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/student/update",student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id") Long id){
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}",id);
    }


}
