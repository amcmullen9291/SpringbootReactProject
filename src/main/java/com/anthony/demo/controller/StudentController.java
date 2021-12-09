package com.anthony.demo.controller;

import com.anthony.demo.entity.Student;
import com.anthony.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/students")  // the route
public class StudentController {

    @Autowired  // removed need for NEW keyword
    private StudentService studentService;

    @RequestMapping(method= RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    };

}
