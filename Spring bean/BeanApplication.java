package com.example.Bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class BeanApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BeanApplication.class, args);
		System.out.println(context.getBeanDefinitionCount());
		String[] beanNames = context.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
	}
}








