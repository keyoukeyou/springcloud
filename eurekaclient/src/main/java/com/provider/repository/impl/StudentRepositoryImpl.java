package com.provider.repository.impl;

import com.provider.entity.Student;
import com.provider.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 72943
 * @Date: 2019/11/4 15:06
 * @Description:
 */

@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "张三", 18));
        studentMap.put(2L, new Student(2L, "李四", 22));
        studentMap.put(3L, new Student(3L, "王五", 36));
    }


    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {

        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(Long id) {

        studentMap.remove(id);
    }
}
