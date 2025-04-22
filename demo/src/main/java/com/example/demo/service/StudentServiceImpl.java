package com.example.demo.service;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo repository;

    @Override
    public StudentModel saveStudent(StudentModel student) {
        return repository.save(student);
    }

    @Override
    public List<StudentModel> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public StudentModel getStudentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public StudentModel updateStudent(Long id, StudentModel student) {
        StudentModel existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(student.getName());
            existing.setEmail(student.getEmail());
            existing.setCourse(student.getCourse());
            return repository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
