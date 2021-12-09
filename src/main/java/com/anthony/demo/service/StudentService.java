package com.anthony.demo.service;

import com.anthony.demo.dao.StudentData;
import com.anthony.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {
    @Autowired
    private StudentData studentData;

    public Collection<Student> getAllStudents(){
        return studentData.getAllStudents();
    };

    public Student getStudentById(int id){ return this.studentData.getStudentById(id); }

    public void deleteStudentById(int id) { this.studentData.deleteStudentById(id); }
    //@add an if student.id exists statements to all

}
