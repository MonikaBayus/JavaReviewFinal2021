package com.syntax.class13;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name:");
        String input = scan.next();

        System.out.println( "Your name is " +  input);


    }
}
