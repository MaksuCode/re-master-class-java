package com.udemy.course._3_inheritance.challenge;

public class Car extends Vehicle{

    private int door ;
    private int gear ;

    public Car(String name, String size) {
        super(name, size, 0 , 0);
        this.door = 4 ;
        this.gear = 1 ;
    }

    @Override
    public void move(double speed) {
        if (speed > 50){
            setGear(3);
        }else if (speed > 100){
            System.out.println(5);
        }
        super.move(speed);
        System.out.println("Car.move() : car moved with speed " + this.getCurrentSpeed() );
    }

    @Override
    public void stop() {
        setGear(0);
        super.stop();
        System.out.println("Car stopped.");
    }

    private void setGear (int gear){
        this.gear += gear ;
        System.out.println("Car now on " + this.gear + ". gear");
    }

    public int getDoor() {
        return door;
    }

    public int getGear() {
        return gear;
    }

    public void setDoor(int door) {
        this.door = door;
    }
}
