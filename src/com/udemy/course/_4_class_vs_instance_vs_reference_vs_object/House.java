package com.udemy.course._4_class_vs_instance_vs_reference_vs_object;

public class House {

    private String colour ;

    public House(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public static void main(String[] args) {

        House blueHouse = new House("blue"); // Creating a reference called blueHouse
        House anotherHouse = blueHouse ; // Creating another reference to the same object in the memory. So now we have 2 references pointing to the same object in the memory.
        System.out.println(blueHouse.getColour());
        System.out.println(anotherHouse.getColour());

        anotherHouse.setColour("yellow"); // Changing the colour of the 2 references pointing to the same object in the memory.
        System.out.println(blueHouse.getColour());
        System.out.println(anotherHouse.getColour());

        House greenHouse =new House("green");
        anotherHouse = greenHouse ; // Now pointing to a different object in the memory.

        System.out.println(blueHouse.getColour());
        System.out.println(greenHouse.getColour());
        System.out.println(anotherHouse.getColour());

    }
}
