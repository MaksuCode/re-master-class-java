package com.udemy.constructors;

public class VipCustomer {

    private String name ;
    private double creditLimit ;
    private String emailAddress ;

    public VipCustomer(String name , double creditLimit , String emailAddress){
        System.out.println("Constructor with 3 parameters called.");
        this.name = name ;
        this.creditLimit = creditLimit ;
        this.emailAddress = emailAddress ;
    }

    public VipCustomer(String name , String emailAddress){
        this(name , 999.00 , emailAddress);
        System.out.println("Constructor with 2 fields called.");
    }

    public VipCustomer(){
        this("Default Name" , 100.00 , "default@gmail.com");
        System.out.println("Empty constructor called.");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static void main(String[] args) {
        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName());
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getEmailAddress());
    }
}
