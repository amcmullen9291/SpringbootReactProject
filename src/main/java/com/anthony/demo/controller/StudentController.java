package com.anthony.demo.controller;

import com.anthony.demo.entity.Student;
import com.anthony.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;  //two kinds. don't use tomcat
import org.springframework.web.bind.annotation.*;

import java.awt.*;
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

    @RequestMapping(value="/{id}", method=RequestMethod.GET) //its RESTful by default; '/students/id'
    public Student getStudentById(@PathVariable("id") int id){ return this.studentService.getStudentById(id); };

    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id){
        studentService.deleteStudentById(id);
    }
    @RequestMapping(value="/{id}/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student student){ studentService.updateStudent(student); }

    //@add error messages for bad https
}
