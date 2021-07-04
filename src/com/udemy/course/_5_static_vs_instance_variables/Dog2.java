package com.udemy.course._5_static_vs_instance_variables;

public class Dog2 {

    private String name ;

    public Dog2(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("Dog's name is " + this.name);
    }

    public static void main(String[] args) {
        Dog2 rex = new Dog2("rex");
        Dog2 fluffy = new Dog2("fluffy");
        rex.printName();
        fluffy.printName();
    }
}
