package com.udemy.course._3_inheritance.challenge;

public class Vehicle {

    private String name ;
    private String size ;

    private double currentSpeed ;
    private double currentDirection ;

    public Vehicle(String name, String size, double currentSpeed, double currentDirection) {
        this.name = name;
        this.size = size;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void move(double speed){
        this.currentSpeed += speed;
        System.out.println("Vehicle.move() : New speed is " + this.currentSpeed);
    }

    public void stop(){
        this.currentSpeed = 0 ;
        System.out.println("Vehicle stopped.");
    }

    public void steer(double direction){
        this.currentDirection += direction;
        System.out.println("New direction is " + this.currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getCurrentDirection() {
        return currentDirection;
    }
}
