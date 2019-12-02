package com.zking.ssm.service;

import com.zking.ssm.model.Student;
import com.zking.ssm.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IStudentService {

    int add(Student student);

    int edit(Student student);

    int del(Student student);

    int dels(Student student);

    @Transactional(readOnly = true)
    Student load(Student student);

    @Transactional(readOnly = true)
    List<Student> list(Student student, PageBean pageBean);
}
