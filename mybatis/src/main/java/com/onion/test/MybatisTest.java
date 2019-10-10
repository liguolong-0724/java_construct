package com.onion.test;

import com.onion.dao.StudentCardMapper;
import com.onion.dao.StudentMapper;
import com.onion.pojo.Student;
import com.onion.pojo.StudentCard;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;

public class MybatisTest {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(String.valueOf(MybatisTest.class));

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);

        SqlSession session = sessionFactory.openSession();
        SqlSession session1 = sessionFactory.openSession();

        StudentMapper mapper = session.getMapper(StudentMapper.class);
        StudentMapper mapper1 = session1.getMapper(StudentMapper.class);

        Student student = mapper.getStudentById(1);
        System.out.println("获取学生信息。。。");
        Student student1 = mapper1.getStudentById(1);

    }



}
