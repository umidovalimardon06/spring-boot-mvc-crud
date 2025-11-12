package com.example.mcvcrud.controller;

import com.example.mcvcrud.entity.Student;
import com.example.mcvcrud.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "createStudent";
    }

    @PostMapping("/create")
    public String createStudent(@ModelAttribute("student") Student student, Model model) {
        studentService.createStudent(student);
        model.addAttribute("message", "Student created successfully!");
        model.addAttribute("student", new Student());
        return "createStudent";
    }

    @GetMapping("/showall")
    public String showAllStudents(Model model) {
        // Service orqali barcha studentlarni olamiz
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "showAllStudents.html"; // Thymeleaf template nomi
    }

}
