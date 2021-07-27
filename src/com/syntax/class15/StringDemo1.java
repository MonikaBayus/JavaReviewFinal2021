package com.syntax.class15;

public class StringDemo1 {


    public static void main(String[] args) {

        String name = "Alec";//mostly used
        String name1 = new String("Alec"); //the same as above;

        System.out.println("-------------------------------------------");

        //length ->naumber of characters in a String Object
        System.out.println(name);
        System.out.println(name.length());
        //reassigning the values
        name = "    Alec";
        int len = name.length();
        System.out.println(len);

        System.out.println("-------------------------------------------");

        String var1 = "Hello";
        String s1 = var1.toUpperCase();
        System.out.println(s1);
        String s2 = var1.toLowerCase();
        System.out.println(s2);
        var1 = "Hello 123!";
        System.out.println(var1);
        System.out.println(var1.toUpperCase());


        System.out.println("-------------------------------------------");

        String str3 = "HOW ARE YOU";
        System.out.println(str3.toLowerCase());
        String a = "HU"+14;
        System.out.println(a);

        System.out.println("-------------------------------------------");

        String name3 = "Damian";
        System.out.println(name3.equals("Damian"));

        System.out.println("-------------------------------------------");

        String var = "This is a demo that contain *#*%^$#@!";
        System.out.println(var.contains("#"));
        if(var.contains("%") || var.contains("#")){
            System.out.println("%,# are not allowed");
        }
        System.out.println(var.contains("This is a demo of"));
        System.out.println(var.startsWith("contain"));
        System.out.println(var.endsWith("#"));

        System.out.println("-------------------------------------------");

        String name4 = "";
        System.out.println(name4.isEmpty());

        System.out.println("-------------------------------------------");

        String name6 = "       Monika      *    ";
        System.out.println(name6);
        System.out.println(name6.trim());

        System.out.println("-------------------------------------------");

        String name8 = "Roheem";
        //System.out.println(name8.charAt(5));
        for(int i=0; i<name8.length(); i++){
            System.out.println(name8.charAt(i));
            if(name8.charAt(i)== 'e'){
                System.out.println("found -> e");
            }
        }

        System.out.println("-------------------------------------------");

        String name9 = "Evelinalina";
        System.out.println(name9.charAt(3));
        int sum =0;
        for(int i=0; i<name9.length();i++){
            if(name9.charAt(i)=='e'){
                sum++;
            }
        }
        System.out.println(sum + " = e amount ");


        System.out.println("-------------------IndexOf------------------------");

        String conffusion = "Gulshoda";
        System.out.println(conffusion.indexOf('a'));


        System.out.println("-------------------Substring------------------------");

        String var3 = "Syntax is the best";
        System.out.println(var3.substring(5));
        System.out.println(var3.substring(7,9));


    }
}
