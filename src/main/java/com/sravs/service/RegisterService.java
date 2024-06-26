package com.sravs.service;

import com.sravs.model.Register;
import com.sravs.repo.RegisterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RegisterService {
    @Autowired
    RegisterRepo studentRepo;

    public String saveStudent(Register student) {
        Optional<Register> optionalStudent = studentRepo.findByEmail(student.getEmail());
        if (optionalStudent.isPresent()) {
            return "Yes";
        } else
            studentRepo.save(student);
        return "added";
    }

    public Optional<Register> getStudent(String email) {
        return studentRepo.findByEmail(email);

    }
    public Optional<Register> getStudentByMail(String email, String password) {
        return studentRepo.findByEmailAndPassword(email,password);

    }



}
