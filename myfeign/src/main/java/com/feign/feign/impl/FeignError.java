package com.feign.feign.impl;

import com.feign.entity.Student;
import com.feign.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @Auther: 72943
 * @Date: 2019/11/6 15:08
 * @Description:
 */

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中。。。";
    }
}
