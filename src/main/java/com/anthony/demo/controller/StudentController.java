package com.anthony.demo.controller;

import com.anthony.demo.entity.Student;
import com.anthony.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/students")  // the route
public class StudentController {

    @Autowired  // removes need for NEW keyword
    private StudentService studentService;

    @RequestMapping(method= RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    };

    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){ return this.studentService.getStudentById(id); };

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id){
        studentService.deleteStudentById(id);
    }
}
