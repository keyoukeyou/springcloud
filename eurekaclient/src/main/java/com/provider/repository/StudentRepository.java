package com.provider.repository;

import com.provider.entity.Student;

import java.util.Collection;

/**
 * @Auther: 72943
 * @Date: 2019/11/4 15:03
 * @Description:
 */
public interface StudentRepository {

    Collection<Student> findAll();

    Student findById(Long id);

    void saveOrUpdate(Student student);

    void deleteById(Long id);
}
