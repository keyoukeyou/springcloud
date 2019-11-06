package com.feign.feign;

import com.feign.entity.Student;
import com.feign.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @Auther: 72943
 * @Date: 2019/11/6 14:37
 * @Description:
 */

@FeignClient(value = "provider",fallback = FeignError.class) //降级处理
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String index();
}
