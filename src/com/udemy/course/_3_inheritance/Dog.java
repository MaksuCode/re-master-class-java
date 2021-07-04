package com.udemy.course._3_inheritance;

public class Dog extends Animal{

    // Characteristic unique to Dog.class
    private int eyes ;
    private int legs ;
    private int tail ;
    private int teeth ;
    private String coat ;

    public Dog(String name, int size, int weight , int teeth , String coat ) {
        super(name, 1, 1, size, weight); // means that call the constructor of the base class we want to inherit from.
        // Here initializing other fields just related to Dog.class
        this.eyes = 2 ;
        this.legs = 4 ;
        this.tail = 1 ;
        this.teeth = teeth ;
        this.coat = coat ;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called.");
    }

    // Overriding a method in super class which is Animal.class
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    @Override
    public void move(int spped) {
        System.out.println("Dog.move() called");
        moveLegs(spped);
        super.move(spped);
    }

    public void walk(){
        System.out.println("Dog.walk() called.");
        super.move(5);     // The difference between line 52 and here is : Here we call the move method from super class. But in line 52 we call the Dog.move() method.
    }

    public void run(){
        System.out.println("Dog.run() called.");
        move(10);
    }
}
