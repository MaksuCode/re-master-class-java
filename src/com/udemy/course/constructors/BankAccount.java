package com.udemy.course.constructors;

public class BankAccount {

    private String accountNumber ;
    private double balance ;
    private String customerName ;
    private String email ;
    private String phoneNumber ;

    public BankAccount(){
        this("12333444" , 50.0 , "Default name" , "Default email" , "Default phone number" );   // Here calling major constructor and setting some default parameters to it.
        System.out.println("Empty constructor called.");
    }

    // This is our major constructor. Here all the fields of the object is updated. And other constructors call this consturctor.
    public BankAccount(String accountNumber , double balance , String customerName , String email , String phoneNumber){
        this.accountNumber = accountNumber ;
        this.balance = balance ;
        this.customerName = customerName ;
        this.email = email ;
        this.phoneNumber = phoneNumber ;
        System.out.println("Constructor with parameters called.");
    }

    public BankAccount(String customerName , String email , String phoneNumber){
        this("1234567890" , 0.00 , customerName , email , phoneNumber); // Here calling major constructor with this() expression. And setting some parameters as default.
    }

    public void depositFund(double amount){
        if (amount <0){
            System.out.println("Please enter a valid value!");
        }else {
            this.balance += amount ;
            System.out.println("You have successfully deposited " + amount + " € to your account");
            System.out.println("------------------------------------------");
            System.out.println("Your new balance is " + this.balance + " €");
        }
    }

    public void withdrawFund(double amount){
        if (amount < 0){
            System.out.println("Please enter a valid value!");
        }else if (amount > balance){
            System.out.println("You have insufficient balance to withdraw " + amount + " €.");
        }else {
            this.balance -= amount ;
            System.out.println("You have withdrawn " + amount + " € successfully." );
        }
        System.out.println("------------------------------------------");
        System.out.println("Your balance is : " + this.balance + " €");
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {
//        BankAccount account = new BankAccount();
//        account.setAccountNumber("16460729701");
//        account.setCustomerName("Mustafa");
//        account.setEmail("mustafa.aksu@getir.com");
//        account.setPhoneNumber("55532244");
//        account.setBalance(100);
//        account.depositFund(32);
//
//        BankAccount maxsAccount = new BankAccount("123456789" , 1000.0 , "Max" , "max@redbull.com" , "43255667");
//        maxsAccount.withdrawFund(10000);
//
//        BankAccount lastAccount = new BankAccount();
//        System.out.println(lastAccount.getAccountNumber());
//        System.out.println(lastAccount.getCustomerName());
//        System.out.println(lastAccount.getPhoneNumber());

        BankAccount i̇pekAccount = new BankAccount("İpek Bilge" , "ipekb@gmail.com" ,"5443322");
        System.out.println(i̇pekAccount.getAccountNumber());
        System.out.println(i̇pekAccount.getBalance());
        System.out.println(i̇pekAccount.phoneNumber);

    }
}
