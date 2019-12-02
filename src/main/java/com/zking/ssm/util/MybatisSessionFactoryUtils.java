package com.zking.ssm.util;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 用于读取配置文件
 * 获取上下文中的内容
 * 注解式开发就不需要了
 */
public class MybatisSessionFactoryUtils {

    public static SqlSessionFactory sqlSessionFactory;

    private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<SqlSession>();

    static {
        try {
            InputStream is = MybatisSessionFactoryUtils.class
                    .getResourceAsStream("/mybatis.cfg.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private MybatisSessionFactoryUtils() {
    }

    public static SqlSession openSession() {
        SqlSession sqlSession = threadLocal.get();
        if (null == sqlSession) {
            sqlSession = sqlSessionFactory.openSession();
            threadLocal.set(sqlSession);
        }
        return sqlSession;
    }

    public static void closeSession() {
        SqlSession sqlSession = threadLocal.get();
        if (null != sqlSession) {
            threadLocal.set(null);
            sqlSession.close();
        }
    }

    public static void main(String[] args) {
        SqlSession sqlSession = MybatisSessionFactoryUtils.openSession();
        System.out.println(sqlSession);
        System.out.println(sqlSession.getConnection());
        MybatisSessionFactoryUtils.closeSession();
    }

}
