package com.syntax.class14;

public class MoreMethodExamples {

    public void text(){
        System.out.println("Hi");
    }

   public int nextNum(int num1){
        return num1 *2;
    }

    public void isRaining(boolean isRaining){
        if(isRaining){
            System.out.println("Take umbrella");
        }else{
            System.out.println("Please go for a walk");
        }
    }


    public void printBatch9() {
        for (int i = 0; i < 5; i++) {
            System.out.println("9 is great");
        }
    }

    public int numbersBig(int num1, int num2) {

            if(num1>num2){
                return num1;
            }else{
                return num2;
            }
        }

     public void oddEven(int num1){
        if(num1%2!=0){
            System.out.println("Number is odd");
        }else{
            System.out.println("Number is even");
        }
     }


     public int myArray(int []arr){
        int sum=0;
        for(int element:arr){
           sum=sum+element;
        }
       return sum;

     }

    //Write a method that returns true if the string is mirror of itself otherwise it returns false;
    public boolean isMirror(String str){

        String newString = "";

        for(int i = str.length()-1; i>=0; i--){
            System.out.println(i+ " " + str.charAt(i));
            newString +=str.charAt(i);
        }
        System.out.println(newString);
        if(str.equals(newString)){
            return true;
        }else{
            return false;
        }



    }


    }



