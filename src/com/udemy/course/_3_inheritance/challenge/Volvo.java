package com.udemy.course._3_inheritance.challenge;

public class Volvo extends Car {

    boolean isTankModeActivated ;
    double armourThickness ;

    public Volvo(String name, String size, boolean isTankModeActivated, double armourThickness) {
        super(name, size);
        this.isTankModeActivated = isTankModeActivated;
        this.armourThickness = armourThickness;
    }

    public boolean isTankModeActivated() {
        return isTankModeActivated;
    }

    public double getArmourThickness() {
        return armourThickness;
    }

}
