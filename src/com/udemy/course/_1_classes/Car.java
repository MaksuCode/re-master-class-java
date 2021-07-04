package com.udemy.course._1_classes;

public class Car {

    public int doors ;
    private int wheels ;
    private String model ;
    private String engine ;
    private String colour ;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("v_40") || validModel.equals("s_90")){    //Implementing a validation in setter method.
            this.model = model ;
        }else {
            this.model = "Unknown" ;
        }
    }

    public String getModel(){
        return this.model ;
    }






}
