package com.anthony.demo.dao;
//Data class. data from DB

import com.anthony.demo.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentData {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1,"Thomas","Baxter", 12, "Homeroom 305"));
                put(2, new Student(2,"Jessica","Phillips", 12, "Homeroom 305"));
                put(3, new Student(3,"Andrew","Mifflin", 12, "Homeroom 305"));
                put(4, new Student(4,"Sheldon","Kane", 12, "Homeroom 305"));
                put(5, new Student(5,"Peter","Brody", 12, "Homeroom 305"));
                put(6, new Student(6,"Mary","Paulsen", 12, "Homeroom 305"));
                put(7, new Student(7,"Bradley","Douglas", 12, "Homeroom 305"));
                put(8, new Student(8,"Shawn","Harper", 12, "Homeroom 305"));
                put(9, new Student(9,"Shane","Little", 12, "Homeroom 305"));
                put(10, new Student(10,"Chip","Morgan", 12, "Homeroom 305"));
                put(11, new Student(11,"Manuel","Saint", 12, "Homeroom 305"));

            }

        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    };

    public Student getStudentById(int id){ return this.students.get(id); }

    public void deleteStudentById(int id) { this.students.remove(id); }

    public void updateStudent(Student student){
        Student chosenStudent = students.get(student.getId());
        chosenStudent.setCourse(student.getCourse());
        chosenStudent.setFirstName(student.getFirstName());
        chosenStudent.setLastName(student.getLastName());
        chosenStudent.setGrade(student.getGrade());

        students.put(student.getId(), chosenStudent);
    }
}
