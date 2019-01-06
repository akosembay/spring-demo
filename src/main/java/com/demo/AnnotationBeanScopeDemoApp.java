package com.demo;

import com.demo.interfaces.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args){
        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotation-applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println("Pointing to same object? " + result);
        System.out.println("Memory location for theCoach : " + theCoach);
        System.out.println("Memory location for alphaCoach : " + alphaCoach);

        // close the context
        context.close();
    }
}
