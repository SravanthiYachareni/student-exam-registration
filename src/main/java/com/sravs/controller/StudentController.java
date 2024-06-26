package com.sravs.controller;

import com.sravs.model.Student;
import com.sravs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;
@PostMapping("add")
public  Student createStudent(@RequestBody Student student){
    return  studentService.addStudent(student);
}
@GetMapping("/getStudent/{id}")
public  Student getStudentById(@PathVariable("id") int id) {
    return  studentService.getStudent(id);
}
}
