package com.syntax.class14;

public class CalculatorTester {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int add = calculator.add(2,3);
        System.out.println(add);
        double sub = calculator.subs(10,5);
        int results = (int)calculator.subs(15.5,10);
        System.out.println(results);
        System.out.println(sub);
        double multiply = calculator.div(56.5,2.3);
        System.out.println(multiply);
    }


}
