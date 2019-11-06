package com.provider.controller;

import com.provider.entity.Student;
import com.provider.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @Auther: 72943
 * @Date: 2019/11/4 15:24
 * @Description:
 */

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){

        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){

        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void saveOrUpdate(@RequestBody Student student){

        studentRepository.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){

        studentRepository.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){

        studentRepository.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){

        return "当前的端口是："+ this.port;
    }
}
