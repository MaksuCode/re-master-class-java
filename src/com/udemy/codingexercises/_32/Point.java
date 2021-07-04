package com.udemy.codingexercises._32;

public class Point {

    private int x ;
    private int y ;

    public Point(){

    }

    public Point(int x , int y){
        this.x = x ;
        this.y = y ;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(int x , int y){
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y -y , 2));
    }

    // Here calling other distance method with 2 parameters and hence avoiding code multiplication.
    public double distance(){
        return distance(0 ,0);
    }

    public double distance(Point point){
        return distance(point.getX() , point.getY());
    }
}
