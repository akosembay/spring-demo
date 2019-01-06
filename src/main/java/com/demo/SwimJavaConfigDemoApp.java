package com.demo;

import com.demo.config.ApplicationConfiguration;
import com.demo.config.LoggerConfiguration;
import com.demo.impl.SwimCoach;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {


    public static void main(String[] args){

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(LoggerConfiguration.class, ApplicationConfiguration.class);

        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());
        System.out.println(swimCoach.getTeam());
        System.out.println(swimCoach.getEmail());
        // close the context
        context.close();
    }

}
