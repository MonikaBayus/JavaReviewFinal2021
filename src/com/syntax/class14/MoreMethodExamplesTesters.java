package com.syntax.class14;

public class MoreMethodExamplesTesters {

    public static void main(String[] args) {

        MoreMethodExamples m1 = new MoreMethodExamples();
        m1.text();
        System.out.println(m1.nextNum(20));

        m1.isRaining(false);

        //System.out.println(m1.isRaining(false); error we are not returning anything

        m1.printBatch9();


        int bigNum = m1.numbersBig(10, 7);
        System.out.println(bigNum);

        m1.oddEven(11);

        int [] arr = {10,39,3674};
        int arrayTotal = m1.myArray(arr);
        System.out.println(arrayTotal);

        System.out.println("------------------------");
        //Write a method that returns true if the string is mirror of itself otherwise it returns false;

       boolean res1 = m1.isMirror("aba");
        System.out.println(res1);
      boolean res2 =  m1.isMirror("cdesfg");
        System.out.println(res2);


    }
}