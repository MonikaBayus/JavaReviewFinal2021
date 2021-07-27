package com.syntax.class15;

public class StudentDemo {

    String name;
    int age;
    String studentId;
    String schoolName;

    void study(){
        System.out.println(name + " is a student in " + schoolName);
    }

    void payTuition(){
        System.out.println(name + " pays the tuition ");
    }

    int getStudentAge(){
        return age;
    }
}
