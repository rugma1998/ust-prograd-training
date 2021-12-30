package com.example.aopdemo;

public class Phone {
    String model;
    String brand;

    public void setPhoneDetails(String model, String brand){
        this.model = model;
        this.brand = brand;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void display() {
        System.out.println("inside display");
    }
    public int show() {
        System.out.println("inside int show");
        return 2;
    }
}
