package com.udemy;

import com.udemy.course._1_classes.Car;

public class Main {

    public static void main(String[] args) {
        Car volvo = new Car();
        volvo.setModel("v_60");
        System.out.println("Model is " + volvo.getModel());
    }

}
