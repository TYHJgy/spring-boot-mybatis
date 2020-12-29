package com.example.controller;

import com.example.entity.Student;
import com.example.entity.User;
import com.example.service.StudentService;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* 注解方式使用mybatis
* */
@RestController
@RequestMapping("/")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("getStudent/{num}")
    public Student GetStudent(@PathVariable int num){
        System.out.println("enter");
        return studentService.findByNum(num);
    }
}
