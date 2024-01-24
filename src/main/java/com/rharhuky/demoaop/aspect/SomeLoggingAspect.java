package com.rharhuky.demoaop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SomeLoggingAspect {

    @Before("execution(public void doIt())")
    public void beforeDoIt(){

        System.out.println("--- I've been wainting for you :DD ---");

    }

}
