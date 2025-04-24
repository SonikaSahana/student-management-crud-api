package com.example.studentcrud.controller;

import com.example.studentcrud.model.StudentModel;
import com.example.studentcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService service;

    @PostMapping
    public StudentModel createStudent(@RequestBody StudentModel student) {
        return service.saveStudent(student);
    }

    @GetMapping
    public List<StudentModel> getAllStudents() {
        return service.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentModel getStudent(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @PutMapping("/{id}")
    public StudentModel updateStudent(@PathVariable Long id, @RequestBody StudentModel student) {
        return service.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
    }
}
