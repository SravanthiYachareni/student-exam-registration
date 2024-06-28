package com.sravs.controller;

import com.sravs.model.Student;
import com.sravs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("add")
    public Student createStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudentById(@PathVariable("id") int id) {
        return studentService.getStudent(id);
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudent() {
        return studentService.getAll();
    }
    @DeleteMapping("delete")
    public  void  deleteStudent(int id ){
        studentService.deleteStudent(id);
    }
}
