package com.example.jpademo.service;


import com.example.jpademo.entity.Student;
import com.example.jpademo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;
    public Student saveStudent(Student student){
        return repo.save(student);
    }
    public List<Student> ListAll(){
        return repo.findAll();
    }
}