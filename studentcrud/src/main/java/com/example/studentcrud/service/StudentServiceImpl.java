package com.example.studentcrud.service;

import com.example.studentcrud.model.StudentModel;
import com.example.studentcrud.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo repository;

    @Override
    public StudentModel saveStudent(StudentModel student) {
        // Just saving the student directly to the DB
        return repository.save(student);
    }

    @Override
    public List<StudentModel> getAllStudents() {
        // Get all students
        return repository.findAll();
    }

    @Override
    public StudentModel getStudentById(Long id) {
        // Try to get student by ID, return null if not found
        return repository.findById(id).orElse(null);
    }

    @Override
    public StudentModel updateStudent(Long id, StudentModel student) {
        // Check if student with given ID exists
        StudentModel existing = repository.findById(id).orElse(null);
        
        if (existing != null) {
            // Update fields
            existing.setName(student.getName());
            existing.setEmail(student.getEmail());
            existing.setCourse(student.getCourse());

            return repository.save(existing);
        }

        // Not found, return null
        return null;
    }

    @Override
    public void deleteStudent(Long id) {
        // Just delete if exists
        repository.deleteById(id);
    }
}
