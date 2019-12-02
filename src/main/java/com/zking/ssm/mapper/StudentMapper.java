package com.zking.ssm.mapper;

import com.zking.ssm.model.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer sid);

    int del(Student student);
    int dels(Student student);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer sid);

    Student load(Student student);

    List<Student> list(Student student);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}