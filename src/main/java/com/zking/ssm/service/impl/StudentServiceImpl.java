package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.StudentMapper;
import com.zking.ssm.model.Student;
import com.zking.ssm.service.IStudentService;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;

    public StudentServiceImpl() {
    }

    public StudentMapper getStudentMapper() {
        return studentMapper;
    }

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public int add(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int edit(Student student) {
        return studentMapper.updateByPrimaryKeySelective(student);
    }

    @Override
    public int del(Student student) {
        return studentMapper.del(student);
    }

    @Override
    public int dels(Student student) {
        return studentMapper.dels(student);
    }

    @Override
    public Student load(Student student) {
        return studentMapper.load(student);
    }

    @Override
    public List<Student> list(Student student, PageBean pageBean) {
//        if (null != pageBean && pageBean.isPagination()) {
//            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
//        }

        List<Student> list = studentMapper.list(student);

//        if (null != pageBean && pageBean.isPagination()) {
//            PageInfo pageInfo = new PageInfo(list);
//            pageBean.setTotal(pageInfo.getTotal() + "");
//        }
        return list;
    }
}
