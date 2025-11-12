package com.example.mcvcrud.service;

import com.example.mcvcrud.entity.Student;

import java.util.List;

public interface StudentService {
    Student createStudent(Student student);
    List<Student> getAllStudents();
}
