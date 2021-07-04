package com.udemy.course._3_inheritance;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Karabas" , 1 , 10 , 2 ,  "silky") ;
//        dog.eat(); // Inhering eat() method from Animal.class
        dog.walk();
        dog.walk();
    }
}
