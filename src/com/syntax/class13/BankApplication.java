package com.syntax.class13;

public class BankApplication {

    public static void main(String[] args) {

      Account monikasAccount = new Account();
        monikasAccount.accountNumber = "123";
        monikasAccount.username = "Monika";
        monikasAccount.password = "pass123";
        monikasAccount.balance = 1400;
        //monikasAccount.login("Monika", "pass123");
        monikasAccount.printusernameAndPassword("zaba", "zaba123");


    }

}
