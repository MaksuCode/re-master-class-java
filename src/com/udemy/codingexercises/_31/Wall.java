package com.udemy.codingexercises._31;

public class Wall {

    private double width ;
    private double height ;

    public Wall(double width , double height){
        System.out.println("Constructor with parameters called.");
        if (width < 0){
            width = 0 ;
        }
        if (height <0){
            height = 0;
        }
        this.width = width ;
        this.height = height ;
    }

    public Wall(){
        this(0 ,0);
        System.out.println("Empty constructor called.");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <0){
            width = 0 ;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0){
            height = 0 ;
        }
        this.height = height;
    }

    public double getArea(){
        return this.height * this.width ;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(-1.25 , -1.25);
        System.out.println(wall.getHeight());
        System.out.println(wall.getWidth());

    }
}
