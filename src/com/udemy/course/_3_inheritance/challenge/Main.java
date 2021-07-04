package com.udemy.course._3_inheritance.challenge;

public class Main {

    public static void main(String[] args) {
//        Car car = new Car("car" , "100");
//        car.move(60);
//        car.steer(12);
//
//        System.out.println("----------------------");
//        System.out.println(car.getCurrentDirection());
//        System.out.println(car.getCurrentSpeed());
//
//        car.stop();
//        System.out.println(car.getCurrentDirection());
//        System.out.println(car.getCurrentSpeed());

        Volvo volvo = new Volvo("V_60" , "1000" , true , 100);
        volvo.setDoor(4);
        volvo.move(90);
        volvo.steer(38);
        System.out.println("---------------");
        System.out.println(volvo.getCurrentSpeed());
        System.out.println(volvo.getCurrentDirection());
        System.out.println(volvo.getDoor());
        System.out.println(volvo.getGear());


    }
}
