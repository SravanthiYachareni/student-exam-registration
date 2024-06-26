package com.sravs.controller;

import com.sravs.model.Register;
import com.sravs.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class RegisterController {
    @Autowired
    RegisterService studentService;
    @PostMapping("/register")
    public String add(@RequestBody Register student) {
        String result=studentService.saveStudent(student);
       if("Yes".equals(result)) {
           return "already exists";
       }else
       return  "added";

    }
    @GetMapping("login/{email}")
    public Optional<Register> get(@PathVariable String email){
        return  studentService.getStudent(email);
    }
    @GetMapping("getStudent/{email}/{password}")
    public  Optional<Register> getStudent(@PathVariable String email, @PathVariable String password) {
         return  studentService.getStudentByMail(email,password);
    }
}
