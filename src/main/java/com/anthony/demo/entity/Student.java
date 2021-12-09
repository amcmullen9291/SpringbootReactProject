package com.anthony.demo.entity;

public class Student {
    private int id;
    private int grade;
    private String firstName;
    private String lastName;
    private String course;

    public Student(int id, String firstName, String lastName, int grade, String course){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.course = course;
    }

    public Student(){}  //default constructor

    public void setId(int id) { this.id = id; }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setGrade(int grade) { this.grade = grade; }

    public void setCourse(String course) { this.course = course; }

    public int getId() { return id; }

    public String getFirstName() { return firstName;}

    public String getLastName() { return lastName; }


    public int getGrade() { return grade; }

    public String getCourse() { return course; }
}
