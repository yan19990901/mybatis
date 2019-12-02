package com.zking.ssm.service;

import com.zking.ssm.mapper.StudentMapper;
import com.zking.ssm.model.Student;
import com.zking.ssm.service.impl.StudentServiceImpl;
import com.zking.ssm.util.MybatisSessionFactoryUtils;
import com.zking.ssm.util.PageBean;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;
import java.util.Locale;

public class IStudentServiceTest extends BaseTestCase {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private IStudentService studentService;
    private Student student;
//    private SqlSession sqlSession;

    @Override
    public void before() {
//        sqlSession = MybatisSessionFactoryUtils.openSession();
//        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
//
//        StudentServiceImpl studentService = new StudentServiceImpl();
//        studentService.setStudentMapper(studentMapper);
//
//        this.studentService = studentService;

        super.before();
        student = new Student();
    }

//    @After
//    public void after() {
//        sqlSession.commit();
//    }

    @Test
    public void add() throws Exception {
        student.setSname("萧然");
        student.setAge(19);
        student.setRemark("ccaas");
        System.out.println(student);
        studentService.add(student);
    }

    @Test
    public void edit() throws Exception {
        student.setSid(406);
        student.setSname("萧然2");
        studentService.edit(student);
    }

    @Test
    public void del() throws Exception {
        student.setSid(406);
        studentService.del(student);
    }

    @Test
    public void dels() throws Exception {
        student.setSids(new Integer[]{392, 391});
        studentService.dels(student);
    }

    @Test
    public void load() throws Exception {
        student.setSid(405);
        Student s = studentService.load(student);

        System.out.println(s);
        Student ss = studentService.load(student);
        System.out.println(ss);
    }

    @Test
    public void list() throws Exception {
        pageBean.setPage(1);
        pageBean.setRows(5);

        student.setSname("张");
        List<Student> list = studentService.list(student, pageBean);
        for (Student ss : list) {
            System.out.println(ss);
        }
    }

    @Test
    public void test() {
        redisTemplate.opsForValue().set("a", "b");
    }
    @Test
    public void test2() {
        System.out.println(Locale.CHINA);
        System.out.println(Locale.US);
    }

}