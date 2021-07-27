package com.syntax.class13;

public class Account {

    String username;
    String password;
    String accountNumber;
    double balance;
    boolean isLoggedIn;



    public void login(String username, String password){
        if(username.equals(username) && password.equals(password)){
            System.out.println("Welcome to Bank of America. Your Balance is " + balance);
        }
    }

    public void printInfo(){
        if(isLoggedIn){
            System.out.println("Account number is " + accountNumber + "Balance is "+ balance);
        }
    }

    public void printusernameAndPassword(String password1, String username1){
        System.out.println(password1 + " " +  username1);
        if(username1.equals("zaba123")){
            System.out.println("Hello zaba!");
        }else{
            System.out.println("By zaba!");
        }
    }
}
