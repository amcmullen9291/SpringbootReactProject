package com.anthony.demo.service;

import com.anthony.demo.dao.StudentData;
import com.anthony.demo.entity.Student;

import java.util.Collection;

public class StudentService {

    private StudentData studentData;

    public Collection<Student> getAllStudents(){
        return studentData.getAllStudents();
    };

}
