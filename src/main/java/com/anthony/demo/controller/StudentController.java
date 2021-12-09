package com.anthony.demo.controller;

import com.anthony.demo.entity.Student;
import com.anthony.demo.service.StudentService;

import java.util.Collection;

public class StudentController {

    private StudentService studentService;

    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    };

}
