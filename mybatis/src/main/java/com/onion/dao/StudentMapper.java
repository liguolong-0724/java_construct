package com.onion.dao;

import com.onion.pojo.Student;
import com.onion.pojo.StudentCard;

public interface StudentMapper {

    Student getStudentById(int id);

    int saveStudent(Student student);

    int deleteStudent(int id);

    int updateStudent(Student student);

    StudentCard getStudentCardById(int id);
}
