package com.syntax.class15;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter username");
        String username = scan.next();
        System.out.println("Please enter password");
        String password = scan.next();
        System.out.println("Please confirm password");
        String confirmpassword = scan.next();


        if (username.isEmpty() || password.isEmpty()) {
            System.out.println("Username and password can't be empty");
        } else if (password.length() < 8) {
            System.out.println("password is too short");
        } else if (password.equals(username)) {
            System.out.println("Password can't contain username");
        } else if (!password.equals(confirmpassword)) {
            System.out.println("Password doesn't match");
        } else {
            System.out.println("Username and password has been created");
        }

    }
}