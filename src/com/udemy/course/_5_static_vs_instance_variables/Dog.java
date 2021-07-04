package com.udemy.course._5_static_vs_instance_variables;

public class Dog {

    private static String name ;

    public Dog(String name) {
        Dog.name = name ; // 'this' keyword can not be uses since 'name' is a static parameter
    }

    void printName(){
        System.out.println("Dog's name is " + name);
    }

    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        rex.printName();
        Dog fluffy = new Dog("fluffy"); // Here changing the static variables 'name'
        fluffy.printName();
        rex.printName(); // and then other instance has the same variable value
    }
}
