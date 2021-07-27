package com.syntax.class15;

import com.syntax.class14.Student;

public class StudentDemoTest {
    public static void main(String[] args) {

        StudentDemo ram = new StudentDemo();
        ram.name = "Ram";
        ram.age = 20;
        ram.schoolName = "Syntax";

        ram.study();
        ram.payTuition();

        System.out.println("----------------------------");

        StudentDemo aimen = new StudentDemo();
        aimen.name = "Aimen";
        aimen.age = 40;
        aimen.schoolName = "Techno";

        aimen.study();
        aimen.study();


    }
}
