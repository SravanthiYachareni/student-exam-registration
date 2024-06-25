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

    public String saveStudent(Student student) {
        Optional<Student> optionalStudent = studentRepo.findByEmail(student.getEmail());
        if (optionalStudent.isPresent()) {
            return "Yes";
        } else
            studentRepo.save(student);
        return "added";
    }

    public Optional<Student> getStudent(String email) {
        return studentRepo.findByEmail(email);

    }
    public Optional<Student> getStudentByMail(String email,String password) {
        return studentRepo.findByEmailAndPassword(email,password);

    }



}
