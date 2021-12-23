package com.example.Calculator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Value("${num1}")
    private double num1;

    @Value("${num2}")
    private double num2;


    public double add(){
        return num1+num2;
    }

    public double sub(){
        return num1-num2;
    }

    public double mul(){
        return num1*num2;
    }

    public double div(){
        return num1/num2;
    }
}
