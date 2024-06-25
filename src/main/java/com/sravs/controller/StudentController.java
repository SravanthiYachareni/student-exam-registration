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
    public String add(@RequestBody Student student) {
        String result=studentService.saveStudent(student);
       if("Yes".equals(result)) {
           return "already exists";
       }else
       return  "added";

    }
    @GetMapping("login/{email}")
    public Optional<Student> get(@PathVariable String email){
        return  studentService.getStudent(email);
    }
    @GetMapping("getStudent/{email}/{password}")
    public  Optional<Student> getStudent(@PathVariable String email,@PathVariable String password) {
         return  studentService.getStudentByMail(email,password);
    }
}
