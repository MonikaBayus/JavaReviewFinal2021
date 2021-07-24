package com.syntax.class13;

public class Dog {

    public String breed;
    public String size;
    public String color;
    public int age;

    public void bark (){

        System.out.println("ruff ruff");
    }

    public void sleep(){
        System.out.println("My dog is sleepy");
    }

    public void eat(){
        System.out.println("Likes to eat");
    }

    public void look(){
        System.out.println("Hi I ma a dog, my color is: " + color);
    }

    public static void main(String[] args) {

        Dog bulldog = new Dog();
        bulldog.age = 12;
        bulldog.color = "brown";
        bulldog.breed = "american";
        bulldog.bark();
        bulldog.sleep();
        bulldog.eat();
        bulldog.look();

        Dog lab = new Dog();
        lab.age = 5;
        lab.color = "black";
        lab.size = "big";
        lab.look();

    }
}
