package com.example.jpademo.controller;

import com.example.jpademo.entity.Student;
import com.example.jpademo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
@RestController
public class JPAController {
    @Autowired
    private StudentService service;
    @RequestMapping("/")
    public String index(){
        Student student1=new Student("Rugma","CSE",23,"9965873214");
        service.saveStudent(student1);
        return "Student created";
    }
    @RequestMapping("/list")
    public List list(){
        return service.ListAll();
    }
    @RequestMapping("create")
    public List create(HttpServletRequest request){
        String name=request.getParameter("name");
        String phone=request.getParameter("phone");
        Student student=new Student(name,"IT",20,phone);
        service.saveStudent(student);
        return  service.ListAll();
    }
}

