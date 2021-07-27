package com.syntax.class15;

public class Task1 {
    public static void main(String[] args) {

      String userName = "Eva";
      String userPassword ="Eva12345678";
      String confirmPassword="Eva12345678";

      if(userName.isEmpty() || userPassword.isEmpty()) {
          System.out.println("UserName and password can't be empty");
      }else if(userPassword.length()<8) {
          System.out.println("password is too short");
      }else if(userPassword.equals(userName)) {
          System.out.println("Password can't be the same");
      }else if(!userPassword.equals(confirmPassword)){
          System.out.println("Password doesn't match");
      }else{
          System.out.println("Account created");
      }





    }
}
