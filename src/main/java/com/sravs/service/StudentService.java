package com.sravs.service;

import com.sravs.model.Student;
import com.sravs.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;
    public Student addStudent(Student student){
        return  studentRepo.save(student);
    }
    public  Student getStudent(int id) {
        return  studentRepo.findById(id).get();
    }
}
