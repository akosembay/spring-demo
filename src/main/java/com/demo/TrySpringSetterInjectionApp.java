package com.demo;

import com.demo.impl.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TrySpringSetterInjectionApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);

        System.out.println(cricketCoach.getDailyWorkout());

        System.out.println(cricketCoach.getDailyFortune());

        System.out.println(cricketCoach.getEmailAddress());

        System.out.println(cricketCoach.getTeam());

        // close the context
        context.close();
    }
}
