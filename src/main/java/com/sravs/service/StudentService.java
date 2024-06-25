package com.sravs.service;

import com.sravs.model.Student;
import com.sravs.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepo studentRepo;
    public Student saveStudent(Student student){
        studentRepo.save(student);
        return student;
    }
    public Optional<Student> getStudent(String email){
       return studentRepo.findByEmail(email);

    }


}