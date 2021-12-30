package com.example.aopdemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
@Component
@Aspect
public class Helper {
    @Pointcut("execution(public void show())")
    public void pointcut(){}

    @Before("pointcut()")
    public void log(){
        System.out.println("before function execution");
    }
    @After("pointcut()")
    public void afterLog(){
        System.out.println("after function execution");
    }
    @Around("pointcut()")
    public void aroundLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("before");
        proceedingJoinPoint.proceed();
        System.out.println("after");
    }
}
