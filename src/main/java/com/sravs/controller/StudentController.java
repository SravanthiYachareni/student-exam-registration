package com.sravs.controller;

import com.sravs.model.Student;
import com.sravs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/register")
    public Student add(@RequestBody Student student) {
       return studentService.saveStudent(student);

    }
    @GetMapping("login/{email}")
    public Optional<Student> get(@PathVariable String email){
        return  studentService.getStudent(email);
    }
}
