package com.syntax.class14;

public class Student {

    public String getGrade(int score) {

        if(score>90) {
            return "A";
        }else if (score>80) {
            return "B";
        }else if(score>70) {
            return "C";
        }else if(score>50) {
            return "D";
        }else{
            return "F";

        }

    }

    public static void main(String[] args) {

       Student student = new Student();
       String res  = student.getGrade(85);
       System.out.println(res);

    }
}
