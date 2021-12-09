package com.anthony.demo.dao;
//Data class. data from DB

import com.anthony.demo.entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StudentData {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1,"Thomas","Baxter", 12, "Homeroom 305"));
                put(1, new Student(2,"Jessica","Phillips", 12, "Homeroom 305"));
                put(1, new Student(3,"Andrew","Mifflin", 12, "Homeroom 305"));
                put(1, new Student(4,"Sheldon","Kane", 12, "Homeroom 305"));
                put(1, new Student(5,"Peter","Brody", 12, "Homeroom 305"));
                put(1, new Student(6,"Mary","Paulsen", 12, "Homeroom 305"));
                put(1, new Student(7,"Bradley","Douglas", 12, "Homeroom 305"));
                put(1, new Student(8,"Shawn","Harper", 12, "Homeroom 305"));
                put(1, new Student(9,"Shane","Little", 12, "Homeroom 305"));
                put(1, new Student(10,"Chip","Morgan", 12, "Homeroom 305"));
                put(1, new Student(11,"Manuel","Saint", 12, "Homeroom 305"));

            }

        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    };

}
