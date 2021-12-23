package com.example.Calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(CalculatorApplication.class, args);
		Calculator calculator=context.getBean(Calculator.class);
		System.out.println("Addition:"+calculator.add());

		System.out.println("Subtraction:"+calculator.sub());
		System.out.println("Multiplication:"+calculator.mul());
		System.out.println("Division:"+calculator.div());
	}

}
