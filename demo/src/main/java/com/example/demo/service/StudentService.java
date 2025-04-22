// service/StudentService.java
package com.example.demo.service;

import com.example.demo.model.StudentModel;
import java.util.List;

public interface StudentService {
    StudentModel saveStudent(StudentModel student);
    List<StudentModel> getAllStudents();
    StudentModel getStudentById(Long id);
    StudentModel updateStudent(Long id, StudentModel student);
    void deleteStudent(Long id);
}
